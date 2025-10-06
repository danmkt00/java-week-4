# Set, HashSet, TreeSet, and LinkedHashSet in Java

In Java, a **Set** is a **collection that stores unique elements**.  
It does **not allow duplicates**.  

There are different types of sets with different behaviors: **HashSet, TreeSet, LinkedHashSet**.

---

## 1. Set Interface

- The **Set** interface is part of `java.util`.
- Common methods (all sets have these):
  - `add()`
  - `remove()`
  - `contains()`
  - `size()`
  - `isEmpty()`

---

## 2. Types of Sets

| Type              | Order                  | Allows Duplicates | Null Element | Notes                                      |
|-------------------|------------------------|-------------------|--------------|--------------------------------------------|
| **HashSet**       | No order               | ❌                 | ✅ (only one) | Fastest, uses hashing                      |
| **LinkedHashSet** | Insertion order        | ❌                 | ✅ (only one) | Keeps elements in order they were added    |
| **TreeSet**       | Sorted (natural order) | ❌                 | ❌            | Keeps elements sorted, slower than HashSet |

---

## 3. Examples

### HashSet Example
```java
import java.util.HashSet;

public class ExampleHashSet 
{
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, ignored
        System.out.println(set); // Order not guaranteed
    }
}
````

### LinkedHashSet Example

```java
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println(set); // Maintains insertion order
    }
}
```

### TreeSet Example

```java
import java.util.TreeSet;

public class ExampleTreeSet 
{
    public static void main(String[] args) 
    {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        System.out.println(set); // Sorted order: Apple, Banana, Cherry
    }
}
```

---

## 4. Summary

| Feature     | HashSet | LinkedHashSet   | TreeSet          |
|-------------|---------|-----------------|------------------|
| Order       | No      | Insertion       | Sorted           |
| Duplicates  | ❌       | ❌               | ❌                |
| Null        | ✅       | ✅               | ❌                |
| Performance | Fastest | Slightly slower | Slower (sorting) |

---

**Key Points:**

* Use **HashSet** for fast operations when order doesn’t matter.
* Use **LinkedHashSet** when you want to **preserve insertion order**.
* Use **TreeSet** when you want **elements sorted automatically**.

---

