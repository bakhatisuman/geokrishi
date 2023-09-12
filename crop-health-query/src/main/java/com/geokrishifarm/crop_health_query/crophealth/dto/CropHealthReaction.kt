package com.geokrishifarm.crop_health_query.crophealth.dto


import com.google.gson.annotations.SerializedName

data class CropHealthReaction(
    @SerializedName("reaction")
    val reaction: Int,
    @SerializedName("plantquery_answer")
    val plantqueryAnswerID: Int

)