package fi.centria.tki.lessonservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var start_button: Button
    private lateinit var end_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start_button = findViewById(R.id.start_service)
        end_button = findViewById(R.id.end_service)
        val intent = Intent(this,MyService::class.java)
        start_button.setOnClickListener { view ->
            startForegroundService(intent)
        }
        end_button.setOnClickListener { view ->
            stopService(intent)
        }

    }
}