package com.sd.demo.kmp.compose_utils

import platform.Foundation.NSLog

actual fun logMsg(tag: String, block: () -> String) {
  NSLog("$tag ${block()}")
}