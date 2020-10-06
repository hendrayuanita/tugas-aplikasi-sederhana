package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TambahPengeluaranActivity extends AppCompatActivity {
    private EditText edtKeterangan, edtNominal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_pengeluaran);
        //isi edit teks
        this.edtKeterangan = this.findViewById(R.id.edt_keterangan);
        this.edtNominal = this.findViewById(R.id.edt_nominal);
    }
    public void btnSimpan_onClick(View view) {
        //ambil dulu nilai apa adanya dari edit teks
        String keterangan = this.edtKeterangan.getText().toString();
        String nominal = this.edtNominal.getText().toString();

        if (isAngka(nominal))// jika nomilanya benar angka
        {
            //simpan
            String pengeluaran = keterangan + " - " + nominal;
            //tambahkan ke variabel statis
            BerandaActivity.dataPengeluaran.add(pengeluaran);
            Toast.makeText(this,"berhasil ditambahkan", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "nominal harus berupa angka", Toast.LENGTH_SHORT).show();
        }
    }
    private boolean isAngka(String nominal) {
        //memanfaatkan parse dari class doble
        try {
            Double.parseDouble(nominal);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
