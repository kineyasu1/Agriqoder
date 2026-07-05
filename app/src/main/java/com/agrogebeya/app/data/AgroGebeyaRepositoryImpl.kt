package com.agrogebeya.app.data

import kotlinx.coroutines.delay

/**
 * Basic implementation of the AgroGebeyaRepository
 */
class AgroGebeyaRepositoryImpl : AgroGebeyaRepository {
    
    // In-memory cache for demonstration purposes
    private val cachedProducts = mutableListOf<Product>()
    private val users = mutableMapOf<String, User>()
    
    override suspend fun login(phoneNumber: String, password: String): Result<User> {
        delay(1000) // Simulate network delay
        // In a real app, this would authenticate with a backend
        return Result.success(User(id = "1", phoneNumber = phoneNumber, name = "Test User"))
    }
    
    override suspend fun register(phoneNumber: String, password: String): Result<User> {
        delay(1500) // Simulate network delay
        // In a real app, this would register with a backend
        val newUser = User(id = "2", phoneNumber = phoneNumber, name = "New User")
        users[newUser.id] = newUser
        return Result.success(newUser)
    }
    
    override suspend fun verifyOTP(otp: String): Result<Boolean> {
        delay(1000) // Simulate network delay
        // In a real app, this would verify with a backend service
        return Result.success(otp.length in 4..6) // Simple validation
    }
    
    override suspend fun getProducts(): Result<List<Product>> {
        delay(1000) // Simulate network delay
        // Return some sample products
        val products = listOf(
            Product(
                id = "1",
                name = "Teff Grain",
                category = ProductCategory.CEREALS,
                price = 80.0,
                unit = PriceUnit.PER_KG,
                quantity = 100,
                location = "Addis Ababa",
                sellerId = "1",
                description = "High quality teff grain from central Ethiopia"
            ),
            Product(
                id = "2",
                name = "Haricot Beans",
                category = ProductCategory.PULSES,
                price = 60.0,
                unit = PriceUnit.PER_KG,
                quantity = 200,
                location = "Hawassa",
                sellerId = "1",
                description = "Premium haricot beans, well sorted"
            ),
            Product(
                id = "3",
                name = "Yirgacheffe Coffee",
                category = ProductCategory.COFFEE,
                price = 350.0,
                unit = PriceUnit.PER_KG,
                quantity = 50,
                location = "Yirgacheffe",
                sellerId = "1",
                description = "Organic washed coffee beans"
            )
        )
        return Result.success(products)
    }
    
    override suspend fun getProductById(productId: String): Result<Product> {
        delay(500) // Simulate network delay
        // In a real app, this would fetch from backend
        val products = getProducts().getOrNull() ?: emptyList()
        val product = products.find { it.id == productId }
        
        return if (product != null) {
            Result.success(product)
        } else {
            Result.failure(Exception("Product not found"))
        }
    }
    
    override suspend fun getProductsByCategory(category: String): Result<List<Product>> {
        delay(800) // Simulate network delay
        val allProducts = getProducts().getOrNull() ?: emptyList()
        val filteredProducts = allProducts.filter { 
            it.category.name.lowercase() == category.lowercase() 
        }
        return Result.success(filteredProducts)
    }
    
    override suspend fun getProductsByLocation(location: String): Result<List<Product>> {
        delay(800) // Simulate network delay
        val allProducts = getProducts().getOrNull() ?: emptyList()
        val filteredProducts = allProducts.filter { 
            it.location.lowercase().contains(location.lowercase()) 
        }
        return Result.success(filteredProducts)
    }
    
    override suspend fun getUserProfile(userId: String): Result<User> {
        delay(500) // Simulate network delay
        val user = users[userId]
        
        return if (user != null) {
            Result.success(user)
        } else {
            Result.failure(Exception("User not found"))
        }
    }
    
    override suspend fun updateUserProfile(user: User): Result<Boolean> {
        delay(1000) // Simulate network delay
        users[user.id] = user
        return Result.success(true)
    }
    
    override suspend fun initiateTelebirrPayment(amount: Double, phoneNumber: String): Result<PaymentResult> {
        delay(2000) // Simulate payment processing delay
        // In a real app, this would integrate with Telebirr API
        return Result.success(
            PaymentResult(
                transactionId = "TB${System.currentTimeMillis()}",
                status = PaymentStatus.SUCCESS,
                message = "Telebirr payment successful"
            )
        )
    }
    
    override suspend fun initiateMPesaPayment(amount: Double, phoneNumber: String): Result<PaymentResult> {
        delay(2000) // Simulate payment processing delay
        // In a real app, this would integrate with M-Pesa API
        return Result.success(
            PaymentResult(
                transactionId = "MP${System.currentTimeMillis()}",
                status = PaymentStatus.SUCCESS,
                message = "M-Pesa payment successful"
            )
        )
    }
    
    override suspend fun cacheProducts(products: List<Product>) {
        cachedProducts.clear()
        cachedProducts.addAll(products)
    }
    
    override suspend fun getCachedProducts(): List<Product> {
        return cachedProducts.toList()
    }
}