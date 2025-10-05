# 📘 Iteration in Java – `Iterator` and `Enhanced For Loop`

In Java, **iteration** means accessing elements of a collection (like a `List`, `Set`, or `Map`) **one by one**.
This is one of the most common operations in backend development — for processing data, validating records, or preparing API responses.

---

## 🔁 1. Enhanced For Loop (For-Each)

### ✅ What It Is

The **enhanced for loop** is a simplified way to loop through all elements in an array or collection.

Instead of writing:

```java
for (int i = 0; i < list.size(); i++) 
{
    System.out.println(list.get(i));
}
```

You can write:

```java
for (String name : list) 
{
    System.out.println(name);
}
```

### 🧠 How It Works

* Automatically iterates through every element in a collection or array.
* You **can’t modify** (remove/add) elements during iteration.
* It’s **read-only traversal** — perfect for displaying or processing data.

### 🧩 Example

```java
import java.util.*;

public class ForEachExample 
{
    public static void main(String[] args) 
    {
        List<String> cities = List.of("Paris", "Berlin", "Rome", "Madrid");

        for (String city : cities) 
        {
            System.out.println("City: " + city);
        }
    }
}
```

---

## ⚙️ 2. Iterator Interface

### ✅ What It Is

An **Iterator** is an object that allows you to **safely traverse and modify** a collection while iterating.

All major Java collections (`List`, `Set`, `Map`, etc.) provide an `iterator()` method.

### 🧠 Why Use It

* Works for **all collection types** (including `Set` and `Map`).
* Allows **removing elements safely** while iterating (avoids `ConcurrentModificationException`).
* Gives **more control** over iteration.

---

### 🧩 Example

```java
import java.util.*;

public class IteratorExample 
{
    public static void main(String[] args) 
    {
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David"));
        Iterator<String> it = names.iterator();

        while (it.hasNext()) 
        {
            String name = it.next();
            System.out.println("Processing: " + name);

            if (name.equals("Charlie")) 
            {
                it.remove(); // Safe removal during iteration
            }
        }
        System.out.println("After iteration: " + names);
    }
}
```

---

## 🧰 3. Common Iterator Methods

| Method      | Description                                   | Example                   |
|-------------|-----------------------------------------------|---------------------------|
| `hasNext()` | Returns `true` if another element exists      | `while(it.hasNext())`     |
| `next()`    | Returns the next element                      | `String name = it.next()` |
| `remove()`  | Removes the last element returned by `next()` | `it.remove()`             |

> ⚠️ You **must** call `next()` before `remove()` or you’ll get an `IllegalStateException`.

---

## 🔄 4. Iterating with forEach() (Lambda Expression)

Since Java 8, collections also provide a built-in **`forEach()`** method — a modern, functional-style iteration.

### 🧩 Example

```java
import java.util.*;

public class ForEachLambdaExample 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = List.of(10, 20, 30, 40);
        numbers.forEach(n -> System.out.println("Value: " + n));
    }
}
```

---

## 🗺️ 5. Iterating Over Maps

### ✅ For Each Entry

```java
Map<String, Integer> ages = Map.of("Alice", 25, "Bob", 30, "Charlie", 22);

for (Map.Entry<String, Integer> entry : ages.entrySet()) 
{
    System.out.println(entry.getKey() + " → " + entry.getValue());
}
```

### ✅ Using forEach (Lambda)

```java
ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
```

### ✅ Using Iterator

```java
Iterator<Map.Entry<String, Integer>> it = ages.entrySet().iterator();
while (it.hasNext()) 
{
    Map.Entry<String, Integer> entry = it.next();
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```

---

## ⚖️ 6. Comparison – For-Each vs Iterator

| Feature                           | For-Each Loop       | Iterator                |
|-----------------------------------|---------------------|-------------------------|
| **Ease of use**                   | ✅ Very simple       | ❌ Slightly more verbose |
| **Can modify collection**         | ❌ No                | ✅ Yes (with `remove()`) |
| **Readability**                   | ✅ High              | ⚙️ Medium               |
| **Applicable to all collections** | ✅ Yes               | ✅ Yes                   |
| **Performance**                   | ⚡ Same internally   | ⚡ Same internally       |
| **Functional (Lambda) support**   | ✅ Yes (`forEach()`) | ❌ No                    |

---

## 💡 7. Best Practices

✅ Use **for-each** for simple reading or printing.
✅ Use **Iterator** when you need to **remove elements safely** while iterating.
✅ Use **forEach()** (lambda) for **modern, clean, and functional code**.
✅ Avoid modifying a collection directly during a for-each — it causes a `ConcurrentModificationException`.

---

## 🧠 Summary

| Technique         | When to Use              | Example                             |
|-------------------|--------------------------|-------------------------------------|
| **For-each loop** | Simple traversal         | `for (String item : list)`          |
| **Iterator**      | Remove elements safely   | `it.remove()`                       |
| **forEach()**     | Modern Java 8+ iteration | `list.forEach(System.out::println)` |

---

✅ **Learning Outcomes**
By the end of this topic, students will:

- Understand how to **iterate through any Java collection** safely.
- Know when to use **Iterator** vs **for-each**.
- Be comfortable using **lambda-based forEach()** (Java 8+).
- Avoid common pitfalls like modifying collections during for-each loops.

---

