package com.dicoding.makanankhaspontianak

object MakananData {
    private val makananNames = arrayOf("Bubur Pedas",
        "Chaikwe",
        "Sotong Pangkong",
        "Bingke",
        "Pisang Srikaya",
        "Pengkang",
        "Kelepon",
        "Kue Pasung",
        "Jorong - Jorong",
        "Mie Tiaw")

    private val makananDetails = arrayOf("Terbuat dari bumbu, rempah, dan sayuran seperti daun pakis, daun kesum, dan lainnya, cita rasa dari bubur khas Pontianak yang dikenal dengan nama bubur pedas ini dijamin akan membuatmu ketagihan.",
        "Chai kwe sendiri merupakan makanan ringan khas Pontianak yang terbuat dari tumisan sayur seperti keladi, kucai, bengkoang, hingga rebung yang dibungkus menggunakan kulit yang terbuat dari campuran tepung beras dan tepung tapioka, makanan khas Pontianak ini lebih sering disajikan dengan cara dikukus, banyak juga yang kerap menyajikannya dengan cara digoreng",
        "Sotong Pengkong memiliki cara pembuatan yang sangat sederhana. Cukup pukul-pukul Sotong Kering hingga dagingnya menjadi emping dan sirami dengan kuah sambal kacang khas Pontianak.Meskipun sederhana, makanan tradisional khas Pontianak ini memiliki cita rasa unik dan enak",
        "Bingke terbuat dari adonan tepung dan telur. Varian rasanya ada original, keju, kentang, durian, dan masih banyak lagi. Kue bingka ini ada yang disajikan dengan kuah berupa jus atau air yang dibuat dari gula dan putih telur, namun ada juga yang disajikan tanpa disiram kuah apapun alias kering. Kue bingka sendiri merupakan kue yang berbentuk bunga mekar. ",
        "Bahan dasar pisang goreng srikaya ini adalah pisang nipah yang hanya tumbuh di Pontianak. Selain itu, ada selai srikaya yang terbuat dari telur dan buah srikaya sebagai campurannya saat disajikan. Pisang goreng srikaya biasa dijadikan menu andalan untuk sarapan.",
        "Pengkang bisa dibilang mirip dengan nasi bakar jika kita melihat bagian luarnya. Tapi, jika anda membuka bungkusnya, anda akan melihat bagian dalam Pengkang yang menggunakan beras ketan. Di sini, beras ketan yang dibungkus dengan menggunakan daun pisang, diberi tambahan ebi agar memberikan citarasa yang gurih.",
        "sejenis makanan tradisional atau kue tradisional Indonesia yang termasuk ke dalam kelompok jajanan pasar. Makanan enak ini terbuat dari tepung beras ketan yang dibentuk seperti bola-bola kecil dan diisi dengan gula merah lalu direbus dalam air mendidih.",
        "Kue tradisional khas Pontianak ini dibungkus menggunakan daun pisang mengerucut yang khas. Makanan khas Pontianak ini memiliki dua varian rasa, manis dan gurih. ",
        "Kue khas dari Pontianak ini, terbuat dari santan murni dan tepung beras. Proses penyajiannya sangat sederhana, adonan yang setengah jadi ditempatkan ke dalam daun pisang yang telah dibentuk menyerupai wadah persegi.",
        "Ada dua jenis Mie Tiaw yang bisa anda coba, yang pertama adalah Mie Tiaw goreng dan yang kedua adalah Mie Tiaw siram – menggunakan kuah. Biasanya lauk pendamping ditambahkan pada sajian kuliner khas ini adalah telur, jeroan, daging sapi, toge, dan juga daun sawi.")

    private val makananImages = intArrayOf(R.drawable.bubur_pedas,
        R.drawable.chaikwe,
        R.drawable.sotong_pangkong,
        R.drawable.bingke,
        R.drawable.pisang_srikaya,
        R.drawable.pengkang,
        R.drawable.kelepon,
        R.drawable.kue_pasung,
        R.drawable.jorong_jorong,
        R.drawable.mie_tiaw)

    val listData: ArrayList<Makanan>
        get() {
            val list = arrayListOf<Makanan>()
            for (position in makananNames.indices) {
                val makanan = Makanan()
                makanan.name = makananNames[position]
                makanan.detail = makananDetails[position]
                makanan.photo = makananImages[position]
                list.add(makanan)
            }
            return list
        }
}