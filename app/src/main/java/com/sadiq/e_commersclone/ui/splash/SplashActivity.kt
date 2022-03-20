package com.sadiq.e_commersclone.ui.splash



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sadiq.e_commersclone.MainActivity
import com.sadiq.e_commersclone.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_cart)
        supportActionBar!!.hide()
        //openHomeScreen()

    }
   fun openHomeScreen(){
      CoroutineScope(Dispatchers.Main).launch {
    delay(3000)
           val s: Intent = Intent(this@SplashActivity,MainActivity::class.java)
           startActivity(s)
           finish()
       }

   }
}

