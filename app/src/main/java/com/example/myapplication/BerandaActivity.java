package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class BerandaActivity extends AppCompatActivity {

    //varibel static untuk mensimulasikan penyimpanan data
    public static ArrayList<String> dataPengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        if(dataPengeluaran == null)
        {
            //inisialisasi
            dataPengeluaran = new ArrayList<>();
            dataPengeluaran.add("sarapan - 8000");
            dataPengeluaran.add("bensin - 10000");
        }
    }
    public void btnTambahPengeluaran_onClick(View view)
    {
        //menampilkan activity form pengeluaran
        Intent i = new Intent(BerandaActivity.this, TambahPengeluaranActivity.class);
        this.startActivity(i);
    }
    public void btnLihatPengeluaran_onClick(View view)
    {
        //menmapilkan activity lihat pengeluaran
        Intent i = new Intent(BerandaActivity.this, LihatPengeluaranActivity.class);
        this.startActivity(i);
    }
}
