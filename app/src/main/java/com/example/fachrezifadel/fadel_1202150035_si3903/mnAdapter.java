package com.example.fachrezifadel.fadel_1202150035_si3903;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by USER on 24/02/2018.
 */

public class mnAdapter extends RecyclerView.Adapter<mnAdapter.menuholder> {
    CardView cd;
    private Context context;
    private List<pilihAir> listmenu;

    public mnAdapter(Context context, List<pilihAir> listmenu){
        this.context = context;
        this.listmenu = listmenu;
    }

    @Override
    public menuholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.menucv, parent, false);
        menuholder holder = new menuholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder (menuholder holder, int position) {
        pilihAir data = listmenu.get(position);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            holder.rl.setBackground(holder.rl.getResources().getDrawable(data.getFoto()));
        }
        holder.rl.setTag(data.getFoto());
        holder.nama.setText(data.getNama());
        holder.detail.setText(data.getDetail());
    }

    @Override
    public int getItemCount() {
        return listmenu.size();
    }
    class menuholder extends RecyclerView.ViewHolder{
        RelativeLayout rl;
        ImageView foto;
        TextView nama, detail;

        public menuholder(View itemView){
            super(itemView);
            foto = itemView.findViewById(R.id.fotomenu);
            nama = itemView.findViewById(R.id.namaAir);
            detail = itemView.findViewById(R.id.detailAir);
            rl = itemView.findViewById(R.id.layout1);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ganti = new Intent(context, DetailAir.class);
                    ganti.putExtra("nama", nama.getText());
                    ganti.putExtra("detail", detail.getText());
                    ganti.putExtra("foto", rl.getTag().toString());
                    context.startActivity(ganti);
                }
            });
        }
    }
}
