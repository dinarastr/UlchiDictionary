package com.example.ulchidictionary.adapters

import android.content.Context
import android.content.res.Resources
import android.opengl.Visibility
import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.View.*
import android.view.ViewGroup
import android.widget.TextView
import androidx.asynclayoutinflater.view.AsyncLayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.ulchidictionary.R
import com.example.ulchidictionary.data.RussianWord
import kotlinx.android.synthetic.main.text_row.view.*
import org.w3c.dom.Text


class RussianAdapter(private val onLastItemBound: (Int) -> Unit): RecyclerView.Adapter<RussianAdapter.MyViewHolder>() {
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

       /* if (item.commentthree != null || item.commentfour != null
            || item.commentfive != null || item.commentsix != null || item.commentseven != null
            || item.commenteight != null || item.commentnine != null || item.commentten != null
            || item.commenteleven != null) {
            view.commentthree.visibility = VISIBLE
            view.commentthree.text = view.context.getString(R.string.comment_one,
            item.commentthree, item.commentfour, item.commentfive, item.commentsix,
            item.commentseven, item.commenteight, item.commentnine, item.commentten,
            item.commenteleven)
        } else {
            view.commentthree.visibility = GONE
        }*/

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

       /* if (item.commenttwelve != null) {
            view.commenttwelve.visibility = VISIBLE
            view.commenttwelve.text = item.commenttwelve
        } else {
            view.commenttwelve.visibility = GONE
        }*/

        if (item.ulchifour != null) {
            view.ulchifour.visibility = VISIBLE
            view.ulchifour.text = item.ulchifour
        } else {
            view.ulchifour.visibility = GONE
        }

        if (item.commentsixteen != null) {
            view.commentsixteen.visibility = VISIBLE
            view.commentsixteen.text = item.commentsixteen
        } else {
            view.commentsixteen.visibility = GONE
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
        if (item.commenttwentyseven != null) {
            view.commenttwentyseven.visibility = VISIBLE
            view.commenttwentyseven.text = item.commenttwentyseven
        } else {
            view.commenttwentyseven.visibility = GONE
        }
        if (item.ulchifourteen != null) {
            view.ulchifourteen.visibility = VISIBLE
            view.ulchifourteen.text = item.ulchifourteen
        } else {
            view.ulchifourteen.visibility = GONE
        }
        if (item.commentthirtyfour != null) {
            view.commentthirtyfour.visibility = VISIBLE
            view.commentthirtyfour.text = item.commentthirtyfour
        } else {
            view.commentthirtyfour.visibility = GONE
        }
        if (item.ulchififteen != null) {
            view.ulchififteen.visibility = VISIBLE
            view.ulchififteen.text = item.ulchififteen
        } else {
            view.ulchififteen.visibility = GONE
        }
        if (item.commentthirtysix != null) {
            view.commentthirtysix.visibility = VISIBLE
            view.commentthirtysix.text = item.commentthirtysix
        } else {
            view.commentthirtysix.visibility = GONE
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