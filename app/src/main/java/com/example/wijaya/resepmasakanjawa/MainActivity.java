package com.example.wijaya.resepmasakanjawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView namaResep;
    TextView deskripsi;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deskripsi = (TextView)findViewById(R.id.deskripsi);
        namaResep = (TextView)findViewById(R.id.nama_makanan);
        recyclerView = (RecyclerView)findViewById(R.id.rv_resep);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        String[]namaResep = {"Soto","Sop","Sayur Asem","Kangkung","Capcay"};

        String[]deskripsi = {"Soto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan ayam.",
                            "Sop adalah masakan berkuah dari kaldu yang dibuat dengan cara mendidihkan bahan, dan biasanya diberi bumbu serta bahan lainnya untuk menambah rasa. Bahan yang terdiri dari daging, sayur, atau kacang-kacangan direbus sampai membentuk sari. Perebusan bukan merupakan suatu cara masak yang umum sampai penciptaan wadah tahan air sekitar 5.000 tahun yang lalu.",
                            "Sayur Asem terdiri atas dua kata, yaitu; sayur dan asem. Sayur berasal dari bahasa Indonesia yang artinya adalah masakan yang berkuah, seperti gulai dan sup. Sedangkan Asem berasal dari bahasa jawa yang berarti Asam (bahasa Indonesia). Adapun arti dan maksud dari asam sendiri adalah masam. Jadi, Sayur Asam atau Sayur Asem adalah masakan berkuah yang rasanya masam.",
                            "Sayur Cah Kangkung sayur yang berbahan dasar kangkung yang biasanya dimasak dengan bumbu-bumbu dapur ditambahkan dengan saus tiram. Sayur ini biasa disajikan dengan ditambahkan dengan tomat dan cabai merah,sehingga bisa menambah cita rasa pedas.",
                            "Cap cai adalah nama hidangan khas Tionghoa yang populer yang khas karena dimasak dari banyak macam sayuran. Jumlah sayuran tidak tentu, namun banyak yang salah kaprah mengira bahwa cap cai harus mengandung 10 macam sayuran karena secara harfiah adalah berarti \"sepuluh sayur\". Cap di dalam dialek Hokkian juga berarti \"sepuluh\", dan cai berarti sayur."};

        int [] gambarResep = {R.drawable.soto,R.drawable.sop,R.drawable.sayursem,R.drawable.kangkung,R.drawable.capcay};

        String[] detailResep = {"Bahan-bahan :\t\n" +
                "2 potong Ayam\n" +
                "2 buah Kentang\n" +
                "Tauge secukupnya (buang ekor)\n" +
                "1 buah Serai (geprek)\n" +
                "1 buah Daun bawang (iris kasar)\n" +
                "1 buah Seledri (iris)\n" +
                "2 lembar Daun jeruk\n" +
                "2 lembar Daun salam (aku skip karena ga stok)\n" +
                "1 ruas Lengkuas\n" +
                "1 buah Tomat (ukuran kecil)\n" +
                "secukupnya Gula,,garam,,merica\n" +
                "secukupnya Santan\n" +
                "Bumbu halus :\n" +
                "4 siung Bawang merah\n" +
                "3 siung Bawang putih\n" +
                "1 ruas Jahe\n" +
                "1 ruas Kunyit (bakar)\n" +
                "1 sdt Ketumbar\n" +
                "2 buah Kemiri (bakar)\n" +
                "Pelengkap :\n" +
                "Bawang goreng\n" +
                "Jeruk nipis\n" +
                "Sambal kecap\n" +
                "Langkah : \t\n" +
                "Goreng ayam kemudian suwir..\n" +
                "Iris-iris kentang dan goreng sampai garing seperti kripik..\n" +
                "Tumis bumbu halus sampai harum,,masukkan serai,,lengkuas,,daun jeruk,,daun salam..Tambahkan santan..\n" +
                "Setelah santan mendidih (aduk terus jangan sampai santan pecah),,masukkan seledri,,daun bawang,,tomat dan tauge..\n" +
                "Tambahkan garam,,gula dan merica secukupnya..Test rasa..\n" +
                "Penyajian : Tata ayam suwir dan kripik kentang di dalam mangkuk,,kemudian siram dengan kuah soto..Taburkan bawang goreng dan sajikan dengan perasan jeruk nipis serta sambal kecap.",
                "Bahan-bahan : \t\n" +
                        "Wortel\n" +
                        "Kol\n" +
                        "Buncis\n" +
                        "Seledri\n" +
                        "Bawang daun\n" +
                        "Garam\n" +
                        "Penyedap rasa\n" +
                        "Langkah : \t\n" +
                        "Cuci semua bahan lalu potong-potong. Kemudian siapkan panci dan Masukan air kedalam panci secukupnya dan tunggu sampai mendidih\n" +
                        "Masukan wortel, buncis, dan secukupnya garam dan penyedap rasa\n" +
                        "Masukan kol, tunggu sebentar sampai kol mulai agak lembek kemudian masukan daun bawang dan seledri\n" +
                        "Aduk sebentar kemudian tes rasa",
                "Bahan-bahan : \t\n" +
                        "5 bh Kacang Panjang\n" +
                        "1 bh Labu Siam\n" +
                        "2 kepal Daun Melinjo\n" +
                        "Melinjo\n" +
                        "1 bh Terung Ungu (bisa menggunakan terung bulat)\n" +
                        "1 bh Jagung\n" +
                        "Asam Jawa\n" +
                        "Terasi\n" +
                        "5 gelas Air\n" +
                        "Garam\n" +
                        "Gula Merah\n" +
                        "5 bh Cabe Jablai (Jika dirasa kurang pedas, bisa ditambah lagi)\n" +
                        "2 lbr Daun Salam\n" +
                        "1 siung Lengkuas\n" +
                        "3 siung Bawang Putih\n" +
                        "4 siung Bawang Merah\n" +
                        "Langkah : \t\n" +
                        "Potong-potong semua sayuran (Kacang Panjang, Labu Siam, Terung Ungu, dan Jagung)\n" +
                        "Haluskan Cabe, Bawang Putih, Bawang Merah, dan Terasi secukupnya.\n" +
                        "Masukkan air kedalam panci hingga mendidih.\n" +
                        "Jika air sudah mendidih, masukkan semua bumbu yang dihaluskan tadi.\n" +
                        "Lalu masukkan jagung, Labu Siam, Melinjo dan Terung Ungu.\n" +
                        "Masukkan Garam, Gula, Daun Salam, dan geprek Lengkoas lalu masukkan. Cek Rasa..\n" +
                        "Jika bahan diatas sudah mulai empuk, masukkan sisa sayuran yang belum dimasukkan (Kacang Panjang dan Daun Melinjo).\n" +
                        "Tunggu beberapa saat hingga matang sempurna.\n" +
                        "Jika sudah dirasa matang, angkat lalu sajikan",
                "Bahan-bahan : \t\n" +
                        "2 ikat Kangkung\n" +
                        "1 sendok makan Minyak Goreng\n" +
                        "2 siung Bawang Putih\n" +
                        "3 butir Bawang Merah\n" +
                        "2 buah Cabai Merah\n" +
                        "2 buah Cabai Hijau\n" +
                        "1 buah Tomat\n" +
                        "50 ml Air\n" +
                        "1 sendok makan Saus Tiram\n" +
                        "secukupnya Garam\n" +
                        "Langkah : \t\n" +
                        "5 menit\n" +
                        "Panaskan minyak, tumis bawang putih, bawang merah dan cabai hingga harum.\n" +
                        "Tuangkan air dan saos tiram, biarkan mendidih kemudian masukkan kangkung dan tomat. masak sampai setengah matang, bumbui dengan garam. Angkat dan sajikan.",
                "Bahan-bahan : \t\n" +
                        "150 gram Dada ayam fillet\n" +
                        "100 gram Udang\n" +
                        "1 buah Wortel\n" +
                        "100 gram Sawi mie\n" +
                        "100 gram Sawi putih\n" +
                        "100 gram Bunga kol\n" +
                        "1 buah Tomat hijau\n" +
                        "150 ml Air\n" +
                        "Bumbu\n" +
                        "1 buah Bawang bombay\n" +
                        "2 siung Bawang putih\n" +
                        "1 buah Cabe merah\n" +
                        "3 buah Cabe rawit\n" +
                        "2 sendok makan Saos tiram\n" +
                        "1 sendok makan Saos tomat\n" +
                        "secukup rasa Garam\n" +
                        "1 sendok teh Merica halus\n" +
                        "1 sendok makan Tepung maizena\n" +
                        "3 sendok makan Minyak goreng\n" +
                        "Langkah :\t\n" +
                        "Cuci daging ayam, potong-potong sesuai selera. \n" +
                        "Kuliti udang, tinggalkan bagian ekornya lalu cuci bersih.\n" +
                        "Potong serong wortel dan sayur dirajang kasar.\n" +
                        "Bumbu: haluskan bawang putih. Iris bawang bombay, cabe dan tomat.\n" +
                        "Tumis bawang bombay, bawang putih dan irisan cabe. Lalu masukkan daging ayam dan udang. Tumis hingga setengah matang.\n" +
                        "Kemudian masukkan wortel dan bunga kol. Setelah itu masukkan sayur dan tomat. Begitu juga garam, merica, saos tomat, saos tiram dan tepung maizena yang dicampur air 150 ml.\n" +
                        "Aduk sebentar sampai kuah mengental dan mendidih. Matikan api dan capcay kuah siap dihidangkan."
                    };

        String[] titleBar = {"Soto","Sop","Sayur Asem","Kangkung","Capcay"};

        ArrayList<resep>resepArrayList = new ArrayList<>();

        for (int i = 0; i<namaResep.length;i++) {
            resep resep = new resep(namaResep[i], deskripsi[i], gambarResep[i], detailResep[i], titleBar[i]);
            resepArrayList.add(resep);
        }

        resepAdapter resepAdapter = new resepAdapter(this,resepArrayList);
        recyclerView.setAdapter(resepAdapter);
    }
}
