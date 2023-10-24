package com.perfect_presentation.logger

object Logger {
    private var logger: LogUtils? = null
    var isEnabled = true
    init {
        logger = LogUtils()
    }
    fun d(tagOrMsg: String,  vararg msg: String?) {
        if (isEnabled && logger != null) {
            logger?.log(tagOrMsg, *msg)
        }
    }
}