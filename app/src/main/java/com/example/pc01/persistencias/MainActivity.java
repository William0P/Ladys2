package com.example.pc01.persistencias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b2= (Button) findViewById(R.id.b2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b2:
                Intent in=new Intent(this,ContactosActivity.class);
                startActivity(in);
                break;
            case R.id.b1:
                Intent in2=new Intent(this,ContactosActivity.class);
                startActivity(in2);
                break;
        }
    }
}
