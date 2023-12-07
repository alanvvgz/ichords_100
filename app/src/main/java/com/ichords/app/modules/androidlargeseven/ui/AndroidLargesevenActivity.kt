package com.ichords.app.modules.androidlargeseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityAndroidLargesevenBinding
import com.ichords.app.modules.androidlargeseven.`data`.model.Grid13413RowModel
import com.ichords.app.modules.androidlargeseven.`data`.viewmodel.AndroidLargesevenVM
import com.ichords.app.modules.androidlargethree.ui.AndroidLargethreeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidLargesevenActivity :
    BaseActivity<ActivityAndroidLargesevenBinding>(R.layout.activity_android_largeseven) {
  private val viewModel: AndroidLargesevenVM by viewModels<AndroidLargesevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val grid13413Adapter = Grid13413Adapter(viewModel.grid13413List.value?:mutableListOf())
    binding.recyclerGrid13413.adapter = grid13413Adapter
    grid13413Adapter.setOnItemClickListener(
    object : Grid13413Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Grid13413RowModel) {
        onClickRecyclerGrid13413(view, position, item)
      }
    }
    )
    viewModel.grid13413List.observe(this) {
      grid13413Adapter.updateData(it)
    }
    binding.androidLargesevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImageNine.setOnClickListener {
      val destIntent = AndroidLargethreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageEighteen.setOnClickListener {
      val destIntent = AndroidLargethreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGrid13413(
    view: View,
    position: Int,
    item: Grid13413RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGESEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargesevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
