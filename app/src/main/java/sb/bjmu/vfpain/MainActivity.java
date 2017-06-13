package sb.bjmu.vfpain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static String datox[]={"o","o","o","o","x","x","x","x"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //init buttons
        Button btneq=(Button)findViewById(R.id.btn_eq);
        datox[0]="x";

        btneq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,datox[0],Toast.LENGTH_LONG).show();
            }
        });

    }

}
