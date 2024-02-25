package com.collegeconnect.app.modules.iphone1415promaxtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.collegeconnect.app.modules.iphone1415promaxtwo.`data`.model.Iphone1415ProMaxTwoModel
import org.koin.core.KoinComponent

class Iphone1415ProMaxTwoVM : ViewModel(), KoinComponent {
  val iphone1415ProMaxTwoModel: MutableLiveData<Iphone1415ProMaxTwoModel> =
      MutableLiveData(Iphone1415ProMaxTwoModel())

  var navArguments: Bundle? = null
}
