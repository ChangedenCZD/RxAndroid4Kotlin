package com.chansos.rxandroid.kotlin.module.list

import com.chansos.libs.rxkotlin.classes.BaseContract

interface Contract : BaseContract {
    interface View : BaseContract.BaseView
    interface Presenter : BaseContract.BasePresenter
}