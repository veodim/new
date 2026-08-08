package com.collegelacite.es3v1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.collegelacite.es3v1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var etats: ArrayList<Etat>
    private var etatSelectionne: Etat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        etats = Etat.USA

        val adaptateur = Adaptateur(this, etats)
        binding.listView.adapter = adaptateur

        binding.listView.setOnItemClickListener { _, _, position, _ ->
            val etat = etats[position]
            etatSelectionne = etat

            etat.intoImageView(binding.imageView, this)
            binding.nomTextView.text = etat.nom
            binding.capitaleTextView.text = "CAPITALE: " + etat.capitale
            binding.superficieTextView.text = "SUPERFICIE: " + etat.superficie + " km²"
        }

        binding.imageView.setOnClickListener {
            if (etatSelectionne != null) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(etatSelectionne!!.wikiUrl))
                startActivity(intent)
            }
        }
    }
}
