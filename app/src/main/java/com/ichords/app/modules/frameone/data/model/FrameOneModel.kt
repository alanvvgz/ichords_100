package com.ichords.app.modules.frameone.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class FrameOneModel(

  var txtICHORDS: String? = MyApp.getInstance().resources.getString(R.string.lbl_ichords)
  ,

  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail)
  ,

  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_senha)
  ,

  var txtEsqueciasenha: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_esqueci_a_senha)
  ,

  var txtOu: String? = MyApp.getInstance().resources.getString(R.string.lbl_ou)
  ,

  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_continuar_sem_l)
  ,

  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_n_o_tem_uma_con)
  ,

  var txtCriar: String? = MyApp.getInstance().resources.getString(R.string.lbl_criar)

)
