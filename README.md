# Agroገበያ (AgroGebeya) - Ethiopian Agricultural Marketplace

## Overview
Agroገበያ is a production-ready Android application designed as an agricultural marketplace for Ethiopia. The app connects farmers, buyers, and suppliers in the Ethiopian agricultural sector with a focus on offline-first functionality and multilingual support.

## 🏗️ Architecture
The application follows the MVVM (Model-View-ViewModel) architectural pattern with clean code principles:

```
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/agrogebeya/app/
│   │   │   │   ├── data/          # Models, Room DB, Repositories, APIs
│   │   │   │   ├── ui/            # Jetpack Compose Screens (Auth, Home, Buy, Sell)
│   │   │   │   └── viewmodel/     # State management for Auth and Marketplace logic
│   │   │   └── res/
│   │   │       ├── values/strings.xml (English)
│   │   │       ├── values-am/strings.xml (Amharic)
│   │   │       ├── values-om/strings.xml (Afaan Oromoo)
│   │   │       ├── values-so/strings.xml (Somali)
│   │   │       └── values-ti/strings.xml (Tigrigna)
```

## ✨ Key Features

### 1. Multilingual Support (5 Languages)
- English
- Amharic (አማርኛ)
- Afaan Oromoo
- Somali (Soomaali)
- Tigrigna (ትግርኛ)

### 2. Authentication System
- Phone number-based registration/login (supporting Ethio Telecom and Safaricom Ethiopia prefixes)
- 6-digit numeric password security
- 4-6 digit SMS OTP verification

### 3. Dual Core Workflow
- **Buy Path**: Browse agricultural items (Cereals, Pulses, Coffee, Vegetables, Livestock)
- **Sell Path**: Post ads with product details, location, and photos

### 4. Offline-First Design
- Local caching of listings using Room Database
- Seamless UI experience even in low connectivity areas

### 5. Local Payment Integration
- Telebirr payment gateway
- M-Pesa Safaricom Ethiopia integration

## 📱 User Experience Highlights

### Field-Optimized UI
- Large touch targets (minimum 56x56dp) for outdoor use
- High visual/iconic guidance with structural cues
- High contrast, thumb-friendly interface

### Dashboard Features
- Clean dual split path: "Buy Products / ምርት ግዛ" vs "Sell Products / ምርት ሽጥ"
- Responsive layout optimized for various screen sizes
- Intuitive navigation with clear visual hierarchy

## 🛠️ Tech Stack
- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern UI toolkit
- **MVVM Architecture** - Clean separation of concerns
- **Room Database** - Local data persistence
- **Coroutines** - Asynchronous programming
- **Material Design 3** - Modern UI components

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog or later
- Android SDK API level 24+
- Kotlin 1.9+

### Setup Instructions
1. Clone the repository
2. Open in Android Studio
3. Sync Gradle files
4. Build and run the application

## 🌍 Localization Strategy
The app fully supports 5 languages with complete string resource files. The localization system automatically adapts to the device's language setting, with fallback to English when specific translations aren't available.

## 💳 Payment Gateways
The application includes infrastructure for integrating local payment solutions:
- Telebirr SuperApp/WebPay integration hooks
- M-Pesa Safaricom Ethiopia integration

## 📊 Data Management
- Offline-first approach with local Room database
- Automatic sync when connectivity is restored
- Efficient data caching strategy to minimize bandwidth usage

## 🧪 Testing Strategy
The codebase is structured to support comprehensive testing:
- Unit tests for business logic
- UI tests for critical user flows
- Integration tests for data layer operations

## 🏁 Conclusion
Agroገበያ represents a modern, production-ready solution for Ethiopia's agricultural marketplace needs. With its focus on usability in rural environments, multilingual support, and offline-first capabilities, it addresses key challenges faced by farmers and buyers in the Ethiopian agricultural sector.