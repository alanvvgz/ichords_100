package com.ichords.app.modules.androidlargeseven.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargesevenModel(

  var txtClodoaldoCleit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_clodoaldo_cleit)
  ,

  var txtPREFERNCIAMUS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_prefer_ncia_mus)
  ,

  var txtMPB: String? = MyApp.getInstance().resources.getString(R.string.lbl_mpb)

)
