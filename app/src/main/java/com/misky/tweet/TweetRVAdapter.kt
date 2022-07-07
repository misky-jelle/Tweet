package com.misky.tweet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class TweetRVAdapter(var tweetList: List<tweet>):
        RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {

        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        holder.tvName.text = currentTweet.name
        holder.tvRetweets.text = currentTweet.retweet
        holder.tvLikes.text = currentTweet.like
        holder.tvComment.text = currentTweet.comment

    }


    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return tweetList.size

    }
}






   class TweetViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
       var  tvName=itemView.findViewById<TextView>(R.id.tvName)
       var  tvComment=itemView.findViewById<TextView>(R.id.tvComment)
       var  tvRetweets=itemView.findViewById<TextView>(R.id.tvReweets)
       var  tvLikes=itemView.findViewById<TextView>(R.id.tvLikes)
//       var  tvNum2=itemView.findViewById<TextView>(R.id.tvNum2)
//       var  tvNum3=itemView.findViewById<TextView>(R.id.tvNum3)
       var  imRetweets=itemView.findViewById<ImageView>(R.id.imRetweet)
       var  imgLikes=itemView.findViewById<ImageView>(R.id.imgLikes)
       var  imgShare=itemView.findViewById<ImageView>(R.id.imgShare)

   }




