package com.example.wemeethere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class twentyfourpageActivity extends AppCompatActivity {
    private Button btn24_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twentyfourpage);

        btn24_1 = findViewById(R.id.btn24_1);

        btn24_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환
                Intent intent = new Intent(twentyfourpageActivity.this, twentyfiveActivity.class);
                startActivity(intent); // 액티비티 이동.
            }
        });



    }
}