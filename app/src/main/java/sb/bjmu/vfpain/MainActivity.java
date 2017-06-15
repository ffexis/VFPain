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
    static String[] datox=new String[10];
    static int nox=0,nvfh=0;
    static float result;
    private static final String TAG = "MainActivity";//LOG TAG
     //UI Updater
    public void ResUpdate(int r_nvfh, float r_result,int r_nox, String[] r_ox){
        //get textview objects
        TextView txtvfh=(TextView)findViewById(R.id.text_pinres);
        TextView txtres=(TextView)findViewById(R.id.text_res);
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
        if(r_nvfh<0||r_nvfh>8||r_nox<0||r_nox>10){
            Log.e("MainActivity","Wrong VFH("+r_nvfh+") or NOX("+r_nox+")");
            //return;//parameters check
        }else if(r_nox==0&&r_nvfh==0) {
            txtox0.setText("");
            txtox1.setText("");
            txtox2.setText("");
            txtox3.setText("");
            txtox4.setText("");
            txtox5.setText("");
            txtox6.setText("");
            txtox7.setText("");
            txtox8.setText("");
            txtox9.setText("");
            txtres.setText(this.getString(R.string.result_init));
            txtvfh.setText(this.getString(R.string.vfh_init));//hold c button
        }else if(r_nox==0&&!(r_nvfh==0)){
            txtox0.setText("");
            txtox1.setText("");
            txtox2.setText("");
            txtox3.setText("");
            txtox4.setText("");
            txtox5.setText("");
            txtox6.setText("");
            txtox7.setText("");
            txtox8.setText("");
            txtox9.setText("");
            txtres.setText(this.getString(R.string.result_err));
            txtvfh.setText(this.getString(R.string.vfh)+" "+String.valueOf(r_nvfh));
            Toast.makeText(MainActivity.this,"Input von Frey Test record first.",Toast.LENGTH_SHORT).show();
            //res error
        }else if(r_nvfh==0&&!(r_nox==0)){
            txtvfh.setText(this.getString(R.string.vfh_init));
            txtres.setText(this.getString(R.string.vfh_init));
            r_nox--;//parameter r_nox indicates the number of test records, in order to use it in following code, -1
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
            }//for condition NOT SELECT VFH
        }else {
            //von Frey hair updates
            txtvfh.setText(this.getString(R.string.vfh)+" "+String.valueOf(r_nvfh));
            //Result updates
            txtres.setText(String.valueOf(r_result));
            //Record updates
            //get textview objects
            r_nox--;//parameter r_nox indicates the number of test records, in order to use it in following code, -1
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
    //composer for record of von Frey Test record
    public String composer(int r_nox, String[] r_ox){
        String sox = "";
        for(int i=1;i<=r_nox;i++){
            sox+=r_ox[i-1];
        }
        return sox;
    }
    //test data method
    public void setdata(){
        datox[0]="x";
        datox[1]="o";
        datox[2]="o";
        nox=3;
        nvfh=5;
        result=3.233f;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setdata();
        //init buttons
        Button btneq=(Button)findViewById(R.id.btn_eq);
        Button btnc=(Button)findViewById(R.id.btn_backsp);
        btneq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setdata();
                Toast.makeText(MainActivity.this,composer(3,datox),Toast.LENGTH_SHORT).show();
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nox >= 1) {nox--;}
                Toast.makeText(MainActivity.this, composer(nox, datox), Toast.LENGTH_SHORT).show();
                ResUpdate(nvfh, result, nox, datox);
            }
        });
        btnc.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nox=0;
                nvfh=0;
                for(int i=0;i<=9;i++){
                    datox[i]="";
                }
                Toast.makeText(MainActivity.this, composer(nox, datox), Toast.LENGTH_SHORT).show();
                ResUpdate(nvfh, result, nox, datox);
                return true;
            }
        });


    }


}
