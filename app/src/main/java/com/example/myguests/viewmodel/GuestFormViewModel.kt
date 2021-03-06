package com.example.myguests.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myguests.service.model.GuestModel
import com.example.myguests.service.repository.GuestRepository

class GuestFormViewModel : ViewModel(){
    private val mGuestRepository: GuestRepository = GuestRepository()
    
    private  var mSaveGuest = MutableLiveData<Boolean>()
    val saveGuest: LiveData<Boolean> =  mSaveGuest

    fun save(name:String, presence:Boolean){
        val guestModel = GuestModel(name,presence)
        mGuestRepository.save(guestModel)
    }
}