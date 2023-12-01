package com.example.asesmen2ppbmkustomlist


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.asesmen2ppbmkustomlist.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val time = intent.getStringExtra("time")
            val ingredients = intent.getIntExtra("ingredients", R.string.Dokter3)
            val desc = intent.getIntExtra("desc", R.string.Dokter3Desc)
            val image = intent.getIntExtra("image", R.drawable.maggi)

            binding.detailName.text = name
            binding.detailTime.text = time
            binding.detailDesc.setText(desc)
            binding.detailIngredients.setText(ingredients)
            binding.detailImage.setImageResource(image)
        }
    }
}