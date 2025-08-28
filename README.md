# 🖥️ BridgeLabz SIPP Training

This repository contains categorized Java programming concepts and lab practices guided by **Sahil Kumar** from **11 June onwards**. Work is structured **week-wise** and organized across the following branches:  
✅ `Core-Java`  ✅ `OOPs`  ✅ `DSA`   ✅ `GenericsCollections`  ✅ `Workshop`

---

## 📅 Week 1 – [Core-Java Branch](https://github.com/amanyadav2121/BridgeLabz-SIPP-Training/tree/Core-Java)

> **Branch:** `Core-Java`  
> **Date Range:** 11 June – 21 June

---

### 📘 01 - Java Programming Elements (📅 11 June)
**Concepts:**
- Java Comments  
- Data Types  
- Variables  
- Arithmetic Operators  
- Type Conversion  
- User Input  

---

### 🔁 02 - Java Control Flows (📅 12 June)
**Concepts:**
- Boolean Expressions  
- Logical Operators  
- `if`, `else`, `switch`  
- Loops: `for`, `while`  
- `break`, `continue`  

---

### 🧮 03 - Java Arrays (📅 13 June)
**Concepts:**
- 1D and 2D Arrays  
- Multidimensional Arrays  
- Modifying and Accessing Arrays  
- `length`, `System.exit()`, `System.err`  

---

### 🔧 04 - Java Methods (📅 16 June)
**Concepts:**
- User-defined, Static & Recursive Methods  
- Method Reusability  
- `Math` Class  

---

### 🔤 05 - Java String (📅 17 June)
**Concepts:**
- Creating & Taking Input  
- String Arrays  
- String Built-in Methods  
- ASCII Characters  

---

### 🔤 Java String Practices (📅 18 June)
**Concepts:**
- Java Strings  
- Creating Strings  
- Use of `"\\"` Escape Sequence  
- Taking String Input  
- String Arrays  
- String as Method Parameters  
- String Class Built-In Methods  
- ASCII Character Codes  
- Java Exceptions  
- Java Exception Hierarchy  
- Types of Exceptions (Checked & Unchecked)  
- `java.lang.RuntimeException`  

---

### 🕒 06 - Built-in Functions & Date-Time (📅 19 June)
**Concepts:**
- `Math`, `Random` Classes  
- Java 8+ APIs: `LocalDate`, `LocalTime`, `LocalDateTime`

---

### 📚 07 - **Extras: String Handling & Functions** (📅 21 June)
**Concepts:**
- Advanced String Handling  
- Common String Functions  
- Parameter Passing & Return Concepts  

---

## 📅 Week 2 – [OOPs Branch](https://github.com/amanyadav2121/BridgeLabz-SIPP-Training/tree/OOPs)

> **Branch:** `OOPs`  
> **Date Range:** 23 June – 26 June

---

### 🧱 01 - Java Class & Object Concepts (📅 23 June)

**Concepts:**
- Procedural vs Object-Oriented Programming  
- Java Class and Object  

---

### 🛠️ 02 - Constructors & OOP Keywords (📅 24 June)
**Concepts:**
- Java Constructors  
- Instance vs Class Variables  
- Access Modifiers  

---

### 🧠 03 - Keywords (Contd.) & Eclipse IDE (📅 25 June)
**Concepts:**
- Deep Dive into:  
  - `this`, `static`, `final`, `instanceof`  
- Eclipse IDE Setup and Usage

---

### 🗂️ 04 - Object Modeling & Diagrams (📅 26 June)
**Concepts:**
- Class Diagrams  
- Object Diagrams  
- Sequence Diagrams  

---

## 📅 Week 3 – [OOPs Branch](https://github.com/amanyadav2121/BridgeLabz-SIPP-Training/tree/OOPs)

> **Branch:** `OOPs`  
> **Date Range:** 1 July – 4 July

---

### 🧬 05 - Inheritance (📅 1 July)
**Concepts:**
- Inheritance Overview  
- Single-Level Inheritance  
- Multilevel Inheritance  
- Hierarchical Inheritance  
- Key Features of Inheritance  
- Method Overriding  
- Constructor Inheritance  
- Polymorphism and Inheritance  
- Access Modifiers & Inheritance  

---

### 🧩 06 - OOP Principles (📅 2 July)
**Concepts:**
- Encapsulation  
- Polymorphism (Compile-Time & Run-Time)  
- Interfaces  
- Abstract Classes  

---

### 🧠 Assignment Submission (📅 3 July)
**Concepts:**
- **`abstract class` and `abstract method`**  
  Enables partial implementation and enforces subclass responsibility.

- **`interface` and `implements`**  
  Supports abstraction and multiple inheritance via contract-based design.

- **Method Overriding using `@Override` annotation**  
  Allows runtime polymorphism and ensures method signature correctness.

- **Access Modifiers (`private`, `public`)**  
  Controls class member visibility and enforces encapsulation.

- **Constructor Chaining with `super()`**  
  Reuses base class constructor logic in child classes.

- **Encapsulation using Getters and Setters**  
  Protects fields and maintains data integrity.

- **Real-world Domain Modeling with OOP**  
  Represents entities and relationships with proper abstraction and hierarchy.

- **Interface-driven Design**  
  Promotes flexible, loosely-coupled, and scalable architecture.

- **Code Reuse via Inheritance**  
  Avoids redundancy and promotes DRY principles in object hierarchies.

---

## 📅 Week 4 – [DSA Branch](https://github.com/amanyadav2121/BridgeLabz-SIPP-Training/tree/DSA)

> **Branch:** `DSA`  
> **Date Range:** 5 July – 15 July 

---

### 🧵 01 - Data Structure Introduction & LinkedList (📅 5-6 July)

**Concepts:**
- Introduction to Data Structures  
- Key Features of Data Structures in Java  
- Types of Data Structures in Java  
- **Singly Linked List**  
- **Doubly Linked List**  
- **Circular Linked List**  

---

### 🧬 02 - Stack, Queue and Non-Linear Data Structures (📅 7 July)

**Concepts Covered:**

- **Stack**
  - LIFO (Last In First Out) Principle
  - Key operations: `push()`, `pop()`, `peek()`, `isEmpty()`
  - Use Cases:
    - Expression evaluation
    - Undo operations
    - Function call stack
    - Balanced parentheses checking
  - Java Built-in: `java.util.Stack`
  - Custom Implementation: Using arrays or linked lists
  - Internal Working:
    - `push()` → O(1)
    - `pop()` → O(1)
    - `peek()` → O(1)
  - Applications:
    - Backtracking
    - Call stack
    - Parenthesis matching
  - Sample Problem: Balanced Parentheses Checker
  - Best Practices:
    - Always check `isEmpty()` before `pop()` or `peek()`
    - Use synchronized structures for thread safety

- **Queue**
  - FIFO (First In First Out) Principle
  - Types:
    - Simple Queue
    - `PriorityQueue`
    - `Deque` (Double-Ended Queue)
  - Key operations: `offer()`, `poll()`, `peek()`, `isEmpty()`
  - Use Cases:
    - Task scheduling
    - Request buffering
    - Breadth-first search
  - Java Implementations:
    - `LinkedList`, `ArrayDeque`, `PriorityQueue`
  - Internal Working:
    - Enqueue → Add to end → O(1)
    - Dequeue → Remove from front → O(1)
  - Sample Problem: Ticket Counter Management System
  - Best Practices:
    - Use `offer()` instead of `add()` for safe enqueue
    - Use `poll()` instead of `remove()` to avoid exceptions
    - Avoid storing `null` values
    - Prefer thread-safe queues like `ConcurrentLinkedQueue` for concurrency

---

**Extra Work (Advanced DSA Practice):**
Kindly go through the following topics as part of your advanced DSA practice:

- **Non-Linear Data Structures**
  - **Binary Tree**
  - **Binary Search Tree (BST)**
  - **Heap** (Min Heap / Max Heap)
  - **AVL Tree**
  - **Red-Black Tree**

---

## 🗃️ [DSA Branch](https://github.com/amanyadav2121/BridgeLabz-SIPP-Training/tree/DSA)

> **Branch:** `DSA`

---

### 🧬 02 - HashMap and Hashing Function (📅 8 July)

**Concepts Covered:**

- **HashMap**
  - Stores key-value pairs
  - Allows fast retrieval, insertion, and deletion
  - Key operations: `put()`, `get()`, `remove()`, `containsKey()`, `isEmpty()`
  - Time Complexity (Average Case):
    - `put()` → O(1)
    - `get()` → O(1)
    - `remove()` → O(1)
  - Internal Working:
    - Uses an **array of buckets**
    - Each bucket stores a **linked list or tree** of entries (in case of collision)
    - Hashing used to calculate the index for storing keys

- **Hashing Function**
  - Converts a key into an integer (hash code)
  - Then maps it to a bucket index using `index = hash % capacity`
  - Good hashing minimizes collisions and distributes keys uniformly

- **Collision Handling Techniques**
  - **Chaining**: Use a linked list at each bucket to store multiple entries with the same hash
  - **Open Addressing**: Find the next empty slot in the array using linear/quadratic probing

- **Applications**
  - Caching
  - Database indexing
  - Symbol tables in compilers
  - Storing user data (e.g., login credentials)

- **Java Implementation**
  - Built-in class: `java.util.HashMap<K, V>`
  - Supports null keys and values
  - Not synchronized → use `Collections.synchronizedMap()` or `ConcurrentHashMap` for thread safety

- **Best Practices**
  - Use immutable keys to avoid unexpected behavior
  - Set initial capacity if size is predictable to avoid frequent resizing
  - Use `containsKey()` before `get()` to avoid null pointer exceptions
  - Avoid storing `null` as key/value if not needed (for clarity)

---

### 📚 03 - Sorting Algorithms (📅 9 July)

**📌 Concepts Covered:**

- **🫧 Bubble Sort**
  - Compares adjacent elements; swaps if in wrong order
  - Time: Worst → O(n²), Best (already sorted) → O(n)

- **📥 Insertion Sort**
  - Builds the sorted array one item at a time
  - Time: Worst → O(n²), Best → O(n)

- **🔀 Merge Sort**
  - Divide & conquer; always O(n log n)
  - Stable and good for large datasets

- **⚡ Quick Sort**
  - Selects pivot, partitions array
  - Avg: O(n log n), Worst: O(n²), In-place

---

### 🔍 04 & 05 - Searching & String/File Handling (📅 10 July)

**📌 Concepts Covered:**

- **Linear Search**
  - Checks each element
  - Time: O(n)

- **Binary Search**
  - Works on sorted arrays only
  - Time: O(log n)

- **StringBuilder vs StringBuffer**
  - Both are mutable strings
  - `StringBuilder`: Non-synchronized (faster)
  - `StringBuffer`: Synchronized (thread-safe)

- **BufferedReader, FileReader, InputStreamReader**
  - Used for file and input handling
  - `BufferedReader` improves performance by buffering input

---

### 🧬 06 - Algorithm Runtime & Big-O Notation (📅 11 July)

**📌 Concepts Covered:**

- **Runtime Analysis**
  - Measures time & space efficiency of code

- **Big-O Notation**
  - Expresses worst-case time complexity

- **Time Complexity**
  - O(1), O(n), O(log n), O(n²), etc.

- **Space Complexity**
  - Tracks memory usage of an algorithm

- **Best, Worst, Average Case**
  - Help analyze real-world performance

- **Optimization Guidelines**
  - Avoid nested loops
  - Use appropriate data structures (e.g., HashMap)

---

### 🧬 07 - OOPs Concepts in Java (📅 14 July - Review Day)

**Concepts Covered:**

- **Class & Object**
  - Class = blueprint, Object = real-world instance

- **Encapsulation**
  - Use of `private` fields + `public` getters/setters
  - Hides implementation, improves security

- **Inheritance**
  - One class inherits from another using `extends`
  - Promotes code reuse

- **Abstraction**
  - Hiding complexity, showing only relevant details
  - Achieved using:
    - `abstract class` (can have both abstract and concrete methods)
    - `interface` (100% abstract; from Java 8 supports default/static methods)

- **Interface**
  - A contract with abstract methods
  - Implemented using `implements`
  - Supports multiple inheritance

- **Polymorphism**
  - One thing, many forms
  - Compile-time (Overloading): same method name, different params
  - Runtime (Overriding): same method signature, different class

- **Overloading vs Overriding**

| Feature             | Overloading                  | Overriding                    |
|---------------------|------------------------------|-------------------------------|
| Happens In          | Same class                   | Subclass                      |
| Parameters          | Must be different            | Must be same                  |
| Return Type         | Can vary                     | Must match or be covariant    |
| Binding Time        | Compile-time                 | Runtime                       |

- **Multiple Inheritance**
  - **With classes**: ❌ Not supported (to avoid Diamond Problem)
  - **With interfaces**: ✅ Supported

---

✅ **Java is Not 100% Object-Oriented**
- Uses **primitive types** (`int`, `char`, `boolean`, etc.)
- These are not objects, hence Java is **not fully OOP**

---

## 📅 Week 5 – [GenericsCollections Branch](https://github.com/amanyadav2121/BridgeLabz-SIPP-Training/tree/Generics)

> **Branch:** `GenericsCollections`  
> **Date Range:** 21 July – 27 July

---

### 🧬 01 - Java Generics (📅 21 July)

**Concepts Covered:**

- **Introduction to Generics**
  - Provides compile-time type safety
  - Eliminates need for type casting
  - Supports code reusability and clean APIs

- **Type Parameters**
  - Syntax: `<T>`, `<K, V>` (for key-value pairs)
  - Used to define generic classes and methods

- **Generic Classes**
  - Define classes with type parameters
  - Example: `class Box<T> { T value; }`
  - Instantiation: `Box<String> strBox = new Box<>();`

- **Generic Methods**
  - Methods with their own type parameters
  - Example: `<T> void printArray(T[] array)`

- **Bounded Type Parameters**
  - Restricts types using `extends`
  - Example: `<T extends Number>` – only accepts subclasses of `Number`

- **Wildcards**
  - Unbounded: `<?>`
  - Upper bounded: `<? extends Number>`
  - Lower bounded: `<? super Integer>`
  - Used for flexibility with unknown types in method parameters

---

### 📊 Graphs (📅 22 Jul)
**Concepts:**
- Graph Representations (Adjacency List and Matrix)
- Traversal Techniques (BFS & DFS)
- Implementation Examples

**Attached Resources:**
- `Scenario-Based Graph Practice Problems.pdf`
- `Graph Problem Set.pdf`
- `Graph.pdf`

---

### 🧮 02 - Collections Framework (📅 23 July)

**Concepts Covered:**

- **Overview of Collections Framework**
  - Provides standard architecture to manage groups of objects
  - Interfaces: `List`, `Set`, `Queue`, `Map`

- **Hierarchy of Collections Framework**
  - Root Interface: `Collection`
  - Subinterfaces: `List`, `Set`, `Queue`
  - Separate hierarchy: `Map`

- **List Interface and Implementing Classes**
  - Implementations: `ArrayList`, `LinkedList`, `Vector`
  - Maintains order, allows duplicates
  - Use Case: Dynamic array, indexed access

- **Set Interface and Implementing Classes**
  - Implementations: `HashSet`, `LinkedHashSet`, `TreeSet`
  - No duplicates allowed
  - `HashSet`: Unordered, `LinkedHashSet`: Insertion order, `TreeSet`: Sorted

- **Queue and Deque Interfaces**
  - `Queue`: FIFO – `LinkedList`, `PriorityQueue`
  - `Deque`: Double-ended – `ArrayDeque`, `LinkedList`
  - Methods: `offer()`, `poll()`, `peek()`

- **Map Interface and Its Implementations**
  - Key-Value pair structure
  - Implementations: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`
  - `HashMap`: Fast, unordered
  - `LinkedHashMap`: Maintains order
  - `TreeMap`: Sorted keys

- **Comparison of Different Implementations**

  | Interface | Implementation | Ordered | Duplicates | Sorted | Thread-safe |
  |-----------|----------------|---------|------------|--------|-------------|
  | List      | ArrayList      | ✅      | ✅         | ❌     | ❌          |
  | Set       | HashSet        | ❌      | ❌         | ❌     | ❌          |
  | Queue     | PriorityQueue  | ❌      | ✅         | ✅     | ❌          |
  | Map       | TreeMap        | ✅      | Keys: ❌   | ✅     | ❌          |

- **Real-World Use Cases and Best Practices**
  - `ArrayList`: Shopping cart, music playlist
  - `HashSet`: Unique student IDs
  - `PriorityQueue`: CPU task scheduling
  - `HashMap`: Caching, dictionary implementations

  **Best Practices:**
  - Use `offer()`/`poll()` over `add()`/`remove()` to avoid exceptions
  - Prefer `ArrayList` for random access
  - Always check `containsKey()` before using `get()` in maps
  - Use generics for type safety and cleaner code

---

### 📚 Collections Submission (📅 24–25 July)

**Concepts Submitted:**

#### 📋 List Interface

- **Implemented Using**: `ArrayList`, `LinkedList`, `Vector`
- **Properties**:
  - Ordered
  - Allows duplicates
  - Index-based access
- **Key Methods**: `add()`, `get()`, `set()`, `remove()`, `size()`
- **Use Cases**:
  - Dynamic arrays
  - User activity logs
- **Best Practices**:
  - Use `ArrayList` for fast read operations
  - Use `LinkedList` for frequent insertions/deletions

#### 🧮 Set Interface

- **Implemented Using**: `HashSet`, `LinkedHashSet`, `TreeSet`
- **Properties**:
  - No duplicates
  - `HashSet`: Unordered
  - `LinkedHashSet`: Maintains insertion order
  - `TreeSet`: Sorted elements
- **Use Cases**:
  - Unique user IDs
  - Tag filtering
- **Best Practices**:
  - Use `HashSet` for fast lookups
  - Use `TreeSet` when sorted order is needed

#### 🔁 Queue Interface

- **Implemented Using**: `LinkedList`, `PriorityQueue`
- **Properties**:
  - FIFO (First In First Out)
  - `PriorityQueue`: Sorted based on natural ordering or comparator
- **Key Methods**: `offer()`, `poll()`, `peek()`
- **Use Cases**:
  - Job/task scheduling
  - BFS traversal
- **Best Practices**:
  - Use `offer()` and `poll()` to avoid exceptions
  - Avoid storing `null` values in queues

#### 🔄 Deque Interface

- **Implemented Using**: `ArrayDeque`, `LinkedList`
- **Properties**:
  - Can insert and delete from both ends
- **Key Methods**: `addFirst()`, `addLast()`, `removeFirst()`, `removeLast()`
- **Use Cases**:
  - Palindrome checking
  - Undo/redo operations

#### 🗺️ Map Interface

- **Implemented Using**: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`
- **Properties**:
  - Stores key-value pairs
  - Keys are unique
- **Key Methods**: `put()`, `get()`, `remove()`, `containsKey()`, `entrySet()`
- **Use Cases**:
  - Lookup tables
  - Storing user preferences
- **Best Practices**:
  - Use `containsKey()` before `get()`
  - Use `TreeMap` when sorting is required
  - Use `LinkedHashMap` for maintaining order

✅ **Submission Complete**  
📁 Submitted: `List`, `Set`, `Queue`, `Deque`, `Map` implementations  
🛠️ Practice done using: `java.util` classes 

## 📂 Folder Structure (Branch-wise)

```bash
BridgeLabz-SIPP-Training/
│
├── Core-Java
│   ├── ProgrammingElements/
│   ├── ControlFlow/
│   ├── Array/
│   ├── Methods/
│   ├── String/
│   ├── Extras_String/   
│   ├── BuiltIn_Functions/
│
├── OOPs
│   ├── Class_and_Object/         
│   ├── JavaConstructors/              
│   ├── KeywordsandInstanceof/              
│   ├── ObjectOrientedDesign_Principles/            
│   ├── Inheritance/
│   ├── EncapsulationPolymorphismInterfaceandAbstract/ 
│   
├── DSA
│   ├── LinkedList/  
│   ├── Stack_Queue_and_HashMap/  
│   ├── SortingAlgorithms/ 
│   ├── LinearAndBinarySearch/ 
│   ├── Big-O-Notation_Problems/
│   ├── Scenario/
│
├── GenericsCollections
│   ├── Generics/
│   ├── Collections/       
│                 
├── Workshop
│   ├── NonRepeatingChar.java
│   ├── ShoppingBillingSimulator.java
│   ├── CoffeeCounterChronicles.java
│   ├── VehicleManagement/
│   ├── OnlineStoreBillingSystem/
│   ├── VehicleRental/
│   ├── FoodLoopSystem/
│   ├── BrowserHistory/
│   ├── MusicPlaylist/
│   ├── PetAdoption/


```

## 👩‍💻 Prepared By:
**[AMAN YADAV]**  
For practice under guidance of **Sahil Kumar**  
Using Java SE Development Kit and Eclipse IDE
