Tutorials and exercises of the book Head First Design Patterns.

----------------
Principles:

- Encapsulate what varies
- Favor composition over inheritance
- Program to interfaces, not implementations
- Strive for loosely couples designs between objects that interact
- Classes should be open for extension, but closed for modification
- Depend on abstractions. Do not depend on concrete classes
- Least Knowledge / Law of Demeter:
    - talk only to your immediate friends
- Don't call us, we'll call you
- Single Responsibility Principle:
    - a class should have only one reason to change

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

Chapter6: Command Pattern

- Encapsulates a request as an object, thereby letting you parameterize other objects
  with different requests, queue or log requests, and support undoable operations
- decouples an object making a request from the one that knows how to perform it
- A Command is at the center of this decoupling and encapsulates a receiver with an action (or set of actions)
- an invoker makes a request of a Command object by calling its execute() method, which invokes these actions on the
  receiver
- Invokers can be parameterized with Commands, even dynamically at runtime
- Macro commands are a simple extension of the Command Pattern that allow multiple commands to be invoked
- "in practice", it's not uncommon for "smart" objects to implement the request themselves, rather than delegating to a
  receiver
- Commands may also be used to implement logging and transactional systems

Chapter7:

- Adapter Pattern
    - Converts the interface of a class into another interface the client expects.
    - Adapter lets classes work together that couldn't otherwise, because of incompatible interfaces

- Facade Pattern
    - Provides a unified interface to a set of interfaces in a subsystem.
    - Facade defines a higher level interface that makes the subsystem easier to use

Chapter8: Template Method

- define the skeleton of an algorithm in an operation, deferring some steps to subclass.
- lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure
- defines the steps of an algorithm and allows subclasses to provide the implementation for one or more steps
- gives us an important technique for code reuse
- the template's abstract class may define concrete methods, abstract methods and hooks
- hooks are methods that do nothing or default behavior in the abstract class, but may be overridden in the subclasses
- to prevent subclasses from changing the algorithm in the template method, declare the template method final
- the Hollywood Principle guides us to put decision-making in high-level modules that can decide how and when to call
  low level modules
- factory method is a specialization of template mthod

Chapter9: Iterator Pattern

- provides a way to access the elements of an aggregate object sequentially without exposing its underlying
  representation

Chapter9: Composite Pattern

- allows you to compose objects into tree structures to represent part-whole hierarchies.
- lets clients treat individual objects and compositions of objects uniformly
- using a composite structure, we can apply the same operations over both composites and individual objects. In other
  words, in mos cases, we can ignore the differences between compositions of objects and individual objects