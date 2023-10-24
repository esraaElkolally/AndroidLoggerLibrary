package com.perfect_presentation.logger

import android.util.Log


class LogUtils {

    fun log(tagOrMsg: String, vararg msg: String?) {
        val messageBuilder = StringBuilder("")
        for (i in msg.indices) {
            messageBuilder.append(msg[i])
            if (msg.size - 1 > i) messageBuilder.append(" - ")
        }
        Log.d(tagOrMsg, messageBuilder.toString())
    }
}
