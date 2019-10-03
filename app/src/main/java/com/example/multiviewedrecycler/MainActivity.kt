package com.example.multiviewedrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiviewedrecycler.adapters.PostAdapter
import com.example.multiviewedrecycler.models.Post
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lipsum = "\"Lorem ipsum dolor sit amet, consectetur adipiscing quis nostrud exercitation ullamco laboris ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur"


        val postList = ArrayList<Post>()

        postList.add(Post("What a day!!","John Doe",lipsum
            ,R.drawable.ic_profile,"17/8/2019","https://source.unsplash.com/random/150x150",2))
        postList.add(Post("This has to be stopped","Tony Stark",lipsum
            ,R.drawable.ic_profile,"28/9/2019","",1))
        postList.add(Post("Is Jane Dying!!","Mark Ruffalo",lipsum
            ,R.drawable.ic_profile,"1/11/2019","https://source.unsplash.com/random/150x150",2))

        val adapter = PostAdapter(context = this, postList = postList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.hasFixedSize()
        recyclerView.adapter = adapter


    }
}
