package com.kyuwankim.android.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv ;
    Button btn;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv.setVisibility(View.INVISIBLE);
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("aaaaa");
                tv.setVisibility(View.VISIBLE);
            }
        });
    }
}
