package com.mustafauyar.handlerrunnableprojesi
import android.content.Intent
import com.mustafauyar.handlerrunnableprojesi.databinding.ActivitySideOneBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SideOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySideOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_one)
        binding = ActivitySideOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun goMain(view: View){
        intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }

}