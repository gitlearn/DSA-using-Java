**Data Types**
- A set of values or data with methods that can be applied to them constitutes a data type.
- Data Types in Java are divided into two groups, Primitives and Non-Primitives. Primitives are built into Java, they are boolean, char, byte, short, int, long, float and double. Non-Primitives are created by programmers which includes Arrays, Classes, Interfaces etc.
- Java is a statically typed language which means that the type of the variables or expressions is known at the compile time. It is also a strongly typed language because there are restrictions in implicit conversions of types.

**Variables**
- It is a data container. The assigned data type designates the type and quantity of value it can hold.
- Variables should be declared before defining. 
```
int a;  => declaration
a = 5;  => definition
```
- Both declaring and defining can be done in a single statement,
```
int a = 5;
```
- In the above example, ``a`` is just a reference variable that is referencing or pointing to a memory location that has the value 5. In other words ``a`` consists of the address of the memory that has the value 5.
- *Local Variable* is a variable defined within a block or method or constructor.
- *Instance Variable* is a variable defined in a class that can only be accessed using an object of that class.
- *Static Variables* is a variable defined in a class that doesn't require an object to access it.
