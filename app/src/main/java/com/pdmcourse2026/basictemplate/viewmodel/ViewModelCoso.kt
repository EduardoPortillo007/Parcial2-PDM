package com.pdmcourse2026.basictemplate.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.pdmcourse2026.basictemplate.data.modelo.Option

class ViewModelCoso : ViewModel(){

    private val _options = MutableStateFlow<List<Option>>(mutableListOf())

    val option: StateFlow<List<Option>> = _options
}