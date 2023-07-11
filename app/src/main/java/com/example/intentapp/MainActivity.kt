package com.example.intentapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivitywithData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivitywithData.setOnClickListener(this)

        val btnMoveActivitywithObject: Button = findViewById(R.id.btn_move_activity_with_object)
        btnMoveActivitywithObject.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this,MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveIntentWithData = Intent(this,MoveActivityWithData::class.java)
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_NAME, "IHSAN NUR ARIPIN")
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_CLASS, "TI.20.F.1")
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_AGE, 23)
                startActivity(moveIntentWithData)
            }


        }
    }
}