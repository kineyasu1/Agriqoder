package com.agrogebeya.app.data;

/**
 * Basic implementation of the AgroGebeyaRepository
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u0012H\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0010J0\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u00122\u0006\u0010\u0019\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001a\u0010\u0015J0\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u00122\u0006\u0010\u001c\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u0015J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001f\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b \u0010\u0015J2\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b&\u0010\'J2\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010\'J2\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010%\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b,\u0010-J2\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010%\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b/\u0010-J*\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00122\u0006\u00102\u001a\u00020\tH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u00104J*\u00105\u001a\b\u0012\u0004\u0012\u0002010\u00122\u0006\u00106\u001a\u00020\bH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b7\u0010\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00068"}, d2 = {"Lcom/agrogebeya/app/data/AgroGebeyaRepositoryImpl;", "Lcom/agrogebeya/app/data/AgroGebeyaRepository;", "()V", "cachedProducts", "", "Lcom/agrogebeya/app/data/Product;", "users", "", "", "Lcom/agrogebeya/app/data/User;", "cacheProducts", "", "products", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedProducts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductById", "Lkotlin/Result;", "productId", "getProductById-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "getProducts-IoAF18A", "getProductsByCategory", "category", "getProductsByCategory-gIAlu-s", "getProductsByLocation", "location", "getProductsByLocation-gIAlu-s", "getUserProfile", "userId", "getUserProfile-gIAlu-s", "initiateMPesaPayment", "Lcom/agrogebeya/app/data/PaymentResult;", "amount", "", "phoneNumber", "initiateMPesaPayment-0E7RQCE", "(DLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initiateTelebirrPayment", "initiateTelebirrPayment-0E7RQCE", "login", "password", "login-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "register-0E7RQCE", "updateUserProfile", "", "user", "updateUserProfile-gIAlu-s", "(Lcom/agrogebeya/app/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOTP", "otp", "verifyOTP-gIAlu-s", "app_debug"})
public final class AgroGebeyaRepositoryImpl implements com.agrogebeya.app.data.AgroGebeyaRepository {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.agrogebeya.app.data.Product> cachedProducts = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, com.agrogebeya.app.data.User> users = null;
    
    public AgroGebeyaRepositoryImpl() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object cacheProducts(@org.jetbrains.annotations.NotNull
    java.util.List<com.agrogebeya.app.data.Product> products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCachedProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.agrogebeya.app.data.Product>> $completion) {
        return null;
    }
}