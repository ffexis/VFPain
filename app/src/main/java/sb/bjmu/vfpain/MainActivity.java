package sb.bjmu.vfpain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //init static variables
    static String[] datox=new String[8];
    static int nox=0,nvfh=0;
    static float result;
    private static final String TAG = "MainActivity";//LOG TAG
    //UI Updater
    public void ResUpdate(int r_nvfh, float r_result,int r_nox, String r_ox[]){
        if(r_nvfh<=0||r_nvfh>8||r_nox<=0||r_nox>10){
            Log.e("MainActivity","Wrong VFH("+r_nvfh+") or NOX("+r_nox+")");
            return;//parameters check
        }else {
            //von Frey hair updates
            TextView txtvfh=(TextView)findViewById(R.id.text_pinres);
            txtvfh.setText(this.getString(R.string.vfh)+" "+String.valueOf(r_nvfh));
            //Result updates
            TextView txtres=(TextView)findViewById(R.id.text_res);
            txtres.setText(String.valueOf(r_result));
            //Record updates
            TextView txtox0=(TextView)findViewById(R.id.text_ox0);
            TextView txtox1=(TextView)findViewById(R.id.text_ox1);
            TextView txtox2=(TextView)findViewById(R.id.text_ox2);
            TextView txtox3=(TextView)findViewById(R.id.text_ox3);
            TextView txtox4=(TextView)findViewById(R.id.text_ox4);
            TextView txtox5=(TextView)findViewById(R.id.text_ox5);
            TextView txtox6=(TextView)findViewById(R.id.text_ox6);
            TextView txtox7=(TextView)findViewById(R.id.text_ox7);
            TextView txtox8=(TextView)findViewById(R.id.text_ox8);
            TextView txtox9=(TextView)findViewById(R.id.text_ox9);
            r_nox--;
            for(int i=0;i<=9;i++) {
                switch (i){
                    case 0:
                        if(i>r_nox){txtox0.setText("");}
                        else{txtox0.setText(r_ox[i].toUpperCase());}
                        break;
                    case 1:
                        if(i>r_nox){txtox1.setText("");}
                        else{txtox1.setText(r_ox[i].toUpperCase());}
                        break;
                    case 2:
                        if(i>r_nox){txtox2.setText("");}
                        else{txtox2.setText(r_ox[i].toUpperCase());}
                        break;
                    case 3:
                        if(i>r_nox){txtox3.setText("");}
                        else{txtox3.setText(r_ox[i].toUpperCase());}
                        break;
                    case 4:
                        if(i>r_nox){txtox4.setText("");}
                        else{txtox4.setText(r_ox[i].toUpperCase());}
                        break;
                    case 5:
                        if(i>r_nox){txtox5.setText("");}
                        else{txtox5.setText(r_ox[i].toUpperCase());}
                        break;
                    case 6:
                        if(i>r_nox){txtox6.setText("");}
                        else{txtox6.setText(r_ox[i].toUpperCase());}
                        break;
                    case 7:
                        if(i>r_nox){txtox7.setText("");}
                        else{txtox7.setText(r_ox[i].toUpperCase());}
                        break;
                    case 8:
                        if(i>r_nox){txtox8.setText("");}
                        else{txtox8.setText(r_ox[i].toUpperCase());}
                        break;
                    case 9:
                        if(i>r_nox){txtox9.setText("");}
                        else{txtox9.setText(r_ox[i].toUpperCase());}
                        break;
                }
            }

                    }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //init buttons
        Button btneq=(Button)findViewById(R.id.btn_eq);
        datox[0]="x";
        datox[1]="o";
        datox[2]="o";

        btneq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,datox[0],Toast.LENGTH_LONG).show();
                ResUpdate(1,1.10f,3,datox);
            }
        });


    }


}
