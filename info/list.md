# ArrayList vs LinkedList in Java

Both **ArrayList** and **LinkedList** are types of **List** in Java.  
This means they **have the same methods** as:

- `add()`
- `remove()`
- `get()`
- `size()`
- `contains()`

The main difference is **how they store data** and how fast certain operations are.

---

## 1. How They Store Data

| Feature         | ArrayList                                 | LinkedList                                |
|-----------------|-------------------------------------------|-------------------------------------------|
| Storage         | **Array** (elements in continuous memory) | **Nodes** (elements linked with pointers) |
| Memory          | Less                                      | More (needs extra memory for pointers)    |
| Access by index | Fast (`O(1)`)                             | Slow (`O(n)` – must traverse nodes)       |

---

## 2. Performance Summary

| Operation               | ArrayList | LinkedList | Notes                                 |
|-------------------------|-----------|------------|---------------------------------------|
| Access element by index | Fast      | Slow       | ArrayList is better for random access |
| Add at end              | Fast      | Fast       | Both are efficient                    |
| Add/remove in middle    | Slower    | Moderate   | LinkedList avoids shifting elements   |
| Memory usage            | Lower     | Higher     | LinkedList stores extra links         |

---

## 3. When to Use

- **ArrayList**
  - Fast random access needed.
  - Add/remove mostly at the end.
- **LinkedList**
  - Frequent add/remove in the middle or start.
  - Random access is not important.

---

## 4. Examples

### ArrayList Example
```java
import java.util.ArrayList;

public class ExampleArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Second fruit: " + fruits.get(1)); // Fast access
        fruits.remove(0); // Remove first element
        System.out.println("Fruits: " + fruits);
    }
}
````

### LinkedList Example

```java
import java.util.LinkedList;

public class ExampleLinkedList 
{
    public static void main(String[] args) 
    {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.addFirst("Mango"); // Fast insertion at start
        fruits.addLast("Banana");

        System.out.println("First fruit: " + fruits.getFirst());
        fruits.remove(1); // Remove second element
        System.out.println("Fruits: " + fruits);
    }
}
```

---

## ✅ Summary

* Both **ArrayList** and **LinkedList** share the **same methods**.
* **ArrayList** is better for **fast access**.
* **LinkedList** is better for **frequent insertions/deletions** in the middle or start.

```

---

