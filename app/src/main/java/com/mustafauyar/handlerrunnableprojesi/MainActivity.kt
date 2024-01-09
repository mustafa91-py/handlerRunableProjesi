package com.mustafauyar.handlerrunnableprojesi
import com.mustafauyar.handlerrunnableprojesi.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var numara = 0 // numara
    lateinit var runnable:Runnable // sonradan atacağım dedim
    var handler: Handler = Handler(Looper.myLooper()!!) // üzerinde çizgi olursa bu tekerlemeyi yaz
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRunnable()
    }
    private fun initRunnable(){
        runnable = object : Runnable {
            override fun run() {
                binding.textView.text = "sayaç $numara"
                numara ++
                handler.postDelayed(this,1000)
            }

        }
    }
//    fun baslat (view:View){
//        numara = 0
//        runnable = object : Runnable {// interface aynı soyut sınıf gibi kullanıloyor object ile birlikte
//            override fun run() { // zorunlu kullanım
//                binding.textView.text = "sayaç : $numara" // numarayı yazdır
//                numara = numara +1 //numarayı birer birer arttır
//                handler.postDelayed(runnable,1000)//döngüyü başlat
//                // await gibi çalışıyor ayrı bir process gibi tkinter after metoduna benziyor ama farklı prensip olarak
//            }
//        }
//        handler.post(runnable) // elealdığımız çalıştırabiliri post ettik
    fun baslat(view: View){
        handler.removeCallbacks(runnable)
        numara = 0
        binding.textView.text ="sayaç :$numara"
        handler.post(runnable)
    }
    fun durdur (view: View){
        handler.removeCallbacks(runnable) // postu durdurduk
        numara = 0
        binding.textView.text = "sayaç : $numara"
    }
}