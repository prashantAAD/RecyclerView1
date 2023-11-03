package www.revengerfitness.blogspot.com.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import www.revengerfitness.blogspot.com.recyclerview1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

       // val songs:List<String> = listOf("prashant","maulik","aarav","tina","prashant","maulik","aarav","tina","prashant","maulik","aarav","tina","prashant","maulik","aarav","tina","prashant","maulik","aarav","tina","prashant","maulik","aarav","tina")
        val songsObjects:MutableList<Song> = mutableListOf<Song>()
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))
        songsObjects.add(Song("prashant","chauhan"))

        binding.songList.adapter=MyAdapter(songsObjects)
       // binding.songList.adapter=MyAdapter(songs)
        binding.songList.layoutManager=LinearLayoutManager(this)

    }

}