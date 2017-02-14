package vn.edu.hust.set.dungdao.handlingclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button btnClick;
    EditText A, B;
    int nmbA, nmbB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = (Button) findViewById(R.id.btn_sum);
        A = (EditText) findViewById(R.id.edtA);
        B = (EditText) findViewById(R.id.edtB);
        

        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!A.getText().toString().isEmpty()&& !B.getText().toString().isEmpty()){
                    nmbA = Integer.parseInt(A.getText().toString());
                    nmbB = Integer.parseInt(B.getText().toString());
                    Toast.makeText(MainActivity.this, "Tong cua "+ nmbA+ " va "+ nmbB + " la : " + (nmbB+nmbA), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Vui long nhap so hop le", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnClick.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Day la su kien LongClick Listener", Toast.LENGTH_SHORT).show();
                return false;
            }
        });


    }


}






