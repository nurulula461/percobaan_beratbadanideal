package com.example.percobaan_beratbadanideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var nama : EditText
    private lateinit var tinggi : EditText
    private lateinit var jkLaki : RadioButton
    private lateinit var JkPerempuan : RadioButton
    private lateinit var hasil : TextView
    private lateinit var hitung : Button
    private lateinit var simpan : Button
    private lateinit var reset : Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter : RecyclerView.Adapter<*>
    private lateinit var viewManager : RecyclerView.LayoutManager
    private var tBadan: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.textNama)
        tinggi = findViewById(R.id.txtTG)
        jkLaki = findViewById(R.id.rblaki)
        JkPerempuan = findViewById(R.id.rbPerempuan)
        hasil = findViewById(R.id.hasil)
        hitung = findViewById(R.id.btHitung)
        simpan = findViewById(R.id.btSimpan)
        reset = findViewById(R.id.btReset)
        recyclerView = findViewById(R.id.listData)

        val data = mutableListOf<DataBeratBadan>()
        viewManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerAdapter = BeratBadan_Adapter(data)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = viewManager

        simpan.setOnClickListener {
            val namaa = nama.text.toString()
            val tinggi = tinggi.text.toString()
            val hasill = hasil.text.toString()

            val databerat = DataBeratBadan(namaa, tinggi, hasill)
            data.add(databerat)
            recyclerAdapter.notifyDataSetChanged()
        }

        hitung.setOnClickListener {

            var tinggibadan = tinggi.text.toString().toInt()

            if (jkLaki.isChecked){
                tBadan = (tinggibadan - 100 ) - ((tinggibadan - 100) * 10/100)
                hasil.setText(tBadan.toString() + "kg")
            } else{
                tBadan = (tinggibadan - 100 ) - ((tinggibadan - 100) * 15/100)
                hasil.setText(tBadan.toString() + "kg")
            }
            }
        }
    }
