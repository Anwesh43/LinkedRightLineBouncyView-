package com.anwesh.uiprojects.linkedrightlinebouncyview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.rightlinebouncyview.RightLineBouncyView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RightLineBouncyView.create(this)
    }
}
