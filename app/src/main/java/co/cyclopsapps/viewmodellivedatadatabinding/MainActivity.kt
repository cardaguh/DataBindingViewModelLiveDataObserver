package co.cyclopsapps.viewmodellivedatadatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAdd = findViewById<Button>(R.id.button)
        val textAdd = findViewById<TextView>(R.id.textView2)
        var count = 0

        buttonAdd.setOnClickListener {
            count++
            textAdd.text = count.toString()
        }
    }
}