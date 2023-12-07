package com.ichords.app.modules.androidlargesix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityAndroidLargesixBinding
import com.ichords.app.modules.androidlargesix.`data`.viewmodel.AndroidLargesixVM
import com.ichords.app.modules.androidlargethree.ui.AndroidLargethreeActivity
import kotlin.String
import kotlin.Unit

class AndroidLargesixActivity :
    BaseActivity<ActivityAndroidLargesixBinding>(R.layout.activity_android_largesix) {
  private val viewModel: AndroidLargesixVM by viewModels<AndroidLargesixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargesixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImageTen.setOnClickListener {
      val destIntent = AndroidLargethreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGESIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargesixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
