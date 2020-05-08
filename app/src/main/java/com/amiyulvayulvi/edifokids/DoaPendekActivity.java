package com.amiyulvayulvi.edifokids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.amiyulvayulvi.edifokids.adapter.DoaAdapter;
import com.amiyulvayulvi.edifokids.adapter.NabiAdapter;
import com.amiyulvayulvi.edifokids.model.AsmaulHusna;
import com.amiyulvayulvi.edifokids.model.Doa;
import com.amiyulvayulvi.edifokids.model.Nabi;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DoaPendekActivity extends AppCompatActivity {

    @BindView(R.id.rv_doa)
    RecyclerView rvDoa;
    private ArrayList<Doa> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_pendek);

        ButterKnife.bind(this);

        rvDoa.setHasFixedSize(true);

        DataDoa();

        showRecyclerlist();

        if (getSupportActionBar() != null ){
            getSupportActionBar().setTitle("Doa - Doa Pendek");
        }

    }

    private void showRecyclerlist() {
        rvDoa.setLayoutManager(new LinearLayoutManager(this));
        DoaAdapter doaAdapter = new DoaAdapter(this);
        doaAdapter.setListDoa(list);
        rvDoa.setAdapter(doaAdapter);
        rvDoa.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void DataDoa(){
        list = new ArrayList<>();
        list.add(new Doa("Doa Sebelum Tidur",R.drawable.doasebelumtidur, R.raw.doa_sebelum_tidur));
        list.add(new Doa("Doa Setelah Tidur", R.drawable.doasetelahtidur, R.raw.doa_bangun_tidur));
        list.add(new Doa("Doa Sebelum Makan", R.drawable.doasebelummakan, R.raw.doasebelummakan));
        list.add(new Doa("Doa Sesudah Makan", R.drawable.doasesudahmakan, R.raw.doasesudahmakan));
        list.add(new Doa("Doa Sebelum Masuk  Kamar Mandi", R.drawable.doasebelummasukkamarmandi, R.raw.masukkamarmandi));
        list.add(new Doa("Doa Setelah Keluar dari Kamar Mandi", R.drawable.doasetelahkeluardarikamarmandi, R.raw.keluarkamarmandi));


    }


}
