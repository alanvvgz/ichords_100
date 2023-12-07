package com.ichords.app.modules.androidlargethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ichords.app.modules.androidlargethree.`data`.model.AndroidLargethreeModel
import org.koin.core.KoinComponent

class AndroidLargethreeVM : ViewModel(), KoinComponent {
  val androidLargethreeModel: MutableLiveData<AndroidLargethreeModel> =
      MutableLiveData(AndroidLargethreeModel())

  var navArguments: Bundle? = null
}
