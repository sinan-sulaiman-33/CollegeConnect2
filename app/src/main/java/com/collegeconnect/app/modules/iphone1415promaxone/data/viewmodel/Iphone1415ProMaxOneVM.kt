package com.collegeconnect.app.modules.iphone1415promaxone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.collegeconnect.app.modules.iphone1415promaxone.`data`.model.Iphone1415ProMaxOneModel
import org.koin.core.KoinComponent

class Iphone1415ProMaxOneVM : ViewModel(), KoinComponent {
  val iphone1415ProMaxOneModel: MutableLiveData<Iphone1415ProMaxOneModel> =
      MutableLiveData(Iphone1415ProMaxOneModel())

  var navArguments: Bundle? = null
}
