package com.example.ukl

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mEmail = MutableLiveData<String>()
    private val mSandi = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName
    val email: LiveData<String>
        get() = mEmail
    val sandi: LiveData<String>
        get() = mSandi
    fun setName(name: String) {
        mName.value = name
    } fun setEmail(email: String) {
        mEmail.value = email
    } fun setSandi(sandi: String) {
        mSandi.value = sandi
    }
}