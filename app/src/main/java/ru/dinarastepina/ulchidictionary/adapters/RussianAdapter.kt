package ru.dinarastepina.ulchidictionary.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.View.*
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.dinarastepina.ulchidictionary.data.RussianWord
import kotlinx.android.synthetic.main.text_row.view.*
import ru.dinarastepina.ulchidictionary.R


class RussianAdapter(private val onLastItemBound: (Int) -> Unit):
    RecyclerView.Adapter<RussianAdapter.MyViewHolder>() {
    var russianList = emptyList<RussianWord>()
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun getItemCount(): Int {
        return russianList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = russianList[position]
        val view = holder.itemView
            view.russian.text = item.russian
        if (item.ulchione != null) {
            view.ulchione.show()
            view.ulchione.text = item.ulchione
        } else {
            view.ulchione.hide()
        }

        if (item.exampleone != null) {
            view.exampleone.show()
            view.exampleone.text = item.exampleone
        } else {
            view.exampleone.hide()
        }

        if (item.exampleonerus != null) {
            view.exampleonerus.visibility = VISIBLE
            view.exampleonerus.text = item.exampleonerus
        } else {
            view.exampleonerus.visibility = GONE
        }

        if (item.commentone != null) {
            view.commentone.visibility = VISIBLE
            view.commentone.text = item.commentone
        } else {
            view.commentone.visibility = GONE
        }

        if (item.ulchitwo != null) {
            view.ulchitwo.visibility = VISIBLE
            view.ulchitwo.text = item.ulchitwo
        } else {
            view.ulchitwo.visibility = GONE
        }

        if (item.commenttwo != null) {
            view.commenttwo.visibility = VISIBLE
            view.commenttwo.text = item.commenttwo
        } else {
            view.commenttwo.visibility = GONE
        }

        if (item.ulchithree != null) {
            view.ulchithree.visibility = VISIBLE
            view.ulchithree.text = item.ulchithree
        } else {
            view.ulchithree.visibility = GONE
        }

        val comment = StringBuilder()
        if (item.commentthree != null) {
            comment.append(item.commentthree)
        }
        if (item.commentfour != null) {
            comment.append("\n")
            comment.append(item.commentfour)
        }
        if (item.commentfive != null) {
            comment.append("\n")
            comment.append(item.commentfive)
        }
        if (item.commentsix != null) {
            comment.append("\n")
            comment.append(item.commentsix)
        }
        if (item.commentseven != null) {
            comment.append("\n")
            comment.append(item.commentseven)
        }
        if (item.commenteight != null) {
            comment.append("\n")
            comment.append(item.commenteight)
        }
        if (item.commentnine != null) {
            comment.append("\n")
            comment.append(item.commentnine)
        }
        if (item.commentten != null) {
            comment.append("\n")
            comment.append(item.commentten)
        }
        if (item.commenteleven != null) {
            comment.append("\n")
            comment.append(item.commenteleven)
        }

        if (comment.isNotEmpty()) {
            view.commentthree.show()
            view.commentthree.text = comment
        } else {
            view.commentthree.hide()
        }

        if (item.exampletwo != null) {
            view.exampletwo.visibility = VISIBLE
            view.exampletwo.text = item.exampletwo
        } else {
            view.exampletwo.visibility = GONE
        }

        if (item.exampletworus != null) {
            view.exampletworus.visibility = VISIBLE
            view.exampletworus.text = item.exampletworus
        } else {
            view.exampletworus.visibility = GONE
        }

        if (item.examplethree != null) {
            view.examplethree.visibility = VISIBLE
            view.examplethree.text = item.examplethree
        } else {
            view.examplethree.visibility = GONE
        }

        if (item.examplethreerus != null) {
            view.examplethreerus.visibility = VISIBLE
            view.examplethreerus.text = item.examplethreerus
        } else {
            view.examplethreerus.visibility = GONE
        }

        if (item.examplefour != null) {
            view.examplefour.visibility = VISIBLE
            view.examplefour.text = item.examplefour
        } else {
            view.examplefour.visibility = GONE
        }

        if (item.examplefourrus != null) {
            view.examplefourrus.visibility = VISIBLE
            view.examplefourrus.text = item.examplefourrus
        } else {
            view.examplefourrus.visibility = GONE
        }

        val commentTwo = StringBuilder()

       if (item.commenttwelve != null) {
           commentTwo.append(item.commenttwelve)
        }
        if (item.grammar != null) {
            commentTwo.append("\n")
            commentTwo.append(item.grammar)
        }
        if (item.commentthirteen != null) {
            commentTwo.append("\n")
            commentTwo.append(item.commentthirteen)
        }
        if (item.commentfourteen != null) {
            commentTwo.append("\n")
            commentTwo.append(item.commentfourteen)
        }
        if (item.commentfifteen != null) {
            commentTwo.append("\n")
            commentTwo.append(item.commentfifteen)
        }
        if (commentTwo.isNotEmpty()) {
            view.commenttwelve.show()
            view.commenttwelve.text = commentTwo
        } else {
            view.commenttwelve.hide()
        }


        if (item.ulchifour != null) {
            view.ulchifour.visibility = VISIBLE
            view.ulchifour.text = item.ulchifour
        } else {
            view.ulchifour.visibility = GONE
        }

        val commentThree = StringBuilder()
        if (item.commentsixteen != null) {
            commentThree.append(item.commentsixteen)
        }
        if (item.commentseventeen != null) {
            commentThree.append("\n")
            commentThree.append(item.commentseventeen)
        }
        if (commentThree.isNotEmpty()) {
            view.commentsixteen.show()
            view.commentsixteen.text = commentThree
        } else {
            view.commentsixteen.hide()
        }
        if (item.examplefiverus != null) {
            view.examplefiverus.visibility = VISIBLE
            view.examplefiverus.text = item.examplefiverus
        } else {
            view.examplefiverus.visibility = GONE
        }
        if (item.commenteighteen != null) {
            view.commenteighteen.visibility = VISIBLE
            view.commenteighteen.text = item.commenteighteen
        } else {
            view.commenteighteen.visibility = GONE
        }
        if (item.ulchifive != null) {
            view.ulchifive.visibility = VISIBLE
            view.ulchifive.text = item.ulchifive
        } else {
            view.ulchifive.visibility = GONE
        }
        if (item.commentnineteen != null) {
            view.commentnineteen.visibility = VISIBLE
            view.commentnineteen.text = item.commentnineteen
        } else {
            view.commentnineteen.visibility = GONE
        }
        if (item.ulchisix != null) {
            view.ulchisix.visibility = VISIBLE
            view.ulchisix.text = item.ulchisix
        } else {
            view.ulchisix.visibility = GONE
        }
        if (item.commenttwenty != null) {
            view.commenttwenty.visibility = VISIBLE
            view.commenttwenty.text = item.commenttwenty
        } else {
            view.commenttwenty.visibility = GONE
        }
        if (item.ulchiseven != null) {
            view.ulchiseven.visibility = VISIBLE
            view.ulchiseven.text = item.ulchiseven
        } else {
            view.ulchiseven.visibility = GONE
        }
        if (item.commenttwentyone != null) {
            view.commenttwentyone.visibility = VISIBLE
            view.commenttwentyone.text = item.commenttwentyone
        } else {
            view.commenttwentyone.visibility = GONE
        }
        if (item.ulchieight != null) {
            view.ulchieight.visibility = VISIBLE
            view.ulchieight.text = item.ulchieight
        } else {
            view.ulchieight.visibility = GONE
        }

        if (item.commenttwentytwo != null) {
            view.commenttwentytwo.visibility = VISIBLE
            view.commenttwentytwo.text = item.commenttwentytwo
        } else {
            view.commenttwentytwo.visibility = GONE
        }
        if (item.ulchinine != null) {
            view.ulchinine.visibility = VISIBLE
            view.ulchinine.text = item.ulchinine
        } else {
            view.ulchinine.visibility = GONE
        }
        if (item.commenttwentythree != null) {
            view.commenttwentythree.visibility = VISIBLE
            view.commenttwentythree.text = item.commenttwentythree
        } else {
            view.commenttwentythree.visibility = GONE
        }
        if (item.ulchiten != null) {
            view.ulchiten.visibility = VISIBLE
            view.ulchiten.text = item.ulchiten
        } else {
            view.ulchiten.visibility = GONE
        }
        if (item.commenttwentyfour != null) {
            view.commenttwentyfour.visibility = VISIBLE
            view.commenttwentyfour.text = item.commenttwentyfour
        } else {
            view.commenttwentyfour.visibility = GONE
        }
        if (item.ulchieleven != null) {
            view.ulchieleven.visibility = VISIBLE
            view.ulchieleven.text = item.ulchieleven
        } else {
            view.ulchieleven.visibility = GONE
        }
        if (item.commenttwentyfive != null) {
            view.commenttwentyfive.visibility = VISIBLE
            view.commenttwentyfive.text = item.commenttwentyfive
        } else {
            view.commenttwentyfive.visibility = GONE
        }
        if (item.ulchitwelve != null) {
            view.ulchitwelve.visibility = VISIBLE
            view.ulchitwelve.text = item.ulchitwelve
        } else {
            view.ulchitwelve.visibility = GONE
        }
        if (item.examplesix != null) {
            view.examplesix.visibility = VISIBLE
            view.examplesix.text = item.examplesix
        } else {
            view.examplesix.visibility = GONE
        }
        if (item.examplesixrus != null) {
            view.examplesixrus.visibility = VISIBLE
            view.examplesixrus.text = item.examplesixrus
        } else {
            view.examplesixrus.visibility = GONE
        }
        if (item.exampleseven != null) {
            view.exampleseven.visibility = VISIBLE
            view.exampleseven.text = item.exampleseven
        } else {
            view.exampleseven.visibility = GONE
        }
        if (item.examplesevenrus != null) {
            view.examplesevenrus.visibility = VISIBLE
            view.examplesevenrus.text = item.examplesevenrus
        } else {
            view.examplesevenrus.visibility = GONE
        }
        if (item.commenttwentysix != null) {
            view.commenttwentysix.visibility = VISIBLE
            view.commenttwentysix.text = item.commenttwentysix
        } else {
            view.commenttwentysix.visibility = GONE
        }
        if (item.ulchithirteen != null) {
            view.ulchithirteen.visibility = VISIBLE
            view.ulchithirteen.text = item.ulchithirteen
        } else {
            view.ulchithirteen.visibility = GONE
        }

        val commentFour = StringBuilder()
        if (item.commenttwentyseven != null) {
            commentFour.append(item.commenttwentyseven)
        }
        if (item.commenttwentyeight != null) {
            commentFour.append("\n")
            commentFour.append(item.commenttwentyeight)
        }
        if (item.commenttwentynine != null) {
            commentFour.append("\n")
            commentFour.append(item.commenttwentynine)
        }
        if (item.commentthirty != null) {
            commentFour.append("\n")
            commentFour.append(item.commentthirty)
        }
        if (item.commentthirtyone != null) {
            commentFour.append("\n")
            commentFour.append(item.commentthirtyone)
        }
        if (item.commentthirtytwo != null) {
            commentFour.append("\n")
            commentFour.append(item.commentthirtytwo)
        }
        if (item.commentthirtythree != null) {
            commentFour.append("\n")
            commentFour.append(item.commentthirtythree)
        }
        if (commentFour.isNotEmpty()) {
            view.commenttwentyseven.show()
            view.commenttwentyseven.text = commentFour
        } else {
            view.commenttwentyseven.hide()
        }

        if (item.ulchifourteen != null) {
            view.ulchifourteen.visibility = VISIBLE
            view.ulchifourteen.text = item.ulchifourteen
        } else {
            view.ulchifourteen.visibility = GONE
        }

        val commentFive = StringBuilder()
        if (item.commentthirtyfour != null) {
            commentFive.append(item.commentthirtyfour)
        }
        if (item.commentthirtyfive != null) {
            commentFive.append("\n")
            commentFive.append(item.commentthirtyfive)
        }
        if (commentFive.isNotEmpty()) {
            view.commentthirtyfour.show()
            view.commentthirtyfour.text = commentFive
        } else {
            view.commentthirtyfour.hide()
        }
        if (item.ulchififteen != null) {
            view.ulchififteen.visibility = VISIBLE
            view.ulchififteen.text = item.ulchififteen
        } else {
            view.ulchififteen.visibility = GONE
        }
        val commentSix = StringBuilder()
        if (item.commentthirtysix != null) {
            commentSix.append(item.commentthirtysix)
        }
        if (item.commentthirtyseven != null) {
            commentSix.append("\n")
            commentSix.append(item.commentthirtyseven)
        }
        if (commentSix.isNotEmpty()) {
            view.commentthirtysix.show()
            view.commentthirtysix.text = commentSix
        } else {
            view.commentthirtysix.hide()
        }
        if (item.ulchisixteen != null) {
            view.ulchisixteen.visibility = VISIBLE
            view.ulchisixteen.text = item.ulchisixteen
        } else {
            view.ulchisixteen.visibility = GONE
        }
        if (position == russianList.size-1) onLastItemBound(russianList.size)
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row, parent, false)
        return MyViewHolder(view)
    }

    fun setData(russian: List<RussianWord>) {
        russianList = russian
        notifyDataSetChanged()
    }
}

private fun TextView.hide() {
    visibility = GONE
}

private fun TextView.show() {
    visibility = VISIBLE
}