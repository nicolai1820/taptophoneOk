package co.com.netcom.ejemplocompilacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login1ok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1ok);
        getSupportActionBar().hide();
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login1ok.this.startActivity(new Intent(login1ok.this,intro1.class));
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login1ok.this.startActivity(new Intent(login1ok.this,olvidopass1.class));
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login1ok.this.startActivity(new Intent(login1ok.this,registro1.class));
            }
        });
    }
}