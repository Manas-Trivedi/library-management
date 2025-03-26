# 📚 Library Management System

A Java-based Digital Library Management System that allows librarians to:
- Add, view, search, update, and delete books.
- Store book details with availability status.
- Validate input with exception handling.
- Use JUnit tests for functionality verification.

---

## 🚀 Features
- **CRUD Operations**: Add, view, search, update, and delete books.
- **Input Validation**: Ensures non-empty titles, unique IDs, and valid availability status.
- **JUnit Testing**: Includes unit tests for service methods.
- **CLI Menu**: Command-line interface for interacting with the system.

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone git@github.com:Manas-Trivedi/library-management.git
cd library-management
```

### 2️⃣ Build the Project
```bash
mvn clean install
```

### 3️⃣ Run the Program
```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```

---

## 🛠️ Running Tests

To run JUnit tests:
```bash
mvn test
```

---

## 💡 Challenges Faced

### 1.	Dependency Issues:
•	Initially, I faced issues with the JUnit dependencies not resolving properly.
•	Solved by installing Maven and configuring the correct dependencies.

### 2.	Validation & Exception Handling:
•	Implementing proper validation logic took time to ensure robustness.
•	Added exception handling to avoid crashes on invalid input.

---

## 🚀 Future Improvements

### 1.	Database Integration:
•	Replace the in-memory HashMap with a proper database (e.g., MySQL, MongoDB) for persistence.
### 2.	UI Interface:
•	Add a graphical user interface (GUI) using JavaFX for better usability.
### 3.	Export & Import:
•	Add functionality to export the book catalog to a .csv file and import data from a file.

---