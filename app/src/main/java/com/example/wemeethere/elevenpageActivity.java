package com.example.wemeethere;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class elevenpageActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private Button btn11_1; // NEXT


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elevenpage);

        datePicker = findViewById(R.id.datePicker);
        btn11_1 = findViewById(R.id.btn11_1);

        btn11_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = datePicker.getYear();
                int month = datePicker.getMonth();
                int dayOfMonth = datePicker.getDayOfMonth();
                Calendar selectedDate = Calendar.getInstance();
                selectedDate.set(year, month, dayOfMonth);

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                String formattedDate = dateFormat.format(selectedDate.getTime());

                // 화면 전환
                Intent intent = new Intent(elevenpageActivity.this, twelvepageActivity.class);
                intent.putExtra("selected_date", formattedDate);
                startActivity(intent);
            }
        });
    }
}