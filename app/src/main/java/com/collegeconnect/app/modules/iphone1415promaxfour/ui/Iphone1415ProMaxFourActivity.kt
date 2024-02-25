package com.collegeconnect.app.modules.iphone1415promaxfour.ui

import androidx.activity.viewModels
import com.collegeconnect.app.R
import com.collegeconnect.app.appcomponents.base.BaseActivity
import com.collegeconnect.app.databinding.ActivityIphone1415ProMaxFourBinding
import com.collegeconnect.app.modules.iphone1415promaxfour.`data`.viewmodel.Iphone1415ProMaxFourVM
import kotlin.String
import kotlin.Unit

class Iphone1415ProMaxFourActivity :
    BaseActivity<ActivityIphone1415ProMaxFourBinding>(R.layout.activity_iphone_14_15_pro_max_four) {
  private val viewModel: Iphone1415ProMaxFourVM by viewModels<Iphone1415ProMaxFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone1415ProMaxFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE1415PRO_MAX_FOUR_ACTIVITY"

  }
}
