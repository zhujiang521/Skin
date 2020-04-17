package com.zj.peel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.*
import androidx.webkit.WebSettingsCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        tvJump.setOnClickListener(this)
        btnLight.setOnClickListener(this)
        btnDark.setOnClickListener(this)
        btnDefault.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.tvJump ->{
                startActivity(Intent(this,TwoActivity::class.java))
            }
            R.id.btnLight ->{
                setDefaultNightMode(MODE_NIGHT_NO)
            }
            R.id.btnDark ->{
                setDefaultNightMode(MODE_NIGHT_YES)
            }
            R.id.btnDefault ->{
                setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)
            }
        }
    }
}
