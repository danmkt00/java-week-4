# Map, HashMap, TreeMap, and LinkedHashMap in Java

In Java, a **Map** is a collection that **stores key-value pairs**.  
- Each key is **unique**.  
- Each key maps to exactly **one value**.  

---

## 1. Map Interface

- Part of `java.util`.
- Common methods (all maps have these):
  - `put(key, value)`
  - `get(key)`
  - `remove(key)`
  - `containsKey(key)`
  - `containsValue(value)`
  - `size()`

---

## 2. Types of Maps

| Type              | Order            | Null Keys                | Null Values | Notes                             |
|-------------------|------------------|--------------------------|-------------|-----------------------------------|
| **HashMap**       | No order         | ✅ (one null key allowed) | ✅           | Fastest, uses hashing             |
| **LinkedHashMap** | Insertion order  | ✅ (one null key allowed) | ✅           | Preserves insertion order         |
| **TreeMap**       | Sorted (by keys) | ❌                        | ✅           | Keys are sorted naturally, slower |

---

## 3. Examples

### HashMap Example
```java
import java.util.HashMap;

public class ExampleHashMap 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        System.out.println(map); // Order not guaranteed
    }
}
````

### LinkedHashMap Example

```java
import java.util.LinkedHashMap;

public class ExampleLinkedHashMap 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        System.out.println(map); // Maintains insertion order
    }
}
```

### TreeMap Example

```java
import java.util.TreeMap;

public class ExampleTreeMap 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        System.out.println(map); // Sorted by key: 1, 2, 3
    }
}
```

---

## 4. Summary

| Feature     | HashMap       | LinkedHashMap   | TreeMap          |
|-------------|---------------|-----------------|------------------|
| Order       | No            | Insertion       | Sorted by key    |
| Null Key    | ✅ (1 allowed) | ✅ (1 allowed)   | ❌                |
| Null Values | ✅             | ✅               | ✅                |
| Performance | Fastest       | Slightly slower | Slower (sorting) |

---

**Key Points:**

* Use **HashMap** when order doesn’t matter and you want fast access.
* Use **LinkedHashMap** when you need **insertion order**.
* Use **TreeMap** when you want **keys automatically sorted**.

---
