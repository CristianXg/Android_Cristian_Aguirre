package com.example.aguirre_cristian.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aguirre_cristian.R;
import com.example.aguirre_cristian.modelos.Docente;

import java.util.List;

public class DocenteAdapter extends RecyclerView.Adapter<DocenteAdapter.ViewHolderDocente> implements View.OnClickListener {

    List<Docente> lista;
    private View.OnClickListener listener;

    public DocenteAdapter(List<Docente> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolderDocente onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_docente, null);
        return new ViewHolderDocente(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDocente holder, int position) {
        holder.cedula.setText(lista.get(position).getCedula());
        holder.apellidos.setText(lista.get(position).getApellidos());
        holder.nombres.setText(lista.get(position).getNombres());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    @Override
    public void onClick(View v) {

    }

    public static class ViewHolderDocente extends RecyclerView.ViewHolder {
        TextView cedula, nombres, apellidos;

        public ViewHolderDocente(@NonNull View itemView) {
            super(itemView);
            cedula = itemView.findViewById(R.id.lblCedulaRecycler);
            nombres = itemView.findViewById(R.id.lblNombresRecycler);
            apellidos = itemView.findViewById(R.id.lblApellidosRecycler);
        }
    }
}
