package com.geokrishifarm.crop_health_query.vmfactory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.geokrishifarm.crop_health_query.repo.CropHealthRepo
import com.geokrishifarm.crop_health_query.viewmodel.CropHealthVM

class CropHealthVMFactory(private var context: Context,
                          private var repo: CropHealthRepo
) : ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CropHealthVM::class.java)) {
            return CropHealthVM(repo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}