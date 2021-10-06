package com.quizapp

import android.provider.Settings
import android.provider.Settings.Global.getString

data class Question(
    val id: Int,
    val question: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val correctAnswer: Int
)