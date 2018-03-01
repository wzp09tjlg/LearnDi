package com.wuzp.didi.learndi

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

/**
 * 简单的kotlin的代码实现一个activity
 *
 * @author wuzhenpeng03 (wuzhenpeng03@didichuxing.com)
 */
class KtMainActivity : AppCompatActivity() {

    private val strIntent = "com.wuzp.didi.learndi.OtherActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kt)
        val btnTest: Button = findViewById(R.id.btn_kt_test)
        btnTest.setOnClickListener {
            val intent = Intent(this.baseContext,OtherActivity::class.java)
            startActivity(intent)
        }

    }
}