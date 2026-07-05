package com.agrogebeya.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DashboardViewModel : ViewModel() {
    
    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState: StateFlow<DashboardUiState> = _uiState
    
    init {
        loadDashboardData()
    }
    
    private fun loadDashboardData() {
        viewModelScope.launch {
            // Simulate loading dashboard data
            _uiState.value = _uiState.value.copy(isLoading = true)
            
            // In a real app, this would fetch from repository
            // For now, just simulate loading completion
            _uiState.value = _uiState.value.copy(
                isLoading = false,
                welcomeMessage = "Welcome to Agro Gebeya!"
            )
        }
    }
    
    fun onBuyProductsClicked() {
        // Navigate to buy products screen
    }
    
    fun onSellProductsClicked() {
        // Navigate to sell products screen
    }
}

data class DashboardUiState(
    val isLoading: Boolean = false,
    val welcomeMessage: String = "",
    val featuredProducts: List<String> = emptyList()
)