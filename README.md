Tutorials and exercises of the book Head First Design Patterns.

----------------
Principles:

- Encapsulate what varies
- Favor composition over inheritance
- Program to interfaces, not implementations
- Strive for loosely couples designs between objects that interact
- Classes should be open for extension, but closed for modification
- Depend on abstractions. Do not depend on concrete classes

----------------

Chapter1: Strategy Pattern

- Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- Strategy lets the algorithm vary independently of clients that use it

Chapter2: Observer Pattern

- Defines a one-to-many dependency between objects so that when one object changes state,
  all it's dependents are notified and updated automatically

Chapter3: Decorator Pattern

- Attach additional responsibilities to an object dynamically.
- Decorators provide a flexible alternative to subclassing for extending functionality

Chapter4: Factory Pattern

- Simple Factory
    - While not a bona fide design pattern, is a simple way to decouple your clients from concrete classes
- Abstract Factory:
    - Provides an interface for creating families of related or dependent objects
      without specifying their concrete classes
- Factory Method:
    - Defines an interface for creating an object,
      but let subclasses decide which class to instantiate.
    - Lets a class defer instantiation to the subclass

Chapter5: Singleton Pattern

- Ensures that a class has only one instance, and provides a global point of access to it