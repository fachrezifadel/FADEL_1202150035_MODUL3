package com.example.fachrezifadel.fadel_1202150035_si3903;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DaftarAir extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<pilihAir> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        setTitle("List Air"); //set title untuk screennya

        //untuk meng INIT kan recyclerview dan adapternya//
        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);

        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(DaftarAir.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(DaftarAir.this, 1));
        }
        initdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(DaftarAir.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(DaftarAir.this, 1));
        }
    }

    private void initdata() {
        listmenu.add(new pilihAir(R.drawable.ades, "Ades", "ini adalah air mineral merek Ades.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.amidis, "Amidis", "ini adalah air mineral merek Amidis.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.aqua, "Aqua", "ini adalah air mineral merek Aqua.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.cleo, "Cleo", "ini adalah air mineral merek Cleo.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.club, "Club", "ini adalah air mineral merek Club.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.equil, "Equil", "ini adalah air mineral merek Equil.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.evian, "Evian", "ini adalah air mineral merek Evian.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.leminerale, "Le Minerale", "ini adalah air mineral merek Le Minerale.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.nestle, "Nestle", "ini adalah air mineral merek Nestle.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.pristine, "Pristine", "ini adalah air mineral merek Pristine.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        listmenu.add(new pilihAir(R.drawable.vit, "Vit", "ini adalah air mineral merek VIT.merupakan air yang diambil dari mata air murni, yang di kemas menggunakan kemasan yang dapat di daur ulang \n"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}

