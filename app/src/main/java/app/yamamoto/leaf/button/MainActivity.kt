package app.yamamoto.leaf.button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.ColorInt
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            button.setBackgroundColor(Color.RED)

        }
    }
        fun click (view : View){
            button.setBackgroundResource(R.drawable.drum_playing_image)
        }

}