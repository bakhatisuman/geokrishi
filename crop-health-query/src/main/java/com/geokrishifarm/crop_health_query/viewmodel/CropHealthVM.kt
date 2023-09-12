package com.geokrishifarm.crop_health_query.viewmodel

import androidx.lifecycle.ViewModel
import com.geokrishifarm.crop_health_query.crophealth.dto.CropHealthRequest
import com.geokrishifarm.crop_health_query.crophealth.dto.TagItem
import com.geokrishifarm.crop_health_query.framework.FLWResponse
import com.geokrishifarm.crop_health_query.repo.CropHealthRepo
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.flow.Flow

class CropHealthVM(private val repo: CropHealthRepo) : ViewModel() {

    private var disposals = CompositeDisposable()
     var helloText = "Hello Suman"


    suspend fun sendCropHealthPostRequest(request: CropHealthRequest): Flow<FLWResponse<String>> {
       return repo.sendPostCropHealthQuery(request)
    }

    suspend fun sendTagListRequest(tag : String): Flow<FLWResponse<List<TagItem>>> {
       return repo.sendTagListRequest(tag)
    }


    /*suspend fun sendCropHealthPostRequest(request: CropHealthRequest){
        repo.sendPostCropHealthQuery(request).collect{
            if(it.status == FLWResponse.Status.SUCCESS){

            }else{
                responseToState(it)
            }
        }
    }*/


    private fun responseToState(flwResponse: FLWResponse<String>) {
        when(flwResponse.status){
            FLWResponse.Status.ERROR -> {}
            FLWResponse.Status.NO_INTERNET_AVAILABLE -> {}
            FLWResponse.Status.TOKEN_EXPIRED -> {}
            FLWResponse.Status.EXCEPTION -> {}

            else -> {}
        }

    }



    override fun onCleared() {
        super.onCleared()
        disposals.clear()
    }

}