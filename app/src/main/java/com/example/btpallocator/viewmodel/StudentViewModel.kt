package com.example.btpallocator.viewmodel

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.btpallocator.database.AppDatabase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class StudentViewModel(application: Application) : BaseViewModel(application) {
    private val studentDatabase = AppDatabase.getInstance(application).studentDao()

    val studentLoginSuccess = MutableLiveData<Boolean>()

    @SuppressLint("CheckResult")
    fun login(userName: String, password: String) {
        studentDatabase.getUserById(userName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map {
                it?.let {
                    it.password == password
                } ?: false
            }
            .subscribe({
                studentLoginSuccess.postValue(it)
            }, {
                studentLoginSuccess.postValue(false)
            })
    }
}