package com.e.uts_aplikasi_krs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnExit;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);

            btnExit = (Button) findViewById(R.id.btnExit);

            btnExit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //perintah untuk mengakhiri aplikasi
                    finish();
                }
            });

        }
    }
    }
}
