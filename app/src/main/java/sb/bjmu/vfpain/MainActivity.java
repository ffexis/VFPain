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
            Log.e(TAG,"Wrong VFH("+r_nvfh+") or NOX("+r_nox+")");
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
            txtres.setText("0.0");
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
            txtres.setText("0.0");
            txtvfh.setText(this.getString(R.string.vfh)+" "+String.valueOf(r_nvfh));
            Toast.makeText(MainActivity.this,this.getString(R.string.toast_vfr),Toast.LENGTH_SHORT).show();
            //res error
        }else if(r_nvfh==0&&!(r_nox==0)){
            txtvfh.setText(this.getString(R.string.vfh_init));
            txtres.setText("0.0");
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
    //plus an o/x to VF TEST RECORD
    public void plus(char a){
        if(nox>=0&&nox<10){
            nox++;
            switch (a){
                case 'o':
                    datox[nox-1]="o";
                    break;
                case 'x':
                    datox[nox-1]="x";
                    break;
                default:
                    Log.d(TAG, "plus: incorrect parameter");
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //setdata();
        //get button objects
        Button btneq=(Button)findViewById(R.id.btn_eq);
        Button btnc=(Button)findViewById(R.id.btn_backsp);
        Button btn1=(Button)findViewById(R.id.btn_p1);
        Button btn2=(Button)findViewById(R.id.btn_p2);
        Button btn3=(Button)findViewById(R.id.btn_p3);
        Button btn4=(Button)findViewById(R.id.btn_p4);
        Button btn5=(Button)findViewById(R.id.btn_p5);
        Button btn6=(Button)findViewById(R.id.btn_p6);
        Button btn7=(Button)findViewById(R.id.btn_p7);
        Button btn8=(Button)findViewById(R.id.btn_p8);
        Button btno=(Button)findViewById(R.id.btn_o);
        Button btnx=(Button)findViewById(R.id.btn_x);
        //button equal
        btneq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "(BTNEQ_CLICK)DATOX:"+composer(nox,datox));
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        //button clear
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nox >= 1) {nox--;}
                Log.d(TAG, "(BTNC_CLICK)DATOX: "+composer(nox,datox));
                ResUpdate(nvfh, result, nox, datox);
            }
        });
        //button clear long click
        btnc.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nox=0;
                nvfh=0;
                for(int i=0;i<=9;i++){
                    datox[i]="";
                }
                Log.d(TAG, "(BTNC_LONGCLICK)DATOX: "+composer(nox,datox));
                ResUpdate(nvfh, result, nox, datox);
                return true;
            }
        });
        //button VFH N
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvfh=1;
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvfh=2;
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvfh=3;
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvfh=4;
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvfh=5;
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvfh=6;
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvfh=7;
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvfh=8;
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus('o');
                ResUpdate(nvfh,result,nox,datox);
            }
        });
        btnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus('x');
                ResUpdate(nvfh,result,nox,datox);
            }
        });


    }
    /*VF TEST Calculator
    public float calc(int c_nvfh, int c_nox, String[] c_datox){

    }*/


}
