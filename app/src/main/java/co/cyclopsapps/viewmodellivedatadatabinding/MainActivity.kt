package co.cyclopsapps.viewmodellivedatadatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import co.cyclopsapps.viewmodellivedatadatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var count = 0

        binding.button.setOnClickListener {
            count++
            binding.textView2.text = count.toString()
        }
    }
}