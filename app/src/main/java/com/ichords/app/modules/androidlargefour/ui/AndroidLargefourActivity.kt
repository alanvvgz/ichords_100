package com.ichords.app.modules.androidlargefour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityAndroidLargefourBinding
import com.ichords.app.modules.androidlargefive.ui.AndroidLargefiveActivity
import com.ichords.app.modules.androidlargefour.`data`.viewmodel.AndroidLargefourVM
import com.ichords.app.modules.androidlargethree.ui.AndroidLargethreeActivity
import com.ichords.app.modules.frameone.ui.FrameOneActivity
import kotlin.String
import kotlin.Unit

class AndroidLargefourActivity :
    BaseActivity<ActivityAndroidLargefourBinding>(R.layout.activity_android_largefour) {
  private val viewModel: AndroidLargefourVM by viewModels<AndroidLargefourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargefourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnIrParaAtividadeOne.setOnClickListener {
      val destIntent = AndroidLargefiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageSeven.setOnClickListener {
      val destIntent = AndroidLargethreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleFiftySeven.setOnClickListener {
      val destIntent = FrameOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleSix.setOnClickListener {
      val destIntent = FrameOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGEFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargefourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
