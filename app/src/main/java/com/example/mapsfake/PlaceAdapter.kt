import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import Model.Place
import com.example.mapsfake.R

class PlaceAdapter(private val placeList: List<Place>) : RecyclerView.Adapter<PlaceAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_item_layout, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentPlace = placeList[position]
        holder.nameTextView.text = currentPlace.name
        holder.statusTextView.text = currentPlace.status
        holder.adminTextView.text = currentPlace.admin
        holder.authorizeButton.setOnClickListener {
            // Implementar lógica para autorizar al usuario
        }
        holder.denegateButton.setOnClickListener {
            // Implementar lógica para denegar al usuario
        }
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.text_name)
        val statusTextView: TextView = itemView.findViewById(R.id.text_status)
        val adminTextView: TextView = itemView.findViewById(R.id.text_admin)
        val authorizeButton: Button = itemView.findViewById(R.id.button_authorize)
        val denegateButton: Button = itemView.findViewById(R.id.button_denegate)
    }
}
