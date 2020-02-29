package com.dicoding.makanankhaspontianak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvMakanan: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMakanan = findViewById(R.id.rv_makanan)
        rvMakanan.setHasFixedSize(true)

        list.addAll(MakananData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvMakanan.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListMakananAdapter(list)
        rvMakanan.adapter = listHeroAdapter
    }
}
