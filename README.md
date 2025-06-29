 # BrowserStackUIMobileTesting

 🧪 Swag Labs Cloud & Mobile Automation Testing (BrowserStack + Selenium + TestNG)#

This repository demonstrates cross-browser and mobile web automation testing using **Java**, **Selenium WebDriver**, **TestNG**, and **BrowserStack**. It showcases end-to-end test automation of the [Swag Labs demo site](https://www.saucedemo.com/) including login, cart operations, checkout, and logout functionalities on cloud-based infrastructure.

---

## 🌐 Features

- ✅ End-to-End Web Automation
- ☁️ Cloud Testing with **BrowserStack**
- 📱 Mobile Web Testing (real devices on BrowserStack)
- 🔄 Cross-browser compatibility testing
- 🔧 TestNG Integration with Assertions
- ⏱ Implicit waits and setup hooks (`@BeforeTest`, `@AfterTest`, etc.)
- 🔒 Secure testing with environment variables

---

![image](https://github.com/user-attachments/assets/0f038d98-5137-44e0-b99f-c3b357f502eb)
![image](https://github.com/user-attachments/assets/99a4ed07-8fd8-4856-a98a-e1afced937f5)
![image](https://github.com/user-attachments/assets/5584c57b-daec-44d3-aa16-e2f95637d3fd)
![image](https://github.com/user-attachments/assets/f5a79d0c-3c0a-4c31-866b-39b7f8a31043)





## 🚀 Tech Stack

| Tool         | Description                                |
|--------------|--------------------------------------------|
| Java         | Core programming language                  |
| Selenium     | Browser automation framework               |
| TestNG       | Test runner and assertion library          |
| BrowserStack | Cloud platform for cross-browser testing   |
| Maven        | Project build and dependency management    |

---

## 🧪 Sample Test Flow

1. Launch Swag Labs app on a cloud/mobile browser
2. Log in using test credentials
3. Add two items to the cart
4. Proceed through checkout
5. Assert "THANK YOU FOR YOUR ORDER" confirmation
6. Log out and close session

---

## ⚙️ How to Run Locally (Web Only)

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/swaglabs-cloud-test.git
   cd swaglabs-cloud-test
   ```

2. Set up dependencies:
   - Make sure [Java](https://www.oracle.com/java/technologies/javase-downloads.html) and [Maven](https://maven.apache.org/) are installed.

3. Run tests locally:
   ```bash
   mvn clean test
   ```

---

## ☁️ How to Run on BrowserStack

1. Create a `.env` file or set environment variables:
   ```bash
   BROWSERSTACK_USERNAME=your_username
   BROWSERSTACK_ACCESS_KEY=your_access_key
   ```

2. Use the  `browserstack.yml` file for configuration:

3. Run the tests with:
   ```bash
   browserstack-local --key YOUR_ACCESS_KEY
   mvn test
   ```

> ✅ You can also integrate this with CI tools like Jenkins or GitHub Actions.

---

## 📱 Mobile Testing Snapshot

This test runs seamlessly on real iOS and Android devices, verifying responsive design and mobile behavior using BrowserStack’s cloud infrastructure.

---

---

## 📂 Project Structure

```
├── testScript/
│   └── SwagLabsTest.java       # Core test script
├── pom.xml                     # Maven dependencies
├── browserstack.yml           # BS test configuration
└── README.md                   # Project overview
```

---

## 👨‍💻 Author

**Mayur Ingle**  
QA Automation Engineer | Cloud Test Enthusiast  
