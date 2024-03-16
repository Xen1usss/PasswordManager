package xen.passwordmanager.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import xen.passwordmanager.R
import xen.passwordmanager.databinding.SiteItemBinding
import xen.passwordmanager.domain.SiteCard

class SiteAdapter : RecyclerView.Adapter<SiteAdapter.SiteHolder>() {

    val siteCardList = mutableListOf<SiteCard>() // принципиален ли mutableList? // mutable?

    class SiteHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = SiteItemBinding.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiteHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.site_item, parent, false)
        return SiteHolder(view)
    }

    override fun getItemCount(): Int {
        return siteCardList.size
    }

    override fun onBindViewHolder(holder: SiteHolder, position: Int) {
        val siteCard = siteCardList[position]
        // holder.binding.password.text = SiteCard.password
        // holder.binding.picture.? = SiteCard.image
    }

    fun setSiteCardList(dataToSet: List<SiteCard>) {
        siteCardList.clear() // вопрос про массивы, списки, мут.списки
        siteCardList += dataToSet // +=?
        notifyDataSetChanged()
    }

/*    fun setCardList(siteCard: SiteCard){ // нужно ли clear?
        siteCard.add(siteCard)
        notifyDataSetChanged()

    }*/

}