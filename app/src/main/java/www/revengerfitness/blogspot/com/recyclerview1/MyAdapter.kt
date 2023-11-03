package www.revengerfitness.blogspot.com.recyclerview1

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/**
 * adapter takes data and context.
 * adapter extends Adapter class in which it takes inner class of view holder. */
//class MyAdapter(private val songs: List<String>):
class MyAdapter(private val songs: List<Song>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    /**
     * its a nested class*/
    class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {// it takes view as parameter and extend with ViewHolder class
// stores references of views in view holder class

        var newsTitle: TextView = itemView.findViewById(R.id.txtTitle)
        var newsDescription: TextView = itemView.findViewById(R.id.txtDescription)
        var container: LinearLayout = itemView.findViewById<LinearLayout>(R.id.container)

    }

    /**
     * create view holder and store views.
     * layout inflater converts xml view which is item_view into java object.*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context) // create layout inflater object
        val view = inflater.inflate(R.layout.item_view, parent, false) // create view
        return MyViewHolder(view) // stores views in view holder ArticleViewHolder(itemView: View) and return it

    }

    /**
     * it use to bind data in views hold by view holder and it takes holder and position */
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // holder.newsTitle.text=songs[position]
        holder.newsTitle.text = songs[position].title // Song object
        // holder.newsDescription.text=songs[position]
        holder.newsDescription.text = songs[position].description
        // passing color to recycle view
        var color="#CCCCCC"
        if (position%2==0){
            color="#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))

    }

    override fun getItemCount(): Int { // it tells us about no of items going to show in recycler view.
        return songs.size
    }

}

