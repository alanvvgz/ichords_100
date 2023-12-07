package com.ichords.app.modules.androidlargefive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityAndroidLargefiveBinding
import com.ichords.app.modules.androidlargefive.`data`.viewmodel.AndroidLargefiveVM
import com.ichords.app.modules.androidlargesix.ui.AndroidLargesixActivity
import com.ichords.app.modules.androidlargethree.ui.AndroidLargethreeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidLargefiveActivity :
    BaseActivity<ActivityAndroidLargefiveBinding>(R.layout.activity_android_largefive) {
  private val viewModel: AndroidLargefiveVM by viewModels<AndroidLargefiveVM>()

  private val REQUEST_CODE_ANDROID_LARGESIX_ACTIVITY: Int = 946

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargefiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImageNine.setOnClickListener {
      val destIntent = AndroidLargethreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFa.setOnClickListener {
      val destIntent = AndroidLargesixActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_ANDROID_LARGESIX_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGEFIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargefiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
