package com.sd.demo.kmp.compose_utils

import android.util.Log

actual fun logMsg(tag: String, block: () -> String) {
  Log.d(tag, block())
}