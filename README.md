# Tourism Management System - Spring Boot & Thymeleaf - Reto 6

## 📌 Project Overview
This project is a **Tourism Management System** built using **Spring Boot**, **MongoDB**, and **Thymeleaf**. It allows users to manage and browse **events, hotels, monuments, and restaurants** in Málaga.

## **📂 Project Structure**

```
Reto6SpringMVC/
    Reto6SpringMVC/
        pom.xml
        src/
            main/
                java/
                    main/
                        Reto6MvcSpringApplication.java
                        controller/
                            event/
                                EventApiController.java
                                EventWebController.java
                            hotel/
                                HotelApiController.java
                                HotelWebController.java
                            monument/
                                MonumentApiController.java
                                MonumentWebController.java
                            restaurant/
                                RestaurantApiController.java
                                RestaurantWebController.java
                        model/
                            Event.java
                            Hotel.java
                            Monument.java
                            Restaurant.java
                        repository/
                            EventRepository.java
                            HotelRepository.java
                            MonumentRepository.java
                            RestaurantRepository.java
                        service/
                            EventService.java
                            HotelService.java
                            MonumentService.java
                            RestaurantService.java
                resources/
                    application.properties
                    static/
                        css/
                            styles.css
                    templates/
                        events/
                            detailed.html
                            list.html
                        hotels/
                            detailed.html
                            list.html
                        monuments/
                            detailed.html
                            list.html
                        restaurants/
                            detailed.html
                            list.html
```

---

## **📌 API Endpoints**

### **🔹 Events (`/api/events`)**
- **GET** `/api/events` → Get all events
- **GET** `/api/events/{id}` → Get event by ID
- **POST** `/api/events` → Create a new event
- **PUT** `/api/events/{id}` → Update an existing event
- **DELETE** `/api/events/{id}` → Delete an event

### **🔹 Hotels (`/api/hotels`)**
- **GET** `/api/hotels` → Get all hotels
- **GET** `/api/hotels/{id}` → Get hotel by ID
- **POST** `/api/hotels` → Create a new hotel
- **PUT** `/api/hotels/{id}` → Update an existing hotel
- **DELETE** `/api/hotels/{id}` → Delete a hotel

### **🔹 Monuments (`/api/monuments`)**
- **GET** `/api/monuments` → Get all monuments
- **GET** `/api/monuments/{id}` → Get monument by ID
- **POST** `/api/monuments` → Create a new monument
- **PUT** `/api/monuments/{id}` → Update an existing monument
- **DELETE** `/api/monuments/{id}` → Delete a monument

### **🔹 Restaurants (`/api/restaurants`)**
- **GET** `/api/restaurants` → Get all restaurants
- **GET** `/api/restaurants/{id}` → Get restaurant by ID
- **POST** `/api/restaurants` → Create a new restaurant
- **PUT** `/api/restaurants/{id}` → Update an existing restaurant
- **DELETE** `/api/restaurants/{id}` → Delete a restaurant

---

## **🚀 How to Run the Project**

### **1️⃣ Clone the Repository**
```sh
 git clone https://github.com/Antontaoh/Reto6.git
```

### **2️⃣ Configure MongoDB Connection**
Edit `src/main/resources/application.properties` and replace the credentials with your **MongoDB Atlas** connection:
```properties
spring.data.mongodb.uri=mongodb+srv://username:password@cluster.mongodb.net/TourismDB?retryWrites=true&w=majority
```

### **3️⃣ Run the Application**
```sh
mvn spring-boot:run
```

### **4️⃣ Open in Browser**
- **Web Interface:** `http://localhost:8080`
- **Swagger API Docs:** `http://localhost:8080/swagger-ui/index.html`

---

