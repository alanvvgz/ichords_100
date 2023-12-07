package com.ichords.app.modules.androidlargefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ichords.app.modules.androidlargefour.`data`.model.AndroidLargefourModel
import org.koin.core.KoinComponent

class AndroidLargefourVM : ViewModel(), KoinComponent {
  val androidLargefourModel: MutableLiveData<AndroidLargefourModel> =
      MutableLiveData(AndroidLargefourModel())

  var navArguments: Bundle? = null
}
