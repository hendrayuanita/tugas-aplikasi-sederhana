package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LihatPengeluaranActivity extends AppCompatActivity {

    private ListView lsvPengeluaran;
    private ArrayAdapter<String> adapterLsvPengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_pengeluaran);

        //panggil list view
        this.lsvPengeluaran = this.findViewById(R.id.lsv_pengeluaran);

        //adapter
        this.adapterLsvPengeluaran = new ArrayAdapter<String>(
                this,
                R.layout.layout_list_view_sederhana,
                BerandaActivity.dataPengeluaran
        );
        this.lsvPengeluaran.setAdapter(this.adapterLsvPengeluaran);
    }
}
