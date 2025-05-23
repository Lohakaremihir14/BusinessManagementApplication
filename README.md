```markdown
# Business Management Web Application

---

## 📌 Project Overview  
The **Business Management Web Application** is a web-based system designed to help small to medium businesses manage **customers**, **inventory**, and **orders** efficiently. It features role-based secure login for Admin and Staff and offers full CRUD functionality.

---

## 🚀 Features  
- **User Authentication & Role-based Access** (Admin & Staff)  
- **Customer Management** (Add, Update, Delete)  
- **Product Inventory Management**  
- **Order Processing and Tracking**  
- **Responsive UI using Thymeleaf**  
- **Secure backend with Spring Security**  

---

## 🏗️ Technologies Used  
- **Frontend:** Thymeleaf (HTML, CSS)  
- **Backend:** Java, Spring Boot, Spring Security, Spring Data JPA  
- **Database:** MySQL  
- **Build Tool:** Maven  
- **IDE:** Eclipse / IntelliJ IDEA  
- **Version Control:** Git & GitHub  

---

# 🛠 How to Run This Project  

## Prerequisites  
Before running the project, ensure you have the following installed:  
- **Java JDK 8 or higher**  
- **Maven**  
- **MySQL Server** (running locally or remotely)  
- **IDE (Eclipse / IntelliJ / VS Code)**  

---

## 📂 Setup Instructions  

### 1️⃣ Clone the Project  
```bash
git clone https://github.com/your-username/business-management.git
cd business-management
```

---

### 2️⃣ Setup MySQL Database  
- Login to your MySQL server and create the database:  
```sql
CREATE DATABASE proj;
```

- The application will auto-create tables on run (using `spring.jpa.hibernate.ddl-auto=update`).

---

### 3️⃣ Configure Database Connection  
Open `src/main/resources/application.properties` and update MySQL credentials:  
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/proj
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

server.port=9090
spring.application.name=BusinessManagementApp
```

---

### 4️⃣ Build the Project  
```bash
mvn clean install
```

---

### 5️⃣ Run the Application  
```bash
mvn spring-boot:run
```

---

### 6️⃣ Access the Application  
Open your browser and go to:  
```
http://localhost:9090
```

---

### 7️⃣ Default Admin Credentials  
Since Admin creation is manual in this project, use:  
- **Email:** admin@123  
- **Password:** 112233  

Use these to login as Admin and manage the application.

---

# 💡 Troubleshooting  
- **Database connection errors?**  
  Verify your MySQL username and password in `application.properties`.  
- **Port already in use?**  
  Change `server.port` in `application.properties` or free the port.  
- **Application not starting?**  
  Check Maven dependencies and Java version compatibility.  

---

## 🔗 Author  
📧 **Mihir Lohakare** – [mihirlohakare@gmail.com](mailto:mihirlohakare@gmail.com)  

---

## License  
This project is licensed under the [MIT License](LICENSE).  
```
