package co.com.netcom.ejemplocompilacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class animation2card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2card);
        getSupportActionBar().hide();
        findViewById(R.id.gifImageView31).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation2card.this.startActivity(new Intent(animation2card.this,transaccionOK.class));
            }
        });
    }
}