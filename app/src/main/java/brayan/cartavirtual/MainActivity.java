package brayan.cartavirtual;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnUbicacion;
    private Button btnVerMenu;
    private Button btnReservar;
    private Button btnCalificar;
    //private static final String whatsapp = "com.whatsapp";
    private String telefono = "3147332744";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnUbicacion=(Button)findViewById(R.id.btnUbicacion);
        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,MapsActivity2.class);
                startActivity(intent);
            }
        });

        btnVerMenu=(Button)findViewById(R.id.btnVerMenu);
        btnVerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityCarta.class);
                startActivity(intent);
            }
    });

        btnReservar=(Button)findViewById(R.id.btnReservar);
        btnReservar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
            //startActivity(intent);
            Uri uri = Uri.parse("smsto:"+telefono);
            Intent intent  = new Intent(Intent.ACTION_SENDTO,uri);
            intent.setPackage("com.whatsapp");
            startActivity(intent);
        }
        });

        btnCalificar=(Button)findViewById(R.id.btnCalificar);
        btnCalificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityCalificar.class);
                startActivity(intent);
            }
        });



    }

}
