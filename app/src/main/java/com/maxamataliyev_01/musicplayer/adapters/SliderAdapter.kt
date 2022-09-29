package com.maxamataliyev_01.musicplayer.adapters

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.maxamataliyev_01.musicplayer.R
import com.maxamataliyev_01.musicplayer.classes.MusicClass
import com.maxamataliyev_01.musicplayer.databinding.SliderItemBinding

class SliderAdapter(var context: Context, var list: List<MusicClass>) : RecyclerView.Adapter<SliderAdapter.VH>() {

    inner class VH(var binding: SliderItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(SliderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.apply {
            val parse = Uri.parse(list[position].imageUri)
            if (parse != null)
                Glide.with(context).load(parse).placeholder(R.drawable.stellio).into(imageSlide)
        }
    }

    override fun getItemCount(): Int = list.size


}