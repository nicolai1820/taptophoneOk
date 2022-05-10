package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class sendmailok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendmailok);
        getSupportActionBar().hide();
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendmailok.this.startActivity(new Intent(sendmailok.this, homeventa.class));
            }
        });
    }
}