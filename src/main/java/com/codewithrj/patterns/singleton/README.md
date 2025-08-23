# Singleton Design Pattern (Database Connection Example)

## Intent
Ensure a class has only one instance and provide a global point of access to it.

## Problem
In real-world applications, certain resources should be **unique**:
- Only **one database connection manager** should exist.
- Only **one logger** should be used.
- Only **one configuration manager** should load settings.

Without Singleton, multiple objects could be created, causing:
- Performance overhead (e.g., multiple DB connections).
- Inconsistent states.
- Higher memory usage.

## Real-World Analogy
Think of a **President/Prime Minister** of a country:
- No matter how many people there are, only one leader exists at a time.
- Everyone refers to the same person (global access).

## Implementations in this Repo

### 1. Lazy Initialization
- Instance created when `getInstance()` is first called.
- Not thread-safe in multi-threaded environments.

### 2. Eager Initialization
- Instance created during class loading.
- Thread-safe (JVM guarantees).
- Instance is created even if never used.

### 3. Thread-Safe Singleton (synchronized method)
- Uses `synchronized` on `getInstance()`.
- Thread-safe.
- Slower due to synchronization overhead.

### 4. Double-Checked Locking
- Uses `synchronized` block only when needed.
- More efficient than synchronized method.
- Works well with `volatile`.
- Slightly more complex implementation.

### 5. Enum Singleton
- Uses Java `enum` to enforce a single instance.
- Thread-safe.
- Protects against reflection and serialization attacks.
- Recommended approach (Effective Java).

## Comparison Table

| Approach                   | Thread-Safe | Lazy Loading | Performance | Recommended for Prod? |
| -------------------------- | ----------- | ------------ | ----------- | --------------------- |
| Lazy Initialization        | ❌           | ✅            | Fast        | No (not safe)         |
| Eager Initialization       | ✅           | ❌            | Fast        | Sometimes             |
| Thread-Safe (synchronized) | ✅           | ✅            | Slower      | Rarely used now       |
| Double-Checked Locking     | ✅           | ✅            | Good        | Yes                   |
| Enum Singleton             | ✅           | ❌            | Best        | Yes (most cases)      |


## Usage
Run `SingletonApp.java` to see:
- Only one instance is created for each approach.
- Both object references point to the same instance.

## Key Takeaways
- **For learning**: start with Lazy and Eager versions.
- **For real-world apps**: use Double-Checked Locking or Enum Singleton.
- **For the safest approach**: prefer **Enum Singleton**.
