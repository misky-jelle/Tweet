package com.misky.tweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.misky.tweet.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var tweet=tweet("Khloe @khloeh 47min","I choose happiness over everything ","","","","","","35","10","13")
        var tweet1=tweet("Robert @robby 3min","I treat others the way I want to be treated","","","","","","64","36","88")
        var tweet2=tweet("Mwangi @mwas 20min","I understand how precious time is","","","","","","63","36","53")
        var tweet3=tweet("Shee @shesh  12min","I'm not sure what will happen tomorrow","","","","","","65","64","46")
        var tweet4=tweet("Lisa @lisas  34min","My opinion of me is more important than others' opinion of me.","","","","","","47","36","73")
        var tweet5=tweet("liz @lisabell  30min","I deserve to be.I am responsible for my own happiness.","","","","","","76","45","73")

        var  contactList=listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)
        var contactAdapter=TweetRVAdapter(contactList)
        binding.rcvTweet.layoutManager = LinearLayoutManager(this)
        binding.rcvTweet.adapter=contactAdapter

    }
}