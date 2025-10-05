# Week 4: Exception Handling & Collections Framework

This week focuses on handling runtime errors gracefully and mastering Java’s **Collections Framework** for managing groups of data.
Students will also learn how to iterate efficiently using **Iterators** and **Enhanced For Loops**.

---

## Topics Covered

### **1. Exception Handling**

* Understanding different types of errors:

    * Compilation, Runtime, and Logical errors
* Exception hierarchy (`Throwable`, `Exception`, `Error`)
* **Checked vs Unchecked** exceptions
* Using `try`, `catch`, `finally` blocks
* Throwing exceptions manually with `throw`
* Declaring exceptions with `throws`
* Creating **custom exceptions**
* Best practices for clean, readable error handling

---

### **2. Java Collections Framework**

* Purpose of the Collections Framework
* **List, Set, and Map** interfaces
* Key implementations:

    * `ArrayList` 
    * `HashSet`, 
    * `HashMap`, 
* Understanding:

    * Duplicates and uniqueness
    * Ordered vs unordered collections
    * Accessing elements (by index or key)
* Choosing the right collection for different use cases

---

### **3. Iteration in Collections**

* Traversing collections safely and efficiently
* **Enhanced For Loop (for-each)**:

    * Simple traversal for reading data
    * Best for read-only operations
* **Iterator Interface**:

    * Methods: `hasNext()`, `next()`, `remove()`
    * Safe element removal during iteration
    * Preventing `ConcurrentModificationException`
* Using **`forEach()`** and **lambda expressions** (Java 8+)

    * Functional style iteration
    * Method references (`System.out::println`)

---

### **4. Practical Integration**

* Combining Collections with Exception Handling
  (e.g., handling missing keys, empty lists, or invalid data)
* Using Iterators to filter data dynamically
* Nesting Lists and Maps for real-world data modeling

---

## Activities

* Practice `try-catch-finally` with different exception types
* Create and handle **custom exceptions**
* Work with **Lists**, **Sets**, and **Maps** to manage collections of data
* Write programs using **Iterators** and **for-each loops**
* Build mini-projects combining OOP and collections concepts:

    * Library Management
    * Movie Catalog
    * Student Grade Tracker

---

## Learning Outcomes

By the end of Week 4, students will:

- Understand and apply **exception handling** effectively
- Know when to use **checked vs unchecked** exceptions
- Be confident using **Java Collections (List, Set, Map)**
- Traverse collections with **Iterators and enhanced for loops**
- Write cleaner, safer, and more maintainable Java code

---
