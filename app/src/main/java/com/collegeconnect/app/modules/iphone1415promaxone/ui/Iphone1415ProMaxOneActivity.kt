package com.collegeconnect.app.modules.iphone1415promaxone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.collegeconnect.app.R
import com.collegeconnect.app.appcomponents.base.BaseActivity
import com.collegeconnect.app.databinding.ActivityIphone1415ProMaxOneBinding
import com.collegeconnect.app.modules.iphone1415promaxone.`data`.viewmodel.Iphone1415ProMaxOneVM
import com.collegeconnect.app.modules.iphone1415promaxtwo.ui.Iphone1415ProMaxTwoActivity
import kotlin.String
import kotlin.Unit

class Iphone1415ProMaxOneActivity :
    BaseActivity<ActivityIphone1415ProMaxOneBinding>(R.layout.activity_iphone_14_15_pro_max_one) {
  private val viewModel: Iphone1415ProMaxOneVM by viewModels<Iphone1415ProMaxOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone1415ProMaxOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = Iphone1415ProMaxTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "IPHONE1415PRO_MAX_ONE_ACTIVITY"

    }
  }
