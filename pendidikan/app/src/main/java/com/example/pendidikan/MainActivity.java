package com.example.pendidikan;
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
public class MainActivity {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.tkr"Teknik Kendaraan Ringan Otomotif adalah sebuah ilmu yang mempelajari kompetisi keahlian bidang teknik otomotif yang menekankan pada bidang jasa
                "perbaikan kendaraan ringan (mobil). ... Untuk memasuki lapangan kerja mekanik otomotif serta mengembangkan sikap profesional dalam bidang Teknik Kenderaan Ringan Otomotif.))

                data?.add(DataModel(R.drawable.tkj,"TKJ adalah singkatan dari Teknik Komputer Jaringan. TKJ merupakan sebuah kejurusan yang mempelajari tentan" +
                        "g cara-cara merakit komputer dan menginstalasi program komputer" +
                        ".Kejurusan ini hanya ada di STM/SMK.Program keahlian TKJ berbeda dengan RPL(Rekayasa Perangkat Lunak)."))

                data?.add(DataModel(R.drawable.tav,"Tamatan Program Studi Teknik Elektronika, khususnya Teknik Audio Video menampilkan diri sebagai manusia yang beriman dan bertaqwa kepada Tuhan Yang Maha Esa, " +
                "berbudi pekerti luhur, sehat jasmani dan rohani, berkepribadian yang mantap " +
                "dan mandiri serta mempunyai rasa tanggung jawab kemasyarakatan dan kebangsaan."))

        data?.add(DataModel(R.drawable.biologi,"Biologi atau ilmu hayat adalah kajian tentang kehidupan, dan organisme hidup, termasuk struktur, fungsi, pertumbuhan, evolusi, persebaran," +
                " dan taksonominya. Ilmu biologi modern sangat luas," +
                " dan eklektik, serta terdiri dari berbagai macam cabang, dan subdisiplin."))

        data?.add(DataModel(R.drawable.kimia,"Kimia merupakan ilmu tentang materi, sifatnya, strukturnya, perubahan/reaksinya serta energi yang menyertai perubahan tersebut. ... " +
                "Kimia mengkaji sifat zat, dan secara khusus mempelajari reaksi yang mentransformasi satu zat menjadi zat lain."))

        data?.add(DataModel(R.drawable.fisika,"Pengertian fisika yaitu berasal dari kata “physic” yang artinya yaitu alam. Jadi ilmu fisika yaitu sebuah ilmu pengetahuan dimana didalamnya mempelajari tentang" +
                " sifat dan fenomena alam atau gejala alam dan seluruh interaksi yang terjadi didalamnya."))

        data?.add(DataModel(R.drawable.akutansi,"akuntansi adalah berkaitan dengan sistem hitung-menghitung, tapi faktanya akuntansi atau" +
                " accounting adalah sebuah proses yang tidak sederhana."))

        data?.add(DataModel(R.drawable.kebidanan,"Kebidanan adalah segala sesuatu yang berhubungan dengan bidan dalam memberikan pelayanan kebidanan kepada perempuan selama masa sebelum hamil, masa kehamilan, persalinan, pascapersalinan, masa nifas, bayi baru lahir, bayi, balita," +
                " dan anak prasekolah, termasuk kesehatan reproduksi perempuan dan keluarga berencana sesuai dengan tugas dan wewenangnya."))

        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                startActivity(intent)
            }

        })


    }
}
