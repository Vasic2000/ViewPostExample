package ru.vasic2000.viewpostexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMain, tvMain2, tvMain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = findViewById(R.id.textMain);
        tvMain2 = findViewById(R.id.textMain2);
        tvMain3 = findViewById(R.id.textMain3);

        WorkingClass workingClass = new WorkingClass(this);
        Thread thread = new Thread(workingClass);
        thread.start();

        WorkingClass2 workingClass2 = new WorkingClass2(this);
        Thread thread2 = new Thread(workingClass2);
        thread2.start();

        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                // обновить UI отсюда
            }
        });
    }


}