package brayan.cartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCarta extends AppCompatActivity {

    private Button btnEntradas;
    private Button btnPlatoFuerte;
    private Button btnPostres;
    private Button btnLicores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);

        btnEntradas=(Button)findViewById(R.id.btnEntradas);
        btnEntradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCarta.this,ActivityEntrada.class);
                startActivity(intent);
            }
        });

        btnPlatoFuerte=(Button)findViewById(R.id.btnPlatoFuerte);
        btnPlatoFuerte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCarta.this,ActivityPlatoFuerte.class);
                startActivity(intent);
            }
        });

        btnPostres=(Button)findViewById(R.id.btnPostres);
        btnPostres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCarta.this,ActivityPostres.class);
                startActivity(intent);
            }
        });

        btnLicores=(Button)findViewById(R.id.btnLicores);
        btnLicores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCarta.this,ActivityLicores.class);
                startActivity(intent);
            }
        });
    }
}
