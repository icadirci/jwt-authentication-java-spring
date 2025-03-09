# 📌 JWT Authentication API - Spring Boot

This project is a **JWT (JSON Web Token) based authentication system** built using **Spring Boot**.

## 🚀 Features
- ✅ User registration and login  
- ✅ JWT-based authentication  
- ✅ Role-based authorization  
- ✅ Refresh token support  
- ✅ Spring Security integration  

## 🛠 Technologies Used
- **Spring Boot 3+**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Spring Data JPA** (Hibernate)
- **H2 / PostgreSQL / MySQL** (Configurable database)
- **Maven**

## 🔧 Installation & Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/jwt-auth-springboot.git
cd jwt-auth-springboot
```
### 2️⃣ Install Dependencies
```bash
mvn clean install
```
### 3️⃣ Configure the Database
Update database connection settings in application.properties or application.yml:
```bash
jwt.secret= // secret key for JWT
jwt.expiration=3600000 
spring.datasource.url=jdbc:mysql://localhost:3306/jwt_db
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
```

### 4️⃣ Run the Application
```bash
mvn spring-boot:run
```

## 🔑 API Usage

#### 📌 User Registration
POST /api/auth/signup
```
{
  "username": "testuser",
  "password": "password123"
}
```
#### 📌 User Login
POST /api/auth/signin
```
{
  "username": "testuser",
  "password": "password123"
}
```


## 📜 License
This project is licensed under the MIT License.

