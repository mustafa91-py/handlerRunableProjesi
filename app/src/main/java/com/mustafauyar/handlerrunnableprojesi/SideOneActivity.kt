package com.mustafauyar.handlerrunnableprojesi
import android.content.Intent
import com.mustafauyar.handlerrunnableprojesi.databinding.ActivitySideOneBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
/*
aktivitiler arası geçiş yaparken döngüdeki sayıyı diğer aktiviete göster yada günceelle

 */
class SideOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySideOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_one)
        binding = ActivitySideOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sayac_verisi_al = intent.getIntExtra("sayacVerisi",0)
        binding.sideText1.text = sayac_verisi_al.toString()
    }
    fun goMain(view: View){
        intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }

}