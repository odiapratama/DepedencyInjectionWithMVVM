package com.problemsolver.depedencyinjectionwithmvvm.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.problemsolver.depedencyinjectionwithmvvm.data.repository.QuoteRepository

@Suppress("UNCHECKED_CAST")
class QuotesViewModelFactory(
    private val quoteRepository: QuoteRepository
): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}