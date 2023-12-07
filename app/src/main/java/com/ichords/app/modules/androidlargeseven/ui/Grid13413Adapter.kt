package com.ichords.app.modules.androidlargeseven.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ichords.app.R
import com.ichords.app.databinding.RowGrid13413Binding
import com.ichords.app.modules.androidlargeseven.`data`.model.Grid13413RowModel
import kotlin.Int
import kotlin.collections.List

class Grid13413Adapter(
  var list: List<Grid13413RowModel>
) : RecyclerView.Adapter<Grid13413Adapter.RowGrid13413VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGrid13413VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_grid13413,parent,false)
    return RowGrid13413VH(view)
  }

  override fun onBindViewHolder(holder: RowGrid13413VH, position: Int) {
    val grid13413RowModel = Grid13413RowModel()
    // TODO uncomment following line after integration with data source
    // val grid13413RowModel = list[position]
    holder.binding.grid13413RowModel = grid13413RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Grid13413RowModel>) {
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
      item: Grid13413RowModel
    ) {
    }
  }

  inner class RowGrid13413VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGrid13413Binding = RowGrid13413Binding.bind(itemView)
  }
}
