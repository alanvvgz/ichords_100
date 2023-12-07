package com.ichords.app.modules.androidlargetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ichords.app.modules.androidlargetwo.`data`.model.AndroidLargetwoModel
import org.koin.core.KoinComponent

class AndroidLargetwoVM : ViewModel(), KoinComponent {
  val androidLargetwoModel: MutableLiveData<AndroidLargetwoModel> =
      MutableLiveData(AndroidLargetwoModel())

  var navArguments: Bundle? = null
}
