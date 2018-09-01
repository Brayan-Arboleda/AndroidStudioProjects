package brayan.cartavirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ActivityEntrada extends AppCompatActivity {

    ListView lista ;
    String [][] datos = {{"Barquita de Aguacate","7500","4.5"}, {"Wontos Fritos","6500","4.3"}};

    int[] datosImg = {R.drawable.barquita,R.drawable.wontos};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);

        lista = (ListView)findViewById(R.id.Lista);
        lista.setAdapter(new Adaptador(this,datos,datosImg));


    }
}
