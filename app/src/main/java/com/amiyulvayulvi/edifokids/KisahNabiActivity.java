package com.amiyulvayulvi.edifokids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.amiyulvayulvi.edifokids.adapter.NabiAdapter;
import com.amiyulvayulvi.edifokids.model.Nabi;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class KisahNabiActivity extends AppCompatActivity {

    @BindView(R.id.rv_nabi)
    RecyclerView rvNabi;
    private ArrayList<Nabi> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_nabi);
        ButterKnife.bind(this);

        rvNabi.setHasFixedSize(true);

        DataNabi();

        showRecyclerlist();

        if (getSupportActionBar() != null ){
            getSupportActionBar().setTitle("Kisah Kisah Nabi");
        }

    }

    private void showRecyclerlist() {
        rvNabi.setLayoutManager(new LinearLayoutManager(this));
        NabiAdapter nabiAdapter = new NabiAdapter(this);
        nabiAdapter.setListNabi(list);
        rvNabi.setAdapter(nabiAdapter);
        rvNabi.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void DataNabi(){
        list = new ArrayList<>();
        list.add(new Nabi("1.","Nabi Adam as", getResources().getString(R.string.kisahAdam)));
        list.add(new Nabi("2.","Nabi Idris as", getResources().getString(R.string.kisahIdris)));
        list.add(new Nabi("3.","Nabi Nuh as", getResources().getString(R.string.kisahNuh)));
        list.add(new Nabi("4.","Nabi Huud as", getResources().getString(R.string.kisahHuud)));
        list.add(new Nabi("5.","Nabi Shaleh as", getResources().getString(R.string.kisahShaleh)));
        list.add(new Nabi("6.","Nabi Ibrahim as", getResources().getString(R.string.kisahIbrahim)));
        list.add(new Nabi("7.","Nabi Ismail as", getResources().getString(R.string.kisahIsmail)));
        list.add(new Nabi("8.","Nabi Luth as", getResources().getString(R.string.kisahLuth)));
        list.add(new Nabi("9.","Nabi Ishaq as", getResources().getString(R.string.kisahIshaq)));
        list.add(new Nabi("10.","Nabi Ya'qub as", getResources().getString(R.string.kisahYaqub)));
        list.add(new Nabi("11.","Nabi Yusuf as", getResources().getString(R.string.kisahYusuf)));
        list.add(new Nabi("12.","Nabi Syu'aib as", getResources().getString(R.string.kisahSyuaib)));
        list.add(new Nabi("13.","Nabi Ayyub as", getResources().getString(R.string.kisahAyyub)));
        list.add(new Nabi("14.","Nabi Dzulkifli as", getResources().getString(R.string.kisahDzulkifli)));
        list.add(new Nabi("15.","Nabi Musa as", getResources().getString(R.string.kisahMusa)));
        list.add(new Nabi("16.","Nabi Harun as", getResources().getString(R.string.kisahHarun)));
        list.add(new Nabi("17.","Nabi Daud as", getResources().getString(R.string.kisahDaud)));
        list.add(new Nabi("18.","Nabi Sulaiman as", getResources().getString(R.string.kisahSulaiman)));
        list.add(new Nabi("19.","Nabi Ilyas as", getResources().getString(R.string.kisahIlyas)));
        list.add(new Nabi("20.","Nabi Ilyasa as", getResources().getString(R.string.kisahIlyasa)));
        list.add(new Nabi("21.","Nabi Yusuf as", getResources().getString(R.string.kisahYusuf)));
        list.add(new Nabi("22.","Nabi Zakaria as dan Nabi Yahya as", getResources().getString(R.string.kisahZakaria)));
        list.add(new Nabi("23.","Nabi Yahya as", getResources().getString(R.string.kisahYahya)));
        list.add(new Nabi("24.","Nabi Isa as", getResources().getString(R.string.kisahIsa)));
        list.add(new Nabi("25.","Nabi Muhammad SAW", getResources().getString(R.string.kisahMuhammad)));


    }

}
