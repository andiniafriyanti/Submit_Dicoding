package com.dicoding.makanankhaspontianak

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMakananAdapter (val listMakanan: ArrayList<Makanan>) : RecyclerView.Adapter<ListMakananAdapter.ListViewHolder>() {

        override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
            val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_makanan, viewGroup, false)
            return ListViewHolder(view)
        }

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val makanan = listMakanan[position]
            Glide.with(holder.itemView.context)
                .load(makanan.photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)
            holder.tvName.text = makanan.name
            holder.tvDetail.text = makanan.detail
        }

        override fun getItemCount(): Int {
            return listMakanan.size
        }

        inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
            var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }
}