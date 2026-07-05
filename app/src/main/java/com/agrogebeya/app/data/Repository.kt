package com.agrogebeya.app.data

/**
 * Interface for the main repository that handles data operations
 */
interface AgroGebeyaRepository {
    // Authentication methods
    suspend fun login(phoneNumber: String, password: String): Result<User>
    suspend fun register(phoneNumber: String, password: String): Result<User>
    suspend fun verifyOTP(otp: String): Result<Boolean>
    
    // Product related methods
    suspend fun getProducts(): Result<List<Product>>
    suspend fun getProductById(productId: String): Result<Product>
    suspend fun getProductsByCategory(category: String): Result<List<Product>>
    suspend fun getProductsByLocation(location: String): Result<List<Product>>
    
    // User related methods
    suspend fun getUserProfile(userId: String): Result<User>
    suspend fun updateUserProfile(user: User): Result<Boolean>
    
    // Payment related methods
    suspend fun initiateTelebirrPayment(amount: Double, phoneNumber: String): Result<PaymentResult>
    suspend fun initiateMPesaPayment(amount: Double, phoneNumber: String): Result<PaymentResult>
    
    // Offline caching
    suspend fun cacheProducts(products: List<Product>)
    suspend fun getCachedProducts(): List<Product>
}

/**
 * Data class representing a user
 */
data class User(
    val id: String = "",
    val phoneNumber: String = "",
    val name: String = "",
    val location: String = "",
    val userType: UserType = UserType.BUYER // BUYER or SELLER
)

enum class UserType {
    BUYER,
    SELLER
}

/**
 * Data class representing a product
 */
data class Product(
    val id: String = "",
    val name: String = "",
    val category: ProductCategory = ProductCategory.CEREALS,
    val price: Double = 0.0,
    val unit: PriceUnit = PriceUnit.PER_KG,
    val quantity: Int = 0,
    val location: String = "",
    val sellerId: String = "",
    val imageUrl: String = "",
    val description: String = ""
)

enum class ProductCategory {
    CEREALS,
    PULSES,
    COFFEE,
    VEGETABLES,
    LIVESTOCK
}

enum class PriceUnit {
    PER_KG,
    PER_QUINTAL
}

/**
 * Data class representing a payment result
 */
data class PaymentResult(
    val transactionId: String = "",
    val status: PaymentStatus = PaymentStatus.PENDING,
    val message: String = ""
)

enum class PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING
}