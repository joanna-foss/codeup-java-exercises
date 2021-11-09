public class JavaFundamentals {
/**
* # Java Fundamentals

## Main Concepts to be Assessed

TODO: STUDY -> Object Oriented Programming
TODO: STUDY -> Method Overriding and Method Overloading
TODO: STUDY -> Arrays
TODO: STUDY -> Inheritance and Polymorphism
TODO: STUDY -> Interfaces
TODO: STUDY -> Collections
TODO: STUDY -> Exceptions and Error Handling

## Currently not being assessed:

- Annotations like @SuppressWarnings or @Deprecated
- Files I/O
- Abstract Classes
- Deployment and Dependencies
- Testing Code with JUnit

## Java Fundamentals Checklist

## Knowledge

### Java I

TODO: - [X] I can explain how Java code runs: from being written to executing on an operation system.
    Java code is written in a way that is plain-text and human-readable. Java source code is saved as a java file is compiled with the javac tool. The output of a java file upon compilation is a class file (that contains JVM Bytecode - this is the lower-level language that closely resembles executable computer code.
TODO: - [X] I can explain the difference between a primitive type and a reference type in Java.
    Primitive types: "building blocks" of the language; any variable that holds a primitive type has a value. There are 8.
    (byte, short, int, long, float, double, char, boolean)
    Reference types: types that refer to objects or arrays. They default to 'null' indicating a lack of an object. There are 5.
    (Array, Class, Interface, String, Enumeration, Annotations)
TODO: - [X] I can name several primitive types in Java.
    Look above.
TODO: - [X] I can explain why multiple number primitive types are used.
    Java is a strict language that is compiled into byte code. It's like an assembly language that can only be read by the Java Virtual Machine. Therefore, you MUST specify the exact number of bits needed to interpret each number variable. It is possible to use double and long for every number variable. HOWEVER, it's ideal to use the smallest amount of data possible to accomplish a task to preserve memory (although in today's world, that is becoming less and less relevant).
TODO: - [X] I can give an example of implicit and explicit casting.
    Implicit casting: more precise variable to less precise. (example: int to long)
    Explicit casting: less price variable to more precise. (example: double to int)
TODO: - [X] I can explain the difference between a runtime and compile-time error.
    Runtime errors: These are errors that occur after compiling and during the time at which the java code is run.
    Compile-time errors: These are errors that occur during compilation indicating that JVM Bytecode cannot be created. (verify)
TODO: - [X] I can identify the major editions of Java.
    The major editions are the ones that have regular updates for prolonged periods of time. These are: (Java SE 8, Java SE 11, Java SE 17).
TODO: - [X] I can define what a Java wrapper class is.
    Wrapper classes provide a way for us to use primitive data types as objects.

### Java II

TODO: - [ ] I can articulate what OOP is.
TODO: - [ ] I can identify the four levels of visibility for a class/field/method and the identifiers used.
TODO: - [ ] I know what class of static methods is often used when working with arrays.
TODO: - [ ] I can explain the difference between static (class) fields/methods and instance fields/methods.
TODO: - [ ] I can explain the difference between method overloading and method overriding.
TODO: - [ ] I can identify the four pillars of object-oriented programming and give examples of each one.
TODO: - [ ] I can describe the differences between interfaces and abstract classes and their use cases.
TODO: - [ ] I can generally describe what the Java Collections Framework is and specifically talk about the differences between a list, set, and map.
TODO: - [ ] I can explain the difference between a checked and unchecked exception.
TODO: - [ ] I can explain what a Java annotation is, why they are used, and give examples.
TODO: - [ ] I can explain the difference between the throws and throw keywords with regard to exceptions.

## Skills

### Java I

TODO: - [ ] I can write a hello world Java program from scratch.
TODO: - [ ] I can write Java control statements (if, if/else, switch, ternary) and loops (while, do-while, for, for-each) from memory.
TODO: - [ ] I can write examples of the 8 Java primitive types.
TODO: - [ ] I can write examples of explicit casting and implicit casting.
TODO: - [ ] I can convert a numeric string to a number and a number to a numeric string.
TODO: - [ ] I can define a constant.
TODO: - [ ] I can write a program that takes in user input and returns an output to the user.
TODO: - [ ] I can compare two string values.
TODO: - [ ] I can write out a program comprised of multiple methods.
TODO: - [ ] I can get the length of string, trim it, get a portion of the string, create a new string replacing some portion of it.

### Java II

TODO: - [ ] I can write a class that contains both static and instance fields and methods, constructors, setters and getters.
TODO: - [ ] I can write a program composed of multiple classes requiring instantiation (not just using classes as groups of static methods).
TODO: - [ ] I can write my own reference type and fill instances of it in an ArrayList and HashMap and use it as a return and input type of a method.
TODO: - [ ] I can write an abstract class and a subclass that extends from the abstract class.
TODO: - [ ] I can write multiple interfaces and implement their methods in another class.
TODO: - [ ] I can create arrays of various data types and sizes with and without using an array initializer.
TODO: - [ ] I can get the length of an array, get a specific element or range of elements, create a new array replacing some portion of it, and iterate over an array of elements.
TODO: - [ ] I can do the above with an ArrayList.
TODO: - [ ] I can comfortably use the helper methods of both Arrays and Collections classes.
TODO: - [ ] I can write a program that throws a runtime exception.
TODO: - [ ] I can write an example of method overloading and method overriding.
TODO: - [ ] I can write a program that reads and writes to a file.
TODO: - [ ] I can write methods and collections that work with a parent class or interface type but use instances of objects that extend from these parent classes or implement these interfaces (Polymorphism).

## Example Problems

Below are examples of the type of problem you will encounter on the assessment. These problems are not an exhaustive example of all the topics that will be covered on the assessment, rather, are meant to familiarize you with the kind of problem and format to expect.

TODO: [ ] 1. Create an `Assessment` class with a public static method named `half`. It should accept a number and return the number divided by two.
TODO: [ ] 2. Within your `Assessment` class create a public static method named `shout`. It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.
TODO: [ ] 3. Create an `Animal` class. It should have private instance properties for strings `name` and `species`, and public getters and setters for both.
TODO: [ ] 4. Within your `Animal` class, define an instance method named `roar`. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where `$NAME` is replaced with the value of the name property for that object.
TODO: [ ] 5. Within your `Assessment` class create a public static method named `removeCats`. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.

Note that the assessment spec only requires you to have methods and classes defined, there is not any requirement for a `main` method. However, creating additional methods will **not** be counted against you, so you are **_highly encouraged_** to create a `main` method and write some code that tests out the code you are writing for the assessment specification. For example, if you were working on the `half` function, you should call that function within the main method and make sure that it returns the correct values for several test cases.

**/
}
