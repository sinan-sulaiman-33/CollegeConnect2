package com.collegeconnect.app.modules.iphone1415promaxthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.collegeconnect.app.modules.iphone1415promaxthree.`data`.model.Iphone1415ProMaxThreeModel
import com.collegeconnect.app.modules.iphone1415promaxthree.`data`.model.ListvectorSevenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone1415ProMaxThreeVM : ViewModel(), KoinComponent {
  val iphone1415ProMaxThreeModel: MutableLiveData<Iphone1415ProMaxThreeModel> =
      MutableLiveData(Iphone1415ProMaxThreeModel())

  var navArguments: Bundle? = null

  val listvectorSevenList: MutableLiveData<MutableList<ListvectorSevenRowModel>> =
      MutableLiveData(mutableListOf())
}
