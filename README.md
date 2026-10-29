Zesty Bite - Restaurant Menu API

A REST API built with Spring Boot and MongoDB to manage a restaurant menu. Supports adding, viewing, updating and deleting menu items.

 Tech Stack
Java
Spring Boot
Spring Data MongoDB
Maven
MongoDB Atlas

Project Structure
controller - REST endpoints
service - business logic
repository - database access
entity - MenuItem model

API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/menu | Get all menu items |
| POST | /api/menu | Add menu items (JSON list) |
| PUT | /api/menu/{id} | Update a menu item |
| DELETE | /api/menu/{id} | Delete a menu item |

json
[
  {
    "name": "Butter Paneer",
    "category": "starter",
    "description": "Cooked cubes marinated in spicy yogurt",
    "veg": true,
    "price": 250
  }
]


 How to Run

1 Clone the repo
2 Create src/main/resources/application.yml with your MongoDB connection:
   yaml
   spring:
     data:
       mongodb:
         uri: mongodb+srv://<username>:<password>@<cluster>.mongodb.net/zesty-bite-ab
   
3 Run ZestyBiteApplication
4 Test APIs at http://localhost:8080/api/menu using Postman

Author
ritik kumar
    "price": 250
  }
]
