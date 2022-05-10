package co.com.netcom.ejemplocompilacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class olvidopass1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvidopass1);
        getSupportActionBar().hide();
        findViewById(R.id.imageButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                olvidopass1.this.startActivity(new Intent(olvidopass1.this,login1ok.class));
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                olvidopass1.this.startActivity(new Intent(olvidopass1.this,Newpass1.class));
            }
        });
    }
}