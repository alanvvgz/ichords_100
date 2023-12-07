package com.ichords.app.modules.androidlargefive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ichords.app.modules.androidlargefive.`data`.model.AndroidLargefiveModel
import org.koin.core.KoinComponent

class AndroidLargefiveVM : ViewModel(), KoinComponent {
  val androidLargefiveModel: MutableLiveData<AndroidLargefiveModel> =
      MutableLiveData(AndroidLargefiveModel())

  var navArguments: Bundle? = null
}
