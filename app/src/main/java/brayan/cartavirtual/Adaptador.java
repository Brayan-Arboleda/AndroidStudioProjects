package brayan.cartavirtual;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;
    Context context;
    String[][] datos;
    int[] datosImg;

    public Adaptador(Context context,String[][] datos,int[] datosImg){
        this.context=context;
        this.datos=datos;
        this.datosImg=datosImg;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_lista_entrada, null);
        TextView txtTitulo = (TextView)vista.findViewById(R.id.txtTitulo);
        TextView txtPrecio = (TextView)vista.findViewById(R.id.txtPrecio);
        ImageView imagen = (ImageView)vista.findViewById(R.id.miImagen);
        RatingBar calificacion = (RatingBar)vista.findViewById(R.id.ratingBarEntrada);
        txtTitulo.setText(datos[i][0]);
        txtPrecio.setText("Precio "+datos[i][1]);
        imagen.setImageResource(datosImg[i]);
        calificacion.setProgress(Integer.valueOf(datos[i][2]));
        imagen.setTag(i);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(context, VisorImagen.class);
                visorImagen.putExtra("IMG",datosImg[(Integer)v.getTag()]);
                context.startActivity(visorImagen);
            }
        });
        return vista;
    }


    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
