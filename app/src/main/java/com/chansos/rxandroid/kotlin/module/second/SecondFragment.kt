/*
 * Copyright (c) 2018. Create and edit by ChangedenChan.
 */

package com.chansos.rxandroid.kotlin.module.second

import com.chansos.libs.rxkotlin.anno.AutowirePresent
import com.chansos.libs.rxkotlin.anno.LayoutResId
import com.chansos.libs.rxkotlin.base.BaseViewPagerFragment
import com.chansos.libs.rxkotlin.log.LogUtils
import com.chansos.rxandroid.kotlin.R

@LayoutResId(R.layout.fragment_second)
@AutowirePresent("com.chansos.rxandroid.kotlin.module.second.Presenter")
class SecondFragment : BaseViewPagerFragment(), Contract.View {
    private lateinit var presenter: Presenter

    override fun onInitialize() {
        LogUtils.d("fragment_second onInitialize")
    }

    override fun onFirstTime() {
        LogUtils.d("fragment_second onFirstTime")
        this.presenter.fetch()
    }

    override fun onSecondTime() {
        LogUtils.d("fragment_second onSecondTime")
    }
}