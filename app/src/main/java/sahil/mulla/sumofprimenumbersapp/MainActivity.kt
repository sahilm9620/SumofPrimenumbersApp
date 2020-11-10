package sahil.mulla.sumofprimenumbersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myedit = findViewById<EditText>(R.id.editTextTextPersonName)
        val mytv = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            val num: Int = myedit.text.toString().toInt()
            var s=0

            for (i in 2..num) {
                var p = 1
                var k = 2
                while (k < i) {
                    if (i % k == 0) {
                        p = 0
                        break
                    }
                    k++
                }
                if (p == 1) {
                    s += i
                }
            }

            mytv.text =("Sum of prime numbers:$s")
        })
    }
}