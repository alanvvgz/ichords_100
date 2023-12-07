package com.ichords.app.modules.androidlargefour.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargefourModel(

  var txtAULAumACORDE: String? = MyApp.getInstance().resources.getString(R.string.lbl_aula_1_acorde)

)
