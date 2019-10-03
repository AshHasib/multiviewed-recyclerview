package com.example.multiviewedrecycler.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_img_post.view.*

class ImagePostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val postTitle = itemView.txtPostTitle
    val profileImage = itemView.imgProfile
    val authorName = itemView.txtAuthorName
    val datePosted = itemView.txtDatePosted
    val txtDescription = itemView.txtPostDescription

    val imagePost = itemView.image

}