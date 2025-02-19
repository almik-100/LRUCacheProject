An optimized Least Recently Used (LRU) Cache implementation in Java, achieving **O(1) time complexity** for `get` and `put` operations using a doubly linked list and hash map. Validated with JUnit tests and benchmarks.

## Features
-  **O(1) Time Complexity**: Constant-time operations for `get` and `put`.
-  **LRU Eviction Policy**: Automatically removes least recently used items when capacity is exceeded.
-  **100% Test Coverage**: 5 JUnit tests for edge cases, updates, and eviction logic.
-  **Benchmarked**: 80x faster than a naive O(n) implementation.

## XYZ Framework
| Component | Description |
|-----------|-------------|
| **X (Goal)** | Optimize cache operations to achieve O(1) time complexity. |
| **Y (Metrics)** | Validated via JUnit tests and benchmarks (15 ms vs 1200 ms for 10,000 operations). |
| **Z (Implementation)** | Engineered with a doubly linked list, hash map, and eviction logic. |

## Benchmarks
**10,000 Operations** (Maven Benchmark):
| Implementation | Time (ms) | Time Complexity |
|----------------|-----------|-----------------|
| Optimized       | 15        | O(1)            |
| Naive (Array)   | 1200      | O(n)            |
