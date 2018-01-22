package com.jmy.demo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
//        toolbar.setTitle("标题")
//        setSupportActionBar(toolbar)

        tab.addTab(tab.newTab().setText("图片"))
        tab.addTab(tab.newTab().setText("文字"))
        tab.addTab(tab.newTab().setText("视频"))
    }
}
