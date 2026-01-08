# Polymorphism in Python

This folder demonstrates **polymorphism** in Python, the ability of different object types to be accessed through a common interface. Python’s dynamic typing makes polymorphism natural, allowing functions to operate on any object that implements the required methods (duck typing).

## What you’ll find
- A base class (e.g., `Animal`) defining a method like `speak()`.
- Subclasses (`Dog`, `Cat`, `Bird`) that override `speak()` with their own implementations.
- Example scripts that store a list of mixed objects and call `speak()` on each, illustrating runtime polymorphic behavior.
- Optional use of abstract base classes (`abc.ABC`) to enforce method implementation.

## Key concepts covered
1. **Method overriding** – subclasses provide their own version of a method.
2. **Duck typing** – any object with the expected method works, regardless of its class.
3. **Abstract base classes** – using `abc.ABC` and `@abstractmethod` to define contracts.
4. **Dynamic dispatch** – Python decides which method to call at runtime.

## How to explore
```bash
python polymorphism_demo.py
```
Feel free to add more subclasses, experiment with multiple inheritance, or replace the abstract base class with protocols (`typing.Protocol`) for static type checking.

---
*This README offers a detailed guide for beginners learning polymorphism in Python.*
