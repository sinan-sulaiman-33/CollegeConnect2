package com.collegeconnect.app.modules.iphone1415promaxthree.`data`.model

import com.collegeconnect.app.R
import com.collegeconnect.app.appcomponents.di.MyApp
import kotlin.String

data class ListvectorSevenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtElectricaland: String? =
      MyApp.getInstance().resources.getString(R.string.msg_electrical_and)

)
