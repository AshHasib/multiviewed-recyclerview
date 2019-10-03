package com.example.multiviewedrecycler.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiviewedrecycler.R
import com.example.multiviewedrecycler.models.Post
import com.example.multiviewedrecycler.viewholders.TextPostViewHolder
import com.example.multiviewedrecycler.viewholders.ImagePostViewHolder
import com.squareup.picasso.Picasso

class PostAdapter(val context: Context, val postList: List<Post>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val POST_TEXT_TYPE = 1
    val POST_IMAGE_TYPE = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if(viewType == POST_TEXT_TYPE) {
            val view = LayoutInflater.from(context).inflate(R.layout.single_text_post, parent, false)
            TextPostViewHolder(view)
        }
        else {
            val view = LayoutInflater.from(context).inflate(R.layout.single_img_post, parent, false)
            ImagePostViewHolder(view)
        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if(holder.itemViewType == POST_TEXT_TYPE) {
            val viewHolder = holder as TextPostViewHolder
            val post = postList.get(position)

            viewHolder.postTitle.setText(post.postTitle)
            viewHolder.profileImage.setImageResource(post.profileImg)
            viewHolder.authorName.setText(post.authorName)
            viewHolder.datePosted.setText("Published on: ${post.timePosted}")
            viewHolder.txtDescription.setText(post.postDescription)
        }
        else {
            val viewHolder = holder as ImagePostViewHolder
            val post = postList.get(position)

            viewHolder.postTitle.setText(post.postTitle)
            viewHolder.profileImage.setImageResource(post.profileImg)
            viewHolder.authorName.setText(post.authorName)
            viewHolder.datePosted.setText("Published on: ${post.timePosted}")
            viewHolder.txtDescription.setText(post.postDescription)

            Picasso.get()
                .load(post.imgUrl)
                .into(viewHolder.imagePost)
        }
    }


    override fun getItemViewType(position: Int): Int {
        return postList.get(position).postType
    }
}