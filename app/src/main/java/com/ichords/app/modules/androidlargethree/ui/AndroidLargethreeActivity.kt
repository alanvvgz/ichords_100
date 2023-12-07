package com.ichords.app.modules.androidlargethree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityAndroidLargethreeBinding
import com.ichords.app.modules.androidlargefour.ui.AndroidLargefourActivity
import com.ichords.app.modules.androidlargeseven.ui.AndroidLargesevenActivity
import com.ichords.app.modules.androidlargethree.`data`.viewmodel.AndroidLargethreeVM
import kotlin.String
import kotlin.Unit

class AndroidLargethreeActivity :
    BaseActivity<ActivityAndroidLargethreeBinding>(R.layout.activity_android_largethree) {
  private val viewModel: AndroidLargethreeVM by viewModels<AndroidLargethreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargethreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnIniciar.setOnClickListener {
      val destIntent = AndroidLargefourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageTwenty.setOnClickListener {
      val destIntent = AndroidLargesevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGETHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargethreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
