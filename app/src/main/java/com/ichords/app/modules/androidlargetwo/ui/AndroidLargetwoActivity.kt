package com.ichords.app.modules.androidlargetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityAndroidLargetwoBinding
import com.ichords.app.modules.androidlargetwo.`data`.viewmodel.AndroidLargetwoVM
import com.ichords.app.modules.frameone.ui.FrameOneActivity
import kotlin.String
import kotlin.Unit

class AndroidLargetwoActivity :
    BaseActivity<ActivityAndroidLargetwoBinding>(R.layout.activity_android_largetwo) {
  private val viewModel: AndroidLargetwoVM by viewModels<AndroidLargetwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargetwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCriarConta.setOnClickListener {
      val destIntent = FrameOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGETWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargetwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
