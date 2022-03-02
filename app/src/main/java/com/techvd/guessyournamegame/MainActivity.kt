package com.techvd.guessyournamegame
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.techvd.guessyournamegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var num0 : Int = 0
    private var num : Int = 5
    private var num1 : Int = 10

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        printQuestion()
    }

    fun arrowDown(view: View){
            num1 = num
            num = (num0 + num)/2
            printQuestion()
    }

    fun checkFunction(view: View){
        binding.resultTextView.text = String.format(resources.getString(R.string.resultNumber),num)
        binding.askNumber.visibility = View.INVISIBLE
        binding.resultTextView.visibility = View.VISIBLE
    }

    fun arrowUpward(view: View){
          num0 = num
          num = (num1+num)/2
          printQuestion()
    }

    fun resetFunction(view: View){
        num = 5
        num0=0
        num1 =10
        printQuestion()
        binding.askNumber.visibility = View.VISIBLE
        binding.resultTextView.visibility = View.INVISIBLE
    }

    private fun printQuestion(){
        binding.askNumber.text = String.format(resources.getString(R.string.guessNumber1),num)
    }

}