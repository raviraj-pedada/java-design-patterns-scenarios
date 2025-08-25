# Prototype Design Pattern (Record Example)

## Intent
Create new objects by **cloning existing objects** (prototypes) instead of instantiating them from scratch.

## Problem
In real-world applications, creating objects can be:
- **Expensive** (e.g., deep initialization, database queries, heavy configuration).
- **Complex** (lots of fields to set up correctly).
- **Repetitive** (you need similar objects with small variations).

Without Prototype:
- Every new object must be built from scratch.
- High cost if the object creation is resource-heavy.
- Risk of inconsistent configuration if manually copied each time.

## Real-World Analogy
Think of a **document template**:
- Instead of writing a new report every time, you take an existing template (prototype) and clone it.
- Then you just change that document according to your needs.
- Saves time and ensures consistency.

## Implementations in this Repo

### 1. Basic Prototype
- Implements a `copy()` method via copy constructor.
- Copies **primitive fields** but **shares references** of nested objects.
- Simple but not safe for mutable objects.

### 2. Shallow Copy
- Uses `Cloneable` and `super.clone()`.
- Copies fields **by reference**.
- Changes in nested objects (like `Author`) affect both original and clone.

### 3. Deep Copy
- Manually clones nested objects.
- Ensures complete **independence** of clone.
- Safer, but more complex and costly to implement.

### 4. Prototype Registry
- Maintains a **registry (map) of prototypes**.
- Clients request objects by key and receive cloned copies.
- Useful for **preconfigured templates** (e.g., configurations).

---

## Why Two Approaches? (`Prototype<T>` vs `Cloneable`)
- **Custom `Prototype<T>` Interface**
    - More explicit, intention-revealing (`copy()` clearly belongs to the design pattern).
    - It uses a method like copy() instead of clone(), avoids the problems with Java's Cloneable, and doesn't need checked exceptions.
    - Preferred in **design pattern teaching/demo projects**.

- **Java `Cloneable`**
    - Built-in, integrates with `Object.clone()`.
    - Requires handling `CloneNotSupportedException`.
    - Good to demonstrate how Java natively supports shallow/deep copying.
    - Often avoided in modern real-world projects (due to limitations).

>  In summary:
> - We use **`Prototype<T>`** → to demonstrate design pattern principles clearly.
> - We use **`Cloneable`** → to show Java’s native mechanism and explore shallow vs deep copy differences.

---

## Comparison Table

| Approach           | Nested Objects | Independence of Clone | Complexity | Use Case |
| ------------------ | -------------- | --------------------- | ---------- | -------- |
| Basic Prototype    | Shared         | ❌                    | Low        | Simple copies, demos |
| Shallow Copy       | Shared         | ❌                    | Low        | Quick copies, not safe for mutable fields |
| Deep Copy          | New instances  | ✅                    | Medium     | Safe cloning when full independence is needed |
| Prototype Registry | Depends        | ✅/❌                 | High       | Preconfigured reusable templates |

## Usage
Run `PrototypeApp.java` to see:
- How Basic, Shallow, Deep, and Registry prototypes behave.
- The difference in cloning behavior for nested objects like `Author`.

## Key Takeaways
- **Prototype saves resources** when creating complex objects.
- **Shallow copies** are cheap but risky.
- **Deep copies** are safer but require more work.
- **Prototype Registry** is best for managing multiple reusable templates.  
