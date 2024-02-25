package com.collegeconnect.app.modules.iphone1415promaxfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.collegeconnect.app.modules.iphone1415promaxfour.`data`.model.Iphone1415ProMaxFourModel
import org.koin.core.KoinComponent

class Iphone1415ProMaxFourVM : ViewModel(), KoinComponent {
  val iphone1415ProMaxFourModel: MutableLiveData<Iphone1415ProMaxFourModel> =
      MutableLiveData(Iphone1415ProMaxFourModel())

  var navArguments: Bundle? = null
}
