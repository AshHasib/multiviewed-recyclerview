package com.example.multiviewedrecycler.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.single_text_post.view.*
import kotlinx.android.synthetic.main.single_text_post.view.imgProfile
import kotlinx.android.synthetic.main.single_text_post.view.txtAuthorName
import kotlinx.android.synthetic.main.single_text_post.view.txtDatePosted
import kotlinx.android.synthetic.main.single_text_post.view.txtPostTitle

class TextPostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val postTitle = itemView.txtPostTitle
    val profileImage = itemView.imgProfile
    val authorName = itemView.txtAuthorName
    val datePosted = itemView.txtDatePosted
    val txtDescription = itemView.txtPostDescription


}