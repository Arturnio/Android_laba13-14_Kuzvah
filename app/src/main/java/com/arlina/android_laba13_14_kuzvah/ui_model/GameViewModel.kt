package com.arlina.android_laba13_14_kuzvah.ui_model

import androidx.lifecycle.ViewModel
import com.arlina.android_laba13_14_kuzvah.data.GameUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(GameUiState())
    val uiState: StateFlow<GameUiState> = _uiState.asStateFlow()

    init{
        reserGame()
    }

    fun reserGame() {
        TODO("Not yet implemented")
    }

}