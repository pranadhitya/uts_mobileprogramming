package com.example.pendidikan;

public class DataActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.rendang))
        )

        }
        }
}
