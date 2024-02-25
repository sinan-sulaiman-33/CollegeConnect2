package com.collegeconnect.app.modules.iphone1415promaxtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.collegeconnect.app.R
import com.collegeconnect.app.appcomponents.base.BaseActivity
import com.collegeconnect.app.databinding.ActivityIphone1415ProMaxTwoBinding
import com.collegeconnect.app.modules.iphone1415promaxtwo.`data`.viewmodel.Iphone1415ProMaxTwoVM
import kotlin.String
import kotlin.Unit

class Iphone1415ProMaxTwoActivity :
    BaseActivity<ActivityIphone1415ProMaxTwoBinding>(R.layout.activity_iphone_14_15_pro_max_two) {
  private val viewModel: Iphone1415ProMaxTwoVM by viewModels<Iphone1415ProMaxTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone1415ProMaxTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE1415PRO_MAX_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone1415ProMaxTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
