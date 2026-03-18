# Break Zone - Mobile Canteen Ordering Android App

**Break Zone** — A native mobile application built for Taguig City University (TCU) students and staff to browse canteen menus, place orders, and manage payments efficiently using a local database system.

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com/)
[![Java](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![SQLite](https://img.shields.io/badge/Database-SQLite-blue.svg)](https://www.sqlite.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Build](https://img.shields.io/badge/Build-Success-brightgreen)

## Project Description

The CS Mobile Canteen Ordering App is a comprehensive solution for managing canteen operations digitally. It allows students to:
- **Register and Login**: Securely create accounts and sign in using a locally stored database.
- **Browse Stalls**: Explore multiple canteen stalls (Stall 1, 2, and 3) with dedicated menus.
- **Place Orders**: Select food items and place orders with real-time feedback.
- **Payment Integration**: A simulated G-Cash payment module where users can copy the merchant number for easier transactions.
- **Seller Management**: Dedicated sign-up flow for canteen sellers to manage their presence on the platform.

### Technologies used
- **Java**: Used as the core language for its robustness, wide support for Android development, and rich ecosystem of libraries.
- **SQLite**: Chosen for local data persistence, allowing the app to store user credentials and basic order history without requiring a constant backend connection for critical operations.
- **Android Studio**: Provided the integrated environment for UI design (XML), debugging, and deployment.
- **Firebase**: Integrated for potentially scalable data management and analytics.

### Challenges faced
- **Activity Lifecycle Management**: Coordinating transitions between multiple activities (Splash Screen, Stalls, Checkout) while maintaining a smooth user experience.
- **Local Persistence**: Designing a reliable `DBHelper` class to handle user registration and login validation securely.
- **UI Design**: Creating a responsive layout using XML that looks consistent across various Android device screen sizes.

### Features to implement in the future
- **Real-time Order Tracking**: Implement a live dashboard for users to see the status of their orders.
- **Push Notifications**: Notify users when their food is ready for pickup or if there are new daily specials.
- **In-App Payment Gateway**: Integrate actual payment APIs like G-Cash or Maya for seamless transactions.
- **Seller Dashboard**: A comprehensive interface for sellers to update prices, add new dishes, and manage inventory.

---

## Table of Contents
- [1. Project's Title](#1-projects-title)
- [8. Badges](#8-badges)
- [2. Project Description](#2-project-description)
- [4. How to Install and Run the Project](#4-how-to-install-and-run-the-project)
- [5. How to Use the Project](#5-how-to-use-the-project)
- [6. Include Credits](#6-include-credits)
- [7. Add a License](#7-add-a-license)

---

## How to Install and Run the Project

### Prerequisites
- **Android Studio** (Electric Eel or later recommended)
- **Android SDK** (API Level 32)
- **Java Development Kit (JDK)** 11 or higher

### Installation Steps
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/cs-mobile-canteen-ordering-android-app-java-sqlite.git
   ```
2. **Open the project in Android Studio**:
   - Launch Android Studio.
   - Select `File > Open` and navigate to the cloned directory.
3. **Sync Gradle**:
   - Wait for the project to finish syncing. Ensure you have an active internet connection for downloading dependencies.
4. **Set Up Emulator/Physical Device**:
   - Create a Virtual Device (AVD) using the Device Manager (API 21+ supported, API 32 recommended).
   - Alternatively, connect a physical Android device via USB and enable USB Debugging.
5. **Run the Application**:
   - Click the green **Run** icon in the toolbar or press `Shift + F10`.

---

## How to Use the Project

### Instructions and Examples
1. **Splash Screen**: Upon launching, you will see the professional "Break Zone" splash screen.
2. **Authentication**:
   - If you are a new user, navigate to the **Sign Up** page. Provide your email, password, and confirm your password.
   - Once registered, use your credentials on the **Login** page to access the main dashboard.
3. **Browsing Stalls**:
   - Select your preferred canteen stall from the main menu.
   - Browse the available food items and click "Place Order" to add them to your basket.
4. **Checkout**:
   - On the checkout screen, you will see a G-Cash merchant number.
   - Click the **Copy** icon to copy the number to your clipboard for payment.
   - Confirm your order or choose to reserve it for later.

### Authentication Credentials
- **Note**: This app uses a local SQLite database. You will need to **register a new account** locally on your device to log in. No pre-configured credentials are required.

---

## Credits

### Author
- **Ijerson Lastimosa Ilalto** - *Developer* - [GitHub Profile](https://github.com/Ijerson)

### Acknowledgments / Tutorials
- Inspired by the need for digital transformation in university canteen services.

---

## License
This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.