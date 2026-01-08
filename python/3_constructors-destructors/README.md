# Constructors & Destructors in Python

Python uses the `__init__` method as a constructor to initialize new objects. Unlike languages such as C++ or Java, Python does not have explicit destructors; cleanup is handled by garbage collection and the optional `__del__` method, which is rarely needed.

## What you’ll find
- Classes that define `__init__` with required and optional parameters.
- Examples of constructor chaining using `super().__init__` in inheritance scenarios.
- A brief note on the `__del__` method and when (or why) you might use it for resource cleanup.

## Key concepts covered
1. **Constructor (`__init__`)** – setting up instance attributes.
2. **Default arguments** – providing optional parameters.
3. **Inheritance and `super()`** – delegating initialization to parent classes.
4. **Destructor (`__del__`)** – optional cleanup hook (rarely needed).

## How to explore
```bash
python example.py
```
Feel free to add more classes, experiment with default values, or implement a custom `__del__` method to see when it gets called.

---
*This README offers a concise guide for beginners learning constructors (and the concept of destructors) in Python.*
