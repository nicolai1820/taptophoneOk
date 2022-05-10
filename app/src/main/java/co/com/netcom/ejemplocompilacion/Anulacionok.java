package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Anulacionok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anulacionok);
        getSupportActionBar().hide();
        findViewById(R.id.button17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Anulacionok.this.startActivity(new Intent(Anulacionok.this,sendmail.class));
            }
        });
        findViewById(R.id.button18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Anulacionok.this.startActivity(new Intent(Anulacionok.this,homeventa.class));
            }
        });
    }
}