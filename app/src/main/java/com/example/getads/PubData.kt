package com.example.getads

object PubData {
    private val pubNames = arrayOf("aplikasi (tinggi)",
        "aplikasi (sedang)",
        "aplikasi (rendah)",
        "buku (tinggi)",
        "buku (sedang)",
        "buku (rendah)",
        "brand (tinggi)",
        "brand (sedang)",
        "brand (rendah)",
        "event (tinggi)",
        "event (sedang)",
        "event (rendah)",
        "ilustrasi (tinggi)",
        "ilustrasi (sedang)",
        "ilustrasi (rendah)",
        "ITE (tinggi)",
        "ITE (sedang)",
        "ITE (rendah)",
        "videografi (tinggi)",
        "videografi (sedang)",
        "videografi (rendah)")

    private val pubDetails = arrayOf("Desain Aplikasi untuk Pemerintahan", "Desain Aplikasi untuk Perkantoran", "Desain Aplikasi untuk personal",
        "Desain buku untuk Pemerintahan", "Desain buku untuk Perkantoran", "Desain buku untuk personal",
        "Desain branding untuk Pemerintahan", "Desain buku untuk Perkantoran", "Desain buku untuk personal",
        "jasa Event organizer untuk Pemerintahan", "jasa Event organizer untuk Perkantoran", "jasa Event organizer untuk personal",
        "Desain illustrasi untuk Pemerintahan", "Desain illustrasi untuk Perkantoran", "Desain illustrasi untuk personal",
        "Desain alat untuk Pemerintahan", "Desain alat untuk Perkantoran", "Desain alat untuk personal",
        "Jasa foto video untuk Pemerintahan", "Jasa foto video untuk Perkantoran", "Jasa foto video untuk personal")

    private val pubImages = intArrayOf(R.drawable.aps_high,
        R.drawable.aps_mid,
        R.drawable.aps_low,
        R.drawable.book_high,
        R.drawable.book_mid,
        R.drawable.book_low,
        R.drawable.bran_high,
        R.drawable.bran_mid,
        R.drawable.bran_low,
        R.drawable.even_high,
        R.drawable.even_mid,
        R.drawable.even_low,
        R.drawable.ilus_high,
        R.drawable.ilus_mid,
        R.drawable.ilus_low,
        R.drawable.ite_high,
        R.drawable.ite_mid,
        R.drawable.ite_low,
        R.drawable.vid_high,
        R.drawable.vid_mid,
        R.drawable.vid_low,        )

    val listData: ArrayList<publikasi>
        get() {
            val list = arrayListOf<publikasi>()
            for (position in pubNames.indices) {
                val hero = publikasi()
                hero.name = pubNames[position]
                hero.detail = pubDetails[position]
                hero.photo = pubImages [position]
                list.add(hero)
            }
            return list
        }
}
