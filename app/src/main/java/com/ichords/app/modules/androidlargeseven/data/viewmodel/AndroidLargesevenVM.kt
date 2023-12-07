package com.ichords.app.modules.androidlargeseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ichords.app.modules.androidlargeseven.`data`.model.AndroidLargesevenModel
import com.ichords.app.modules.androidlargeseven.`data`.model.Grid13413RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AndroidLargesevenVM : ViewModel(), KoinComponent {
  val androidLargesevenModel: MutableLiveData<AndroidLargesevenModel> =
      MutableLiveData(AndroidLargesevenModel())

  var navArguments: Bundle? = null

  val grid13413List: MutableLiveData<MutableList<Grid13413RowModel>> =
      MutableLiveData(mutableListOf())
}
