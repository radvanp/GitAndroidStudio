package sk.nov.gitandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("TAG","Message")

        Log.e("TAG","Error Message")

        Log.d("TAG","Message")

        Log.i("TAG","Message 2")

    }
}