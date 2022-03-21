**Data Types**
- A set of values or data with methods that can be applied to them constitutes a data type.
- Data Types in Java are divided into two groups, Primitives and Non-Primitives. Primitives are built into Java, they are boolean, char, byte, short, int, long, float and double. Non-Primitives are created by programmers which includes Arrays, Classes, Interfaces etc.
- Java is a statically typed language which means that the type of the variables or expressions is known at the compile time. It is also a strongly typed language because every variable has a type, every expression has a type, and every type is strictly defined. Second, all assignments, whether explicit or via parameter passing in method calls, are checked for type compatibility.
- Primitives are not object oriented because of efficiency issues. So Java is not completely object oriented.
- Integer types are byte, short, int, long which has width of 8, 16, 32, 64 bits respectively. The range of values of these types is -2^(w - 1) to 2^(w - 1) - 1, were w is the width of the type. For example range of byte would be -2^7 to 2^7 - 1 that is -128 to 127.
- Floating point types are Float and Double. Java implements IEEE-754 standard for floating point numbers. The width of float and double is 32 and 64 bits and the range of the values of these types are 1.4e-045 to 3.4e+038 and 4.9e-324 to 1.8e+308 respectively.
- Java uses unicode character set for characters and size is 16 bits. The range is 0 to 65536.
- Boolean uses 1 bit. The values can be true or false.

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
