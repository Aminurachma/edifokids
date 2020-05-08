package com.amiyulvayulvi.edifokids;

import android.app.Dialog;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.amiyulvayulvi.edifokids.adapter.AsmaulHusnaAdapter;
import com.amiyulvayulvi.edifokids.adapter.NabiAdapter;
import com.amiyulvayulvi.edifokids.model.AsmaulHusna;
import com.amiyulvayulvi.edifokids.model.Nabi;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AsmaulHusnaActivity extends AppCompatActivity {

    @BindView(R.id.rv_asmaul)
    RecyclerView Rasmaul;

    private ArrayList<AsmaulHusna> list;
//    private ArrayList<PopupAsmaul> listt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul_husna);
        ButterKnife.bind(this);


        DataAs();

        showRecyclerlist();

        if (getSupportActionBar() != null ){
            getSupportActionBar().setTitle("Asmaul Husna");
        }



    }

    private void showRecyclerlist() {
        Rasmaul.setLayoutManager(new LinearLayoutManager(this));
        AsmaulHusnaAdapter AsmaulHusnaAdapter = new AsmaulHusnaAdapter(this);
        AsmaulHusnaAdapter.setListAsmaulHusna(list);
        Rasmaul.setAdapter(AsmaulHusnaAdapter);
        if (AsmaulHusnaActivity.this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            Rasmaul.setLayoutManager(new GridLayoutManager(this, 2));
        }else {
            Rasmaul.setLayoutManager(new GridLayoutManager(this, 4));
        }
    }

    private void DataAs(){
        list = new ArrayList<>();
        list.add(new AsmaulHusna("Allah", "Allah",R.drawable.satu));
        list.add(new AsmaulHusna("Ar Rahman", "Maha Pengasih",R.drawable.dua));
        list.add(new AsmaulHusna("Ar Rahiim", "Maha Penyayang",R.drawable.tiga));
        list.add(new AsmaulHusna("Al Malik", "Maha Merajai",R.drawable.empat));
        list.add(new AsmaulHusna("Al Quddus", "Maha Suci",R.drawable.lima));
        list.add(new AsmaulHusna("As Salaam", "Maha Memberi Kesejahteraan",R.drawable.enam));
        list.add(new AsmaulHusna("Al Mu'kmin", "Maha Memberi Keamanan",R.drawable.tujuh));
        list.add(new AsmaulHusna("Al Muhaimin", "Maha Memelihara",R.drawable.delapan));
        list.add(new AsmaulHusna("Al 'Aziiz", "Maha Gagah",R.drawable.sembilan));
        list.add(new AsmaulHusna("Al Jabbar", "Maha Perkasa",R.drawable.sepuluh));
        list.add(new AsmaulHusna("Al Mutakabbir", "Maha Megah",R.drawable.sebelas));
        list.add(new AsmaulHusna("Al Khaliq", "Maha Pencipta",R.drawable.duabelas));
        list.add(new AsmaulHusna("Al Baari'", "Maha Melepaskan",R.drawable.tigabelas));
        list.add(new AsmaulHusna("Al Mushawwir", "Maha Pembentuk Rupa",R.drawable.empatbelas));
        list.add(new AsmaulHusna("Al Ghaffaar", "Maha Pengampun",R.drawable.limabelas));
        list.add(new AsmaulHusna("Al Qahhaar", "Maha Pemaksa",R.drawable.enambelas));
        list.add(new AsmaulHusna("Al Wahhaab", "Maha Pemberi Karunia",R.drawable.tujubelas));
        list.add(new AsmaulHusna("Ar Razzaaq", "Maha Pemberi Rezeki",R.drawable.delapanbelas));
        list.add(new AsmaulHusna("Al Fattaah", "Maha Pembuka Rahmat",R.drawable.sembilanbelas));
        list.add(new AsmaulHusna("Al 'Aliim", "Maha Mengetahui",R.drawable.duapuluh));
        list.add(new AsmaulHusna("Al Qaabidh", "Maha Menyempitkan",R.drawable.duasatu));
        list.add(new AsmaulHusna("Al Baasith", "Maha Melapangkan",R.drawable.duapuluhdua));
        list.add(new AsmaulHusna("Al Khaafidh", "Maha Merendahkan",R.drawable.duapuluhtiga));
        list.add(new AsmaulHusna("Ar Raafi'", "Maha Meninggikan",R.drawable.duapuluhempat));
        list.add(new AsmaulHusna("Al Mu'izz", "Maha Memuliakan",R.drawable.duapuluhempat));
        list.add(new AsmaulHusna("Al Mudzil", "Maha Menghinakan",R.drawable.duapuluhenam));
        list.add(new AsmaulHusna("Al Samii'", "Maha Mendengar",R.drawable.duapuluhtujuh));
        list.add(new AsmaulHusna("Al Bashiir", "Maha Melihat",R.drawable.duapuluhdelapan));
        list.add(new AsmaulHusna("Al Hakqam", "Maha Menetapkan",R.drawable.duapuluhsembilan));
        list.add(new AsmaulHusna("Al 'Adl", "Maha Adil",R.drawable.tigapuluh));
        list.add(new AsmaulHusna("Al Lathiif", "Maha Lemut",R.drawable.tigasatu));
        list.add(new AsmaulHusna("Al Khabiir", "Maha Mengetahui Rahasia",R.drawable.tigadua));
        list.add(new AsmaulHusna("Al Haliim", "Maha Penyantun",R.drawable.tigatiga));
        list.add(new AsmaulHusna("Al 'Azhiim", "Maha Agung",R.drawable.tigaempat));
        list.add(new AsmaulHusna("Al Ghafuur", "Maha Pengampun",R.drawable.tigalima));
        list.add(new AsmaulHusna("As Syakuur", "Maha Pembalas Budi",R.drawable.tigaenam));
        list.add(new AsmaulHusna("Al 'Aliy", "Maha Tinggi",R.drawable.tigatuju));
        list.add(new AsmaulHusna("Al Kabiir", "Maha Besar",R.drawable.tigadelapan));
        list.add(new AsmaulHusna("Al Hafizh", "Maha Menjaga",R.drawable.tigasembilan));
        list.add(new AsmaulHusna("Al Muqiit", "Maha Pemberi Kecukupan",R.drawable.empatpuluh));
        list.add(new AsmaulHusna("Al Hasiib", "Maha Pembuat Beritungan",R.drawable.empatsatu));
        list.add(new AsmaulHusna("Al Jaliil", "Maha Melihat",R.drawable.empatdua));
        list.add(new AsmaulHusna("Al Kariim", "Maha Pemura",R.drawable.empattiga));
        list.add(new AsmaulHusna("Ar Raqiib", "Maha Mengawasi",R.drawable.empatempat));
        list.add(new AsmaulHusna("Al Mujiib", "Maha Mengabulkan",R.drawable.empatlima));
        list.add(new AsmaulHusna("Al Waasi'", "Maha Mulia",R.drawable.empatenam));
        list.add(new AsmaulHusna("Al Hakiim", "Maha Bijaksana",R.drawable.empattuju));
        list.add(new AsmaulHusna("Al Waduud", "Maha Pencinta",R.drawable.empatdelapan));
        list.add(new AsmaulHusna("Al Majiid", "Maha Mulia",R.drawable.empatsembilan));
        list.add(new AsmaulHusna("Al Baa'its", "Maha Membangkitkan",R.drawable.limapuluh));
        list.add(new AsmaulHusna("As Syahiid", "Maha Menyaksikan",R.drawable.limasatu));
        list.add(new AsmaulHusna("Al Haqq", "Maha Benar",R.drawable.limadua));
        list.add(new AsmaulHusna("Al Wakiil", "Maha Memelihara",R.drawable.limatiga));
        list.add(new AsmaulHusna("Al Qawiyyu", "Maha Kuat",R.drawable.limaempat));
        list.add(new AsmaulHusna("Al Matiin", "Maha Kokoh",R.drawable.limalima));
        list.add(new AsmaulHusna("Al Waliyy", "Maha Melindungi",R.drawable.limaenam));
        list.add(new AsmaulHusna("Ar Hamiid", "Maha Terpuji",R.drawable.limatuju));
        list.add(new AsmaulHusna("Al Mushii", "Maha Mengkalkulasi",R.drawable.limadelapan));
        list.add(new AsmaulHusna("Al Mubdi'", "Maha Memulai",R.drawable.limasembilan));
        list.add(new AsmaulHusna("Al Mu'iid ", "Maha Mengembalikan Kehidupan",R.drawable.enampuluh));
        list.add(new AsmaulHusna("Al Muhyii", "Maha Menghidupkan",R.drawable.enamsatu));
        list.add(new AsmaulHusna("Al Mumiitu", "Maha Mematikan",R.drawable.enamdua));
        list.add(new AsmaulHusna("Al Hayuu", "Maha hidup",R.drawable.enamtiga));
        list.add(new AsmaulHusna("Al Qayyuum", "Maha Mandiri",R.drawable.enamempat));
        list.add(new AsmaulHusna("Al Waajid", "Maha Penemu",R.drawable.enamlima));
        list.add(new AsmaulHusna("Ar Maajid", "Maha Mulia",R.drawable.enamenam));
        list.add(new AsmaulHusna("Al Wahiid", "Maha Tunggal",R.drawable.enamenam));
        list.add(new AsmaulHusna("Al'AhAd", "Maha Esa",R.drawable.enamdelalapan));
        list.add(new AsmaulHusna("As Shamad", "Maha Dibutuhkan",R.drawable.enamsembilan));
        list.add(new AsmaulHusna("Al Qaadir", "Maha Menyeimbangkan",R.drawable.tujupuluh));
        list.add(new AsmaulHusna("Al Muqtadir", "Maha Berkuasa",R.drawable.tujusatu));
        list.add(new AsmaulHusna("Al Muqaddim", "Maha Mendahulukan",R.drawable.tujudua));
        list.add(new AsmaulHusna("Al Mu'akkhir", "Maha Mengakhirkan",R.drawable.tujutiga));
        list.add(new AsmaulHusna("Al Awwal", "Maha Awal",R.drawable.tujuempat));
        list.add(new AsmaulHusna("Al Aakhir", "Maha Akhir",R.drawable.tujulima));
        list.add(new AsmaulHusna("Az Zhaahir", "Maha Nyata",R.drawable.tujuenam));
        list.add(new AsmaulHusna("Al Baathin", "Maha Ghaib",R.drawable.tujutuju));
        list.add(new AsmaulHusna("Al Waali", "Maha Memerintah",R.drawable.tujudelapan));
        list.add(new AsmaulHusna("Al Muta'aalii", "Maha Tingi",R.drawable.tujusembilan));
        list.add(new AsmaulHusna("Al Barri", "Maha Penderma",R.drawable.delapanpuluh));
        list.add(new AsmaulHusna("At Tawwaab", "Maha Penerima Tobat",R.drawable.delapanpuluhsatu));
        list.add(new AsmaulHusna("Al Muntaqim", "Maha Penuntut Balas",R.drawable.delapanpuluhdua));
        list.add(new AsmaulHusna("Al Afuww", "Maha Pemaaf",R.drawable.delapanpuluhtiga));
        list.add(new AsmaulHusna("Ar Ra'uuf", "Maha Pengasih",R.drawable.delapanpuluhempat));
        list.add(new AsmaulHusna("Malikul Mulk", "Maha Semesta",R.drawable.delapanpuluhlima));
        list.add(new AsmaulHusna("Dzul Jalaali Wal Ikraam", "Maha Kebesaran Dan Kemuliaan",R.drawable.delapanpuluhenam));
        list.add(new AsmaulHusna("Al Muqsith", "Maha Adil",R.drawable.delapanpuluhtujuh));
        list.add(new AsmaulHusna("Al Jamii", "Maha Mengumpulkan",R.drawable.delapanpuluhdelapan));
        list.add(new AsmaulHusna("Al Ghaniyy", "Maha Berkecukupan",R.drawable.delapanpuluhdelapan));
        list.add(new AsmaulHusna("Al Mughnii", "Maha Memberi Kekayaan",R.drawable.semiblanpuluh));
        list.add(new AsmaulHusna("Al Maani", "Maha Mencegah",R.drawable.sembilanpuluhsatu));
        list.add(new AsmaulHusna("Ad Dhaar", "Maha Memeberi Derita",R.drawable.sembilanpuluhdua));
        list.add(new AsmaulHusna("An Nafii'", "Maha Memberi Manfaat",R.drawable.sembilanpuluhtiga));
        list.add(new AsmaulHusna("An Nuur", "Maha Bercahaya",R.drawable.sembilanpuluhempat));
        list.add(new AsmaulHusna("AL Haadi", "Maha Memberi Petunjuk",R.drawable.sembilanpuluhlima));
        list.add(new AsmaulHusna("Al Baqii", "Maha Pencipta",R.drawable.sembilanpuluhenam));
        list.add(new AsmaulHusna("Al Waarits", "Maha Kekal",R.drawable.sembilanpuluhtujuh));
        list.add(new AsmaulHusna("Al Rasyiid", "Maha Pengasih",R.drawable.sembilanpuluhdelapan));
        list.add(new AsmaulHusna("As Sabuur", "Maha Pengasih",R.drawable.sembilanpuluhsembilan));

    }


}
