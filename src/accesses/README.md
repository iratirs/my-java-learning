# Accesses

In this exercise we will investigate _**Encapsulation**_, a key part of OOP which determines how to access methods and
variables from other classes.

### Access modifiers

When defining elements of a class like variables and elements we can use *access specifiers* or *access modifiers* to
determine the scope of the access to the elements of a class from other classes. The main modifiers we encounter for
variables and methods are *public*, *protected*, *private* and *default*.
In order to access all of these class elements where they are defined as non-static (in the absence of keyword *static*),
it is key that declare an *instance of a class* or *object* first.

* **Public:** upon object declaration, public class elements can be accessed from anywhere in the program.
* **Protected:** upon object declaration, protected class elements can be accessed within the same package or if the calling class is an extension of the class where the protected element is defined.
* **Default:** upon object declaration, default class elements can be accessed within the same package. No keyword is used for default class elements.
* **Private:** access of private elements is limited to the class where they are declared. In order to access the functionalities or values of such elements from other classes, we will need to define public setter and getter methods within the class where they are first defined. These run private methods and return private variables respectively. An object of the original class will need to be declared to call for the setter and getter methods as in the case of public elements.

### Static methods

Expanding on the previous access modifiers, Java allows for the declaration of static methods. These are methods that belong
to a class but need no declaration of an object to be accessed. This is a result of the fixed ram memory of static methods, 
which simplifies the code for those frequently used methods.