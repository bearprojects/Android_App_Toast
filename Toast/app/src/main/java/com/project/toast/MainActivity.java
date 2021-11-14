package com.project.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Toast");

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);

        btn1.setOnClickListener(btnClick);
        btn2.setOnClickListener(btnClick);
        btn3.setOnClickListener(btnClick);
        btn4.setOnClickListener(btnClick);
    }

    View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn1:
                    toast = Toast.makeText(MainActivity.this,"HI，我是toast1", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM, 0,0);
                    toast.show();
                    break;

                case R.id.btn2:
                    toast = Toast.makeText(MainActivity.this,"Hi，我是toast2", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.RIGHT, 0,-500);
                    toast.show();
                    break;

                case R.id.btn3:
                    if(toast != null)
                        toast.cancel();

                    toast = Toast.makeText(MainActivity.this,"HI，我是toast3\n可以與toast4快速切換", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM, 0,0);
                    toast.show();
                    break;

                case R.id.btn4:
                    if(toast != null)
                        toast.cancel();

                    toast = Toast.makeText(MainActivity.this,"Hi，我是toast4\n可以與toast3快速切換", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM, 0,-500);
                    toast.show();
                    break;
            }
        }
    };
}
