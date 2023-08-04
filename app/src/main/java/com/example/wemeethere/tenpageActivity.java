package com.example.wemeethere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tenpageActivity extends AppCompatActivity {
    private Button btn10_1; // 가능
    private Button btn10_2; // 불가능
    private Button btn10_3; // 다음

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tenpage);

        btn10_1=findViewById(R.id.btn10_1);
        btn10_2=findViewById(R.id.btn10_2);
        btn10_3=findViewById(R.id.btn10_3);

        btn10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 화면 전환
                Intent intent = new Intent(tenpageActivity.this, elevenpageActivity.class);
                startActivity(intent);
            }
        });
    }
}