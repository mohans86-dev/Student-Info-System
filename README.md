# 📚 Student Management System (Java)

A simple **Java console-based application** for managing student records.  
This project demonstrates **file handling, input validation, and menu-driven programming** in Java.

---

## 🚀 Features
- ➕ **Add Student** – Enter student details (ID, Name, Class, Roll No) and save them to a file.
- 📖 **View Students** – Display all saved student records in a neatly formatted table.
- 💾 **Persistent Storage** – Data is stored in `studentdata.txt` file.
- 🖥️ **Menu-driven Console UI** – Easy navigation with 3 options:
  1. Add student
  2. Print all students
  3. Exit

---

## 📂 File Structure

├── Student.java # Handles student input, saving, and printing
├── StudentMenu.java # Main program with menu-driven interaction
├── studentdata.txt # Stores student records (auto-created)---

## 🛠️ How It Works
1. Run the program:
   ```bash
   javac StudentMenu.java Student.java
   java StudentMenu
