package com.wuzp.didi.learndi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

/**
 * 这是使用kotlin 的另外一个activity
 *
 * @author wuzhenpeng03 (wuzhenpeng03@didichuxing.com)
 */
class OtherActivity : AppCompatActivity() {

    private var btnOther: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        initView()
    }

    private fun initView() {
        btnOther = findViewById(R.id.btn_other_kt)
    }

    private fun initData() {
        //!!. 这是什么意思啊？
        btnOther!!.setOnClickListener(
                View.OnClickListener {
                    Toast.makeText(applicationContext, "this is other ktactivity", Toast.LENGTH_LONG).show()
                }
        )
    }
}