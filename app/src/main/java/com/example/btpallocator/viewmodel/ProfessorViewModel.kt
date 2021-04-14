package com.example.btpallocator.viewmodel

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.btpallocator.database.AppDatabase
import com.example.btpallocator.database.models.ProfessorRegistrationData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ProfessorViewModel(application: Application) : BaseViewModel(application) {
    private val professorDatabase = AppDatabase.getInstance(application).professorDao()

    val professorLoginSuccess = MutableLiveData<Boolean>()

    @SuppressLint("CheckResult")
    fun login(userName: String, password: String) {
        professorDatabase.getUserById(userName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map {
                it?.let {
                    it.password == password
                } ?: false
            }
            .subscribe({
                professorLoginSuccess.postValue(it)
            }, {
                professorLoginSuccess.postValue(false)
            })
    }

    fun register(professorData: ProfessorRegistrationData) {
        professorDatabase.saveNewUser(professorData)
    }
}