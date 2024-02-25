package com.collegeconnect.app.modules.iphone1415promaxthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.collegeconnect.app.R
import com.collegeconnect.app.databinding.RowListvectorSevenBinding
import com.collegeconnect.app.modules.iphone1415promaxthree.`data`.model.ListvectorSevenRowModel
import kotlin.Int
import kotlin.collections.List

class ListvectorSevenAdapter(
  var list: List<ListvectorSevenRowModel>
) : RecyclerView.Adapter<ListvectorSevenAdapter.RowListvectorSevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListvectorSevenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listvector_seven,parent,false)
    return RowListvectorSevenVH(view)
  }

  override fun onBindViewHolder(holder: RowListvectorSevenVH, position: Int) {
    val listvectorSevenRowModel = ListvectorSevenRowModel()
    // TODO uncomment following line after integration with data source
    // val listvectorSevenRowModel = list[position]
    holder.binding.listvectorSevenRowModel = listvectorSevenRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListvectorSevenRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListvectorSevenRowModel
    ) {
    }
  }

  inner class RowListvectorSevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListvectorSevenBinding = RowListvectorSevenBinding.bind(itemView)
  }
}
