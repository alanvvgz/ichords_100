package com.ichords.app.modules.frameone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityFrameOneBinding
import com.ichords.app.modules.androidlargethree.ui.AndroidLargethreeActivity
import com.ichords.app.modules.androidlargetwo.ui.AndroidLargetwoActivity
import com.ichords.app.modules.frameone.`data`.viewmodel.FrameOneVM
import kotlin.String
import kotlin.Unit

class FrameOneActivity : BaseActivity<ActivityFrameOneBinding>(R.layout.activity_frame_one) {
  private val viewModel: FrameOneVM by viewModels<FrameOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = AndroidLargethreeActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnEntrar.setOnClickListener {
        val destIntent = AndroidLargethreeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageImageFive.setOnClickListener {
        val destIntent = AndroidLargethreeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtCriar.setOnClickListener {
        val destIntent = AndroidLargetwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "FRAME_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FrameOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
