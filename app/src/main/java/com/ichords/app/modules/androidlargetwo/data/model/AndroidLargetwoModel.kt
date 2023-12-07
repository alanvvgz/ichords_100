package com.ichords.app.modules.androidlargetwo.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargetwoModel(

  var txtICHORDS: String? = MyApp.getInstance().resources.getString(R.string.lbl_ichords)
  ,

  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_nome)
  ,

  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail)
  ,

  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_senha)
  ,

  var txtLanguageThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_repetir_a_senha)
  ,

  var txtOu: String? = MyApp.getInstance().resources.getString(R.string.lbl_ou)
  ,

  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_continuar_sem_l)
  ,

  var txtLanguageFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_j_tem_uma_cont)
  ,

  var txtEntrar: String? = MyApp.getInstance().resources.getString(R.string.lbl_entrar2)

)
