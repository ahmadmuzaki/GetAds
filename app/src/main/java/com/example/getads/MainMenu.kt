package com.example.getads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainMenu : AppCompatActivity() {
    private lateinit var rvpubads: RecyclerView
    private var list: ArrayList<publikasi> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)

        rvpubads = findViewById(R.id.rv_publist)
        rvpubads.setHasFixedSize(true)

        list.addAll(PubData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvpubads.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListpubAdapter(list)
        rvpubads.adapter = listHeroAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
            }
            R.id.action_tentang -> {
            }
        }
    }
}