package com.example.wijaya.resepmasakanjawa;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Wijaya on 04-Oct-17.
 */

public class resepAdapter extends RecyclerView.Adapter<resepAdapter.ResepViewHolder> {
    private Context context;
    private ArrayList<resep> Resep;

    public resepAdapter(Context context, ArrayList<resep> resep) {
        this.context = context;
        this.Resep = resep;
    }

    @Override
    public resepAdapter.ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_resep,parent,false);
        return new ResepViewHolder(view);
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder {
        TextView deskripsi;
        TextView namaResep;
        public ResepViewHolder(View itemView) {
            super(itemView);
            namaResep = (TextView)itemView.findViewById(R.id.nama_makanan);
            deskripsi = (TextView)itemView.findViewById(R.id.deskripsi);
        }
    }

    @Override
    public void onBindViewHolder(resepAdapter.ResepViewHolder holder, final int position) {
        holder.namaResep.setText(Resep.get(position).getJudulresep());
        holder.deskripsi.setText(Resep.get(position).getDeskripsimasakan());

        holder.namaResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,DetailResepactivity.class);
                i.putExtra("gambar", Resep.get(position).getGambar());
                i.putExtra("detailresep", Resep.get(position).getIsiresep());
                i.putExtra("menuBar", Resep.get(position).getMenubar());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {return Resep.size();}
}
