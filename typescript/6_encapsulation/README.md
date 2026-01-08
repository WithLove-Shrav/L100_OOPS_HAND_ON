# Encapsulation in TypeScript

This folder contains examples that illustrate **encapsulation**, the practice of bundling data (properties) and methods that operate on that data within a class, while restricting direct access from outside the class.

## What you’ll find
- Classes with `private` or `protected` fields and `public` getter/setter methods.
- Demonstrations of how encapsulation protects internal state and enforces invariants.
- Example usage showing interaction with encapsulated objects via their public API.

## How to explore
1. Open the `.ts` files to see the encapsulated class definitions.
2. Run the examples with `ts-node` or compile with `tsc`.

```bash
# Run directly (requires ts-node)
npx ts-node example.ts
# Or compile then run
npx tsc example.ts
node example.js
```

Feel free to experiment by adding validation logic to setters or exposing additional methods.

---
*This README offers a concise guide for beginners learning encapsulation in TypeScript.*
