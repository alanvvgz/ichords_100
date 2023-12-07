package com.ichords.app.modules.androidlargefive.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargefiveModel(

  var txtATIVIDADE: String? = MyApp.getInstance().resources.getString(R.string.lbl_atividade)
  ,

  var txtQUALNOTAPODE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_qual_nota_pode)

)
