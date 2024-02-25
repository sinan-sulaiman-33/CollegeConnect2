package com.collegeconnect.app.modules.iphone1415promaxone.`data`.model

import com.collegeconnect.app.R
import com.collegeconnect.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone1415ProMaxOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_alan_k_anil_sre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kochouseph_john)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHOME: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMISSIONS: String? = MyApp.getInstance().resources.getString(R.string.lbl_missions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCOALESCE: String? = MyApp.getInstance().resources.getString(R.string.lbl_coalesce)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCONFLUENCE: String? = MyApp.getInstance().resources.getString(R.string.lbl_confluence)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCONVEY: String? = MyApp.getInstance().resources.getString(R.string.lbl_convey)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCollegeConnect: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_college_connect)

)
