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
  words, in most cases, we can ignore the differences between compositions of objects and individual objects.
- to be used when you have collections of objects with whole-part relationships and you want to be able to treat them
  uniformly
- there are many design tradeoffs in implementing Composite. You need to balance transparency and safety with your
  needs.

Chapter10: State Pattern

- allows an object to alter its behavior when its internal state changes.
  The object will appear to change its class.
- by encapsulating each state into a class, we localize any changes that will need to be made
- using the State Pattern will typically result in a greater number of classes in your design

Chapter11: Proxy Pattern

- Provides a surrogate or placeholder for another object to control access to it
- Proxies control and manage access
- Remote Proxy manages interactions between a client and a remote object
- Virtual Proxy controls access to an object that is expensive to instantiate
- Protection Proxy controls access to the methods of an object based on the called
- There are several other proxy patterns, like catching, synchronization, firewall, copy-on-write proxies, etc
- like any wrapper, proxies will increase the number of classes and objects in your designs

Chapter12: Compound Patterns

- A compound pattern combines two or more patterns into a solution that solves a recurring or general problem
- The Modal View Controller (MVC) Pattern is a compound pattern consisting of the Observer, Strategy and Composite
  Patterns
- The model makes use of the Observer pattern so that it can keep observers updated, yet stay decoupled from them
- The controller is the Strategy for the view. - The view can use different implementations of the controller to get
  different behavior
- The view uses the Composite Pattern to implement the user interface
- These patterns work together to decuple the three players in the MVC model, which keeps designs clear and flexible
- MVC has been adapted to the WEB

Bridge Pattern:

- decouples an implementation so that it is not bound permanently to an interface
- abstraction and implementation can be extended independently
- changes to the concrete abstraction classes don't affect the client
- used to vary not only implementations, but also abstractions
- useful in graphics and windowing systems that need to run over multiple platforms
- increases complexity

Builder Pattern:

- use the Builder Pattern to encapsulate the construction of a product and allow it to be constructed in steps
- encapsulates the way a complex object is constructed
- hides the internal representation of the product from the client
- often used for building composite structures
- constructing objects requires more domain knowledge of the client that when using a Factory

Chain of Responsibility Pattern:

- when you want to give more than one object a chance to handle a request
- decouples the sender of the request and its receivers
- simplifies your object because it doesn't have to know the chain's structure and keep direct references to its members
- allows you to add or remove responsibilities dynamically, by changing the members or order of the chain
- commonly used in Windows systems to handle events like mouse clicks and keyboard events
- execution of the request isn't guaranteed; it may fall off the end of the chain if no object handles it
  (this can be an advantage or disadvantage)
- can be hard to observe and debug at runtime

Flyweight Pattern:

- when one instance of a class can be used to provide many virtual instances
- reduces the number of object instances at runtime, saving memory
- centralizes state for many virtual objects into a single location
- its used when a class had many instances, and they all can be controller identically
- a drawback is that, once its implemented, single instances of the class will not be able to behave independently of
  other instances

Interpreter Pattern

- used to build an interpreter for a simple language (if complex, its better a parser / compiler generator)
- when simplicity is more important than efficiency
- representing each grammar rule in a class makes the language easy to implement
- because the grammar is represented by classes, can easily be changed or extended
- by adding methods to the class structure, you can add new behaviors beyond interpretation, like pretty printing and
  more sophisticated program validation

Mediator Pattern

- use it to centralize complex communications and control between related objects
- increases the re-usability of the objects supported by the Mediator by decoupling them from the system
- simplifies maintenance of the system by centralizing control logic
- simplifies and reduces the variety of messages sent between objects in the system
- commonly used to coordinate related GUI components
- a drawback is that without proper design, the Mediator itself can become overly complex

Memento Pattern

- when you need to be able to return an object to one of its previous states
- used to save state
- drawback is that saving and restoring state can be time-consuming
- in Java systems, consider using Serialization to save a system's state
- keeping the saved state external from the key object helps to maintain cohesion
- keeps the key object's data encapsulated
- provides easy-to-implement recovery capabilities

Prototype Pattern

- use it when creating an instance of a given class is either expensive or complicated
- should be considered when a system must create new objects of many types in a complex class hierarchy
- a drawback is that making a copy of an object can sometimes be complicated
- hides the complexities of making new instances from the client
- in some circumstances, copying an object can be more efficient than creating a new object

Visitor Pattern

- when you want to add capabilities to a composite of objects and encapsulation is not important
- allows you to add operations to a Composite structure without changing the structure itself
- adding new operations is easy
- the code for operations performed by the Visitor is centralized
- As drawback, the Composite classes encapsulation is broken when the Visitor is used
- Another drawback is that changes to the composite structure are more difficult, because the traversal function is
  involved