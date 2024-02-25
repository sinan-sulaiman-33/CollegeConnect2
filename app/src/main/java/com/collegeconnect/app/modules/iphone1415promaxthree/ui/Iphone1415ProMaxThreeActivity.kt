package com.collegeconnect.app.modules.iphone1415promaxthree.ui

import android.view.View
import androidx.activity.viewModels
import com.collegeconnect.app.R
import com.collegeconnect.app.appcomponents.base.BaseActivity
import com.collegeconnect.app.databinding.ActivityIphone1415ProMaxThreeBinding
import com.collegeconnect.app.modules.iphone1415promaxthree.`data`.model.ListvectorSevenRowModel
import com.collegeconnect.app.modules.iphone1415promaxthree.`data`.viewmodel.Iphone1415ProMaxThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone1415ProMaxThreeActivity :
    BaseActivity<ActivityIphone1415ProMaxThreeBinding>(R.layout.activity_iphone_14_15_pro_max_three)
    {
  private val viewModel: Iphone1415ProMaxThreeVM by viewModels<Iphone1415ProMaxThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listvectorSevenAdapter =
    ListvectorSevenAdapter(viewModel.listvectorSevenList.value?:mutableListOf())
    binding.recyclerListvectorSeven.adapter = listvectorSevenAdapter
    listvectorSevenAdapter.setOnItemClickListener(
    object : ListvectorSevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListvectorSevenRowModel) {
        onClickRecyclerListvectorSeven(view, position, item)
      }
    }
    )
    viewModel.listvectorSevenList.observe(this) {
      listvectorSevenAdapter.updateData(it)
    }
    binding.iphone1415ProMaxThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListvectorSeven(
    view: View,
    position: Int,
    item: ListvectorSevenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE1415PRO_MAX_THREE_ACTIVITY"

  }
}
