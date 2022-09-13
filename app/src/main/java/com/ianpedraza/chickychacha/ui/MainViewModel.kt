package com.ianpedraza.chickychacha.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    fun onImagePressed(character: Int) {
        _text.value = when (character) {
            CHICKY -> CHICKY_NAME
            CHACHA -> CHACHA_NAME
            BOOMBOOM -> BOOMBOOM_NAME
            else -> null
        }
    }

    companion object {
        private const val BASE = "My name is"
        private const val CHICKY_NAME = "$BASE Chicky"
        private const val CHACHA_NAME = "$BASE ChaCha"
        private const val BOOMBOOM_NAME = "$BASE BoomBoom"

        const val CHICKY = 0
        const val CHACHA = 1
        const val BOOMBOOM = 2
    }

}
