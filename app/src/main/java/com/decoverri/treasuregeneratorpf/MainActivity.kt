package com.decoverri.treasuregeneratorpf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.decoverri.treasuregeneratorpf.ui.chooseType.ChooseTypeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ChooseTypeFragment.newInstance())
                .commitNow()
        }
    }
}