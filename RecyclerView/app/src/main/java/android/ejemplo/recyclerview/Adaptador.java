package android.ejemplo.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter <Adaptador.miHolder> {
    private List<Encapsulador> entradas;

    public Adaptador(List<Encapsulador> entradas){
        this.entradas=entradas;
    }

    @NonNull
    @Override
    public miHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carta, viewGroup, false);
        return new miHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull miHolder holder, int position) {
        holder.imagen.setImageResource(entradas.get(position).getIdImagen());
        holder.titulo.setText(entradas.get(position).getTextoTitulo());
        holder.texto.setText(entradas.get(position).getTextoContenido());
    }

    @Override
    public int getItemCount() {
        return entradas.size();
    }

    public static class miHolder extends RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView titulo;
        public TextView texto;
        public miHolder (View vista){
            super(vista);
            imagen = (ImageView) vista.findViewById(R.id.imagen);
            titulo = (TextView) vista.findViewById(R.id.titulo);
            texto = (TextView) vista.findViewById(R.id.texto);
        }
    }

}
