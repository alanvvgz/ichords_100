package com.ichords.app.modules.androidlargethree.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargethreeModel(

  var txtICHORDS: String? = MyApp.getInstance().resources.getString(R.string.lbl_ichords)
  ,

  var txtACORDE: String? = MyApp.getInstance().resources.getString(R.string.lbl_acorde)
  ,

  var txtAulaCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_aula_1)
  ,

  var txtGroupThirtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_6)
  ,

  var txtAFINAO: String? = MyApp.getInstance().resources.getString(R.string.lbl_afina_o)
  ,

  var txtPOSTURA: String? = MyApp.getInstance().resources.getString(R.string.lbl_postura)
  ,

  var txtE: String? = MyApp.getInstance().resources.getString(R.string.lbl_e)
  ,

  var txtGroupThirtyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_6)
  ,

  var txtTEORIA: String? = MyApp.getInstance().resources.getString(R.string.lbl_teoria)
  ,

  var txtMUSICAL: String? = MyApp.getInstance().resources.getString(R.string.lbl_musical)
  ,

  var txtGroupTwentySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_6)

)
