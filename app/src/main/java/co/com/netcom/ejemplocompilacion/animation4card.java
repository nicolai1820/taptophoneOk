package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class animation4card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation4card);
        getSupportActionBar().hide();
        findViewById(R.id.gifImageView31).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation4card.this.startActivity(new Intent(animation4card.this,Anulacionok.class));
            }
        });
    }
}