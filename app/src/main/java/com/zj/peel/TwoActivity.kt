package com.zj.peel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_two.*

class TwoActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        initView()
    }

    private fun initView() {
        tvTwoJump.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.tvTwoJump ->{
                startActivity(Intent(this,WebActivity::class.java))
            }
        }
    }
}
