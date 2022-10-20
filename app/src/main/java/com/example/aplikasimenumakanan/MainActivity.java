package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<Integer> hargaMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, hargaMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void getDataFromInternet(){

        namaMakanan.add("Sate Bulayak Mandalika");
        fotoMakanan.add("https://images.tokopedia.net/img/JFrBQq/2022/6/22/e52116a2-fd93-4d0e-ad0d-480c600fa9e9.jpg");
        hargaMakanan.add(34000);
        infoMakanan.add("Sate bulayak Dinamakan bulayak karena sate daging ini disajikan bersama lontong ketan yang" +
                " dililit daun aren khas Lombok bernama bulayak."+"Daging pilihan sate ini pun bermacam-macam, bisa" +
                " menggunakan daging sapi maupun ayam. ");

        namaMakanan.add(" Ayam Betutu Bali");
        fotoMakanan.add("https://images.tokopedia.net/img/JFrBQq/2022/6/22/9261fcca-e673-445f-a332-34d4a05ecd3b.jpg");
        hargaMakanan.add(48000);
        infoMakanan.add("Ayam betutu adalah salah satu menu wajib kalau kamu ke Bali. Kalau dimasak dengan cara tradisional" +
                ", pembuatan ayam betutu prosesnya sangat rumit. Pertama-tama, ayam utuh dilapisi daun pinang lalu diberi bara" +
                " sekam atau dikubur dalam tanah selama delapan sampai sepuluh jam. Sekarang ada teknik presto yang lebih modern" +
                " dan memudahkan. Kedua teknik ini memang memakan waktu yang sama-sama lama, tapi enaknya benar-benar sepadan!");

        namaMakanan.add("Bubur Pedas Sambas");
        fotoMakanan.add("https://images.tokopedia.net/img/JFrBQq/2022/6/22/77288c46-2a4c-42fb-bb6c-fefefd11339e.jpg");
        hargaMakanan.add(17000);
        infoMakanan.add("Makanan khas Kalimantan Barat ini juga akrab disapa Bubbor Padas. Kalau bubur pada umumnya berwarna putih" +
                " seperti nasi, bubur satu ini spesial karena isinya yang bervariasi. Mulai dari kangkung, pakis, hingga daun kesum menjadi" +
                " campuran yang menyehatkan di dalam bubur ini. Meskipun ada kata pedas di namanya, kamu tidak menemukan cabai di bubur ini." +
                " Rasa pedas didapat dari proses sangrai beras dan lada sebelum dimasak menjadi bubur. Tampaknya sangat segar dan bergizi!");

        namaMakanan.add("Cakalang Fufu Likupang");
        fotoMakanan.add("https://images.tokopedia.net/img/JFrBQq/2022/6/22/3b7b5f12-d828-4158-9a31-6a84f3781607.jpg");
        hargaMakanan.add(78000);
        infoMakanan.add("Cakalang Fufu adalah olahan ikan cakalang yang diproses dengan cara diasap dan dimasak dengan bumbu pedas bernama pampis." +
                " Jangan bingung kalau kamu tidak melihat ikan utuh, menu satu ini diolah setelah ikan disuwir sehingga makannya pun jadi lebih mudah." +
                "Selain enak rasanya, ikan cakalang juga merupakan salah satu ikan yang bergizi dan bahkan bermanfaat untuk menurunkan kadar gula darah, meningkatkan kesehatan tulang, hingga menjaga kesehatan jantung.");

        namaMakanan.add("Kepiting Soka");
        fotoMakanan.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2020/11/kepiting-soka.jpg");
        hargaMakanan.add(95000);
        infoMakanan.add("Kepiting Soka atau kepiting cangkang lunak merupakan makanan khas daerah lainnya yang tidak kalah enak. Selain memiliki cangkang" +
                " lunak dagingnya sangat lembut dimasak dengan saus asam manis tentunya bisa bikin kamu bersemangat lagi setelah makan.");

        namaMakanan.add("Sup Konro Sulsel ");
        fotoMakanan.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2020/11/sop-konro.jpeg");
        hargaMakanan.add(26000);
        infoMakanan.add("Toppers, kamu tidak akan bisa menolak pesona makanan yang satu ini. Sup konro iga sapi lembut yang meleleh di mulut" +
                " dan kuahnya yang pedas gurih akan menambah selera makan.");

        namaMakanan.add("Tempoyak Patin Jambi");
        fotoMakanan.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2020/11/tempoyak-ikan-patin.jpg");
        hargaMakanan.add(32000);
        infoMakanan.add("Menurut sejarahnya Tempoyak Ikan Patin awalnya merupakan makanan khas kerajaan. " +
                "Tempoyak dibuat dari ikan dan buah durian.");

        namaMakanan.add("Empal Gentong Cirebon");
        fotoMakanan.add("https://images.tokopedia.net/img/JFrBQq/2022/6/22/930bf0f4-2382-43c2-acce-2a4fa6136826.jpg");
        hargaMakanan.add(22000);
        infoMakanan.add("Pecinta gulai kamu harus coba masakan khas Cirebon satu ini. Empal gentong merupakan masakan tradisional" +
                " yang sudah eksis sejak 1994, isinya terdiri dari usus, babat, dan irisan daging sapi direbus dalam kuah kuning dengan taburan daun kucai.");

        namaMakanan.add("Bika Ambon Medan");
        fotoMakanan.add("https://images.tokopedia.net/img/JFrBQq/2022/6/22/ac9e66fa-95bd-4221-80a0-77406bc0cdbc.jpg");
        hargaMakanan.add(9000);
        infoMakanan.add("Meskipun namanya Bika Ambon tapi ternyata jajanan tradisional ini merupakan khas kota Medan. " +
                "Umumnya kue ini terbuat dari tepung tapioka, gula dan santan tapi sekarang Bika Ambon juga tersedia banyak varian seperti rasa pandan, durian, keju, dan coklat.");

        namaMakanan.add("Gulai belacan riau");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Gulai-belacan-riau.jpg");
        hargaMakanan.add(16000);
        infoMakanan.add("Makanan yang selanjutnya adalah gulai blacan. Makanan ini merupakan makanan yang sangat lezat dan banyak digemari" +
                " oleh para turis mancanegara rahasia bumbu yang membuat gulai belacan dari ruay ini begitu istimewa adalah pada bumbu terasi dan rempah lainnya khas Indonesia. Isian dari gulai ada berbagai jenis sayuran yang dimasak dengan ikan laut dan juga lobster. Makanan ini memiliki cita rasa yang kaya rempah namun tetap terasa sangat lezat dan unik.");

        prosesRecyclerViewAdapter();

    }

}