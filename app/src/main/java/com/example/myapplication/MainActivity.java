package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     EditText ethoTen;
     Button btNhap,btShow;
     String ten="";
     ListView LV;
     Adapter adt = null;
     ArrayList<TT> Arr = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        xuly();
    }

    public void anhxa(){
        ethoTen.findViewById(R.id.etnhaphoten);
        btNhap.findViewById(R.id.btnhap);
        btShow.findViewById(R.id.bthienthii);
    }

    public void xuly(){
        adt = new Adapter(MainActivity.this,R.layout.dongdulieu, Arr);
        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ten = ethoTen.getText().toString();
                int id = 0;
                TT tt1 = new TT(id,ten);
                Arr.add(tt1);
                LV.setAdapter(adt);
            }
        });
    }

   // huu nam bg
    //ha

    // Nghiem THi Hong

}