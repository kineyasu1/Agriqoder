package com.agrogebeya.app.ui.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.agrogebeya.app.R
import com.agrogebeya.app.viewmodel.DashboardViewModel

@Composable
fun DashboardScreen(viewModel: DashboardViewModel = viewModel()) {
    val uiState by viewModel.uiState.collectAsState()
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFFF8F9FA)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // App header
        HeaderSection(uiState.welcomeMessage)
        
        // Main content
        if (uiState.isLoading) {
            LoadingIndicator()
        } else {
            MainContentSection(
                onBuyProductsClicked = viewModel::onBuyProductsClicked,
                onSellProductsClicked = viewModel::onSellProductsClicked
            )
        }
        
        // Bottom navigation placeholder
        BottomNavigationPlaceholder()
    }
}

@Composable
fun HeaderSection(welcomeMessage: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = welcomeMessage,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(0xFF2E7D32) // Green color suitable for agriculture
        )
    }
}

@Composable
fun LoadingIndicator() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(color = Color(0xFF2E7D32))
    }
}

@Composable
fun MainContentSection(
    onBuyProductsClicked: () -> Unit,
    onSellProductsClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.dashboard),
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            color = Color(0xFF1B5E20), // Dark green
            modifier = Modifier.padding(bottom = 40.dp)
        )
        
        // Dual path buttons: Buy vs Sell
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Buy Button
            DashboardButton(
                icon = Icons.Default.ShoppingCart,
                text = stringResource(R.string.buy_products),
                onClick = onBuyProductsClicked,
                backgroundColor = Color(0xFF4CAF50), // Green
                contentColor = Color.White
            )
            
            // Sell Button
            DashboardButton(
                icon = Icons.Default.Storefront,
                text = stringResource(R.string.sell_products),
                onClick = onSellProductsClicked,
                backgroundColor = Color(0xFF2196F3), // Blue
                contentColor = Color.White
            )
        }
    }
}

@Composable
fun DashboardButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    text: String,
    onClick: () -> Unit,
    backgroundColor: Color,
    contentColor: Color
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = contentColor,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = text,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = contentColor
            )
        }
    }
}

@Composable
fun BottomNavigationPlaceholder() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFE8F5E9)),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(R.string.home),
            fontWeight = FontWeight.Medium,
            color = Color(0xFF2E7D32)
        )
        Text(
            text = stringResource(R.string.search),
            fontWeight = FontWeight.Medium,
            color = Color(0xFF2E7D32)
        )
        Text(
            text = stringResource(R.string.profile),
            fontWeight = FontWeight.Medium,
            color = Color(0xFF2E7D32)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    com.agrogebeya.app.ui.theme.AgroGebeyaTheme {
        DashboardScreen()
    }
}