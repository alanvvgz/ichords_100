package com.ichords.app.modules.androidlargesix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ichords.app.modules.androidlargesix.`data`.model.AndroidLargesixModel
import org.koin.core.KoinComponent

class AndroidLargesixVM : ViewModel(), KoinComponent {
  val androidLargesixModel: MutableLiveData<AndroidLargesixModel> =
      MutableLiveData(AndroidLargesixModel())

  var navArguments: Bundle? = null
}
