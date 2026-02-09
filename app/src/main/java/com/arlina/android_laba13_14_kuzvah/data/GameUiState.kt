package com.arlina.android_laba13_14_kuzvah.data

data class GameUiState(
    val currentScrambledWord: String = "",
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false
)