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
📌 Sample JSON Data Used

🔹 Events JSON

[
{"id": "evt_001", "name": "Music Festival", "date": "2025-07-15", "description": "A great music festival with top artists.", "price": 50.0},
{"id": "evt_002", "name": "Art Exhibition", "date": "2025-09-01", "description": "Modern art exhibition showcasing local artists.", "price": 20.0},
{"id": "evt_003", "name": "Food Fair", "date": "2025-10-10", "description": "Taste dishes from around the world.", "price": 15.0},
{"id": "evt_004", "name": "Tech Conference", "date": "2025-11-20", "description": "Innovative tech talks and networking.", "price": 100.0}
]

🔹 Hotels JSON

[
{"id": "htl_001", "name": "Malaga Beach Hotel", "address": "Paseo Marítimo, 1", "stars": 5},
{"id": "htl_002", "name": "City Center Inn", "address": "Calle Larios, 15", "stars": 3},
{"id": "htl_003", "name": "Sunset Resort", "address": "Avenida del Sol, 8", "stars": 4},
{"id": "htl_004", "name": "Budget Stay", "address": "Calle Pequeña, 22", "stars": 2}
]

🔹 Monuments JSON

[
{"id": "mnt_001", "name": "Alcazaba", "creationDate": "1065", "location": "Malaga Center", "description": "Historical fortress from the Islamic era."},
{"id": "mnt_002", "name": "Gibralfaro Castle", "creationDate": "929", "location": "Hilltop", "description": "Ancient Moorish castle with a great view."},
{"id": "mnt_003", "name": "Roman Theatre", "creationDate": "1st century BC", "location": "Old Town", "description": "Ancient Roman theatre still in use today."}
]

🔹 Restaurants JSON

[
{"id": "rst_001", "name": "El Pimpi", "location": "Calle Granada, 62", "cuisineType": "Spanish", "averagePrice": 30.0},
{"id": "rst_002", "name": "Casa Lola", "location": "Calle Strachan, 11", "cuisineType": "Tapas", "averagePrice": 25.0},
{"id": "rst_003", "name": "La Reserva", "location": "Avenida de Andalucia, 5", "cuisineType": "Steakhouse", "averagePrice": 40.0}
]
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

