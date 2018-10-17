package com.tareqrobin.radiogbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rdg;
    RadioButton rdb;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdg=(RadioGroup)findViewById(R.id.radg);
        submit=(Button)findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=rdg.getCheckedRadioButtonId();
                rdb=(RadioButton)findViewById(selectedId);
                Toast.makeText(MainActivity.this,rdb.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
