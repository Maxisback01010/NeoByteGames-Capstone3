<img width="1723" height="913" alt="image" src="https://github.com/user-attachments/assets/91d042a1-f648-413c-b0cd-9e6b722a98a6" />



# NeoByte Games – Capstone 3 Backend API

## Project Description

NeoByte Games is a backend e-commerce API developed using Java and Spring Boot. The goal of this project was to work as a backend developer on an existing application by debugging issues, implementing missing features, securing endpoints, and validating functionality through API testing.

This application supports category and product management through RESTful endpoints and demonstrates backend architecture concepts including controllers, services, repositories, authentication, authorization, and database persistence.

This project focused heavily on debugging and improving existing code rather than building from scratch, reflecting real-world software maintenance and development workflows.

---

## Features Completed

### Categories

* GET all categories
* GET category by ID
* GET products by category
* POST create category (Admin only)
* PUT update category (Admin only)
* DELETE category (Admin only)
* Added proper 404 handling for missing categories

### Product Fixes

* Fixed product search returning incomplete results
* Fixed product update persistence issue
* Fixed stock updates saving correctly

### Security

* Role-based authorization using ADMIN restrictions
* Authentication testing through API tools

---

## Technologies Used

* Java
* Spring Boot
* Spring Security
* Maven
* MySQL
* JPA / Hibernate
* Swagger
* Insomnia
* IntelliJ IDEA
* Git + GitHub

---

## Interesting Code Decisions

### Search Filtering Bug Fix

The original search logic unintentionally filtered products by featured status, causing products to disappear from search results.

Fix:

* Removed unnecessary featured filtering
* Allowed filtering only by category, price range, and subcategory

### Proper 404 Error Handling

Implemented `ResponseStatusException(HttpStatus.NOT_FOUND)` to ensure missing categories returned correct HTTP responses instead of unexpected success responses.

### Product Update Persistence

Expanded update functionality to ensure all fields—including stock—persist correctly to the database.

---

## Setup Instructions

### Clone Repository

```bash
git clone <your-github-link>
```

### Open Project

Open the project in IntelliJ IDEA.

### Configure Database

Import the provided SQL database into MySQL Workbench.

### Run Backend

Start Spring Boot from IntelliJ.

### Test API

Use:

* Swagger
* Insomnia

Login credentials:

* admin / password

---

## Screenshots

(Add screenshots here)

Suggested screenshots:

Swagger categories endpoints:
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/2b1978d3-4ff6-4226-ad26-621e55ca7f62" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/07f6378b-d48a-4543-a1dd-8b9cc9253cc6" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/9566f9fd-9f4f-4e73-a8e5-cd60a6986e0f" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/a49f465e-f4fa-4f42-b17e-755a99429e59" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/99d57f56-d871-4f6c-ac2d-d61541b40359" />
 
Insomnia passing tests:
<img width="506" height="847" alt="image" src="https://github.com/user-attachments/assets/2c0424f0-4a2b-460d-88ba-1bfdde11b045" />
<img width="521" height="872" alt="image" src="https://github.com/user-attachments/assets/5a4ea643-121b-42b7-a889-4389bc593822" />
<img width="498" height="893" alt="image" src="https://github.com/user-attachments/assets/79887826-a583-422f-88b4-d9e5d703add6" />
<img width="508" height="871" alt="image" src="https://github.com/user-attachments/assets/b0aee3a0-7bfd-4cdd-acd0-d34242677510" />
<img width="511" height="872" alt="image" src="https://github.com/user-attachments/assets/0f594814-e604-4e0e-bcb2-21ce45b83682" />
<img width="507" height="891" alt="image" src="https://github.com/user-attachments/assets/62439b53-026a-4d6f-9920-4b8ed79ff0a6" />
<img width="502" height="897" alt="image" src="https://github.com/user-attachments/assets/17fd20a7-6261-4ce6-a603-ed33ed61af15" />

 IntelliJ project structure
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/64f67ba2-2198-409d-9a85-7842f7d17847" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/afaff134-c0d8-4b0b-a8b6-b32ed0019180" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/237c9d03-f7fb-4e0d-bd9c-43188a190643" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/f28943f2-1986-4394-9653-6cdfd221ef54" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/92689ff2-31af-4b76-b901-466654d1e84c" />
 <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/17b46668-4d77-4937-ba34-9dfd06f5340d" />

Product search bug fix results
   <img width="1920" height="1140" alt="image" src="https://github.com/user-attachments/assets/38edf7c6-ef12-43fd-b5d0-06f16239ddfc" />


---
## Documentation
[NeoByte Games Capstone 3 Master Project Plan - Google Docs.pdf](https://github.com/user-attachments/files/29392387/NeoByte.Games.Capstone.3.Master.Project.Plan.-.Google.Docs.pdf)


## Reflection

This project strengthened my understanding of REST APIs, backend architecture, debugging workflows, and testing strategies. The most valuable lesson was learning how controllers, services, repositories, and HTTP responses work together to create a functional application.
