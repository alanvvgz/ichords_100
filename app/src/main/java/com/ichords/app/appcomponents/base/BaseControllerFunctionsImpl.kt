package com.ichords.app.appcomponents.base


interface BaseControllerFunctionsImpl {


    open fun onInitialized() {}


    open fun addObservers() {}


    abstract fun setUpClicks()

}