package ru.gof.utils

import android.util.Log

const val GOF_RESULT_TAG: String = "GOF_RESULT"

fun showMessage(message: String) {
    Log.d(GOF_RESULT_TAG, message)
}