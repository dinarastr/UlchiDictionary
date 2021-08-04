package ru.dinarastepina.ulchidictionary.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.dinarastepina.ulchidictionary.R
import ru.dinarastepina.ulchidictionary.data.UlchiWord
import kotlinx.android.synthetic.main.ulchi_row.view.*

class UlchiAdapter(private val onLastItemBound: (Int) -> Unit):
    RecyclerView.Adapter<UlchiAdapter.MyViewHolder>() {

    var ulchiList = emptyList<UlchiWord>()

    class MyViewHolder(item: View): RecyclerView.ViewHolder(item)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ulchi_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = ulchiList[position]
        val view = holder.itemView
        view.ulchi.text = item.ulchi
        if (item.commentone != null) {
            view.commentone.show()
            view.commentone.text = item.commentone
        } else {
            view.commentone.hide()
        }
        if (item.russian != null) {
            view.russian.show()
            view.russian.text = item.russian
        } else {
            view.russian.hide()
        }

        if (item.commenttwo != null) {
            view.commenttwo.show()
            view.commenttwo.text = item.commenttwo
        } else {
            view.commenttwo.hide()
        }

        if (item.russianone != null) {
            view.russianone.show()
            view.russianone.text = item.russianone
        } else {
            view.russianone.hide()
        }
        if (item.exampleone != null) {
            view.exampleone.show()
            view.exampleone.text = item.exampleone
        } else {
            view.exampleone.hide()
        }

        if (item.exampleonerus != null) {
            view.exampleonerus.show()
            view.exampleonerus.text = item.exampleonerus
        } else {
            view.exampleonerus.hide()
        }
        if (item.exampletwo != null) {
            view.exampletwo.show()
            view.exampletwo.text = item.exampletwo
        } else {
            view.exampletwo.hide()
        }

        if (item.exampletworus != null) {
            view.exampletworus.show()
            view.exampletworus.text = item.exampletworus
        } else {
            view.exampletworus.hide()
        }

        if (item.commentthree != null) {
              view.commentthree.show()
            view.commentthree.text = item.commentthree
          } else {
              view.commentthree.hide()
        }

        val commentfour = StringBuilder()

        if (item.commentfour != null) {
            commentfour.append(item.commentfour)
        }
        if (item.commentfive != null) {
            commentfour.append("\n")
            commentfour.append(item.commentfive)
        }

        if (commentfour.isNotEmpty()) {
            view.commentfour.show()
            view.commentfour.text = commentfour

        } else {
            view.commentfour.hide()
        }
        if (item.russiantwo != null) {
            view.russiantwo.show()
            view.russiantwo.text = item.russiantwo
        } else {
            view.russiantwo.hide()
        }

        if (item.commentsix != null) {
            view.commentsix.show()
            view.commentsix.text = item.commentsix
        } else {
            view.commentsix.hide()
        }

        if (item.russianthree != null) {
            view.russianthree.show()
            view.russianthree.text = item.russianthree
        } else {
            view.russianthree.hide()
        }

        val folk = StringBuilder()

        if (item.folk != null) {
            folk.append(item.folk)
        }
        if (item.commentseven != null) {
            folk.append("\n")
            folk.append(item.commentseven)
        }
        if (folk.isNotEmpty()) {
            view.folk.show()
            view.folk.text = folk
        } else {
            view.folk.hide()
        }

        if (item.examplethree != null) {
            view.examplethree.show()
            view.examplethree.text = item.examplethree
        } else {
            view.examplethree.hide()
        }

        val commentEight = StringBuilder(
        )
        if (item.commenteight != null) {
            commentEight.append(view.commenteight)
        }
        if (item.commentnine != null) {
            commentEight.append("\n")
            commentEight.append(item.commentnine)
        }
        if (item.commentten != null) {
            commentEight.append("\n")
            commentEight.append(item.commentten)
        }

        if (commentEight.isNotEmpty()) {
            view.commenteight.show(
            )
            view.commenteight.text = commentEight
        } else {
            view.commenteight.hide()
        }

        val russian = StringBuilder()
        if (item.russianfour != null) {
            russian.append(item.russianfour)
        }
        if (item.russianfive != null) {
            russian.append("\n")
            russian.append(item.russianfive)
        }
        if (russian.isNotEmpty()) {
            view.russianfour.show()
            view.russianfour.text = russian
        } else {
            view.russianfour.hide()
        }

        if (item.commenteleven != null) {
            view.commenteleven.show()
            view.commenteleven.text = item.commenteleven
        } else {
            view.commenteleven.hide()
        }

        if (item.examplefour != null) {
            view.examplefour.show()
            view.examplefour.text = item.examplefour
        } else {
            view.examplefour.hide()
        }
        if (item.examplefourrus != null) {
            view.examplefourrus.show()
            view.examplefourrus.text = item.examplefourrus
        } else {
            view.examplefourrus.hide()
        }

        if (item.commenttwelve != null) {
            view.commenttwelve.show()
            view.commenttwelve.text = item.commenttwelve
        } else {
            view.commenttwelve.hide()
        }

        if (item.examplefiverus != null) {
            view.examplefiverus.show()
            view.examplefiverus.text = item.examplefiverus
        } else {
            view.examplefiverus.hide()
        }

        if (item.russiansix != null) {
            view.russiansix.show()
            view.russiansix.text = item.russiansix
        } else {
            view.russiansix.hide()
        }

        val commentThirteen = StringBuilder()
        if (item.commentthirteen != null) {
            commentThirteen.append(item.commentthirteen)
        }
        if (item.commentfourteen != null) {
            russian.append("\n")
            commentThirteen.append(item.commentfourteen)
        }
        if (commentThirteen.isNotEmpty()) {
            view.commentthirteen.show()
            view.commentthirteen.text = commentThirteen
        } else {
            view.commentthirteen.hide()
        }

        if (item.russianseven != null) {
            view.russianseven.show()
            view.russianseven.text = item.russianseven
        } else {
            view.russianseven.hide()
        }

        if (item.gram != null) {
            view.gram.show()
            view.gram.text = item.gram
        } else {
            view.gram.hide()
        }
        if (position == ulchiList.size-1) onLastItemBound(ulchiList.size)
    }

    override fun getItemCount(): Int {
       return ulchiList.size
    }

    fun setData(ulchi: List<UlchiWord>) {
        ulchiList = ulchi
        notifyDataSetChanged()
    }
}

private fun TextView.hide() {
    visibility = View.GONE
}

private fun TextView.show() {
    visibility = View.VISIBLE
}