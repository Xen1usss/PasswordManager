package xen.passwordmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xen.passwordmanager.ui.SiteList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, SiteList())
                .commitNow()
        }
    }
}