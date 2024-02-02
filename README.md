# GUICE Tutorial

Topics Covers in this tutorial

How to DI (@Inject) a single implementation of an Interface ino another Class

Via:
1. Explicit bind in Guice module
2. @ImplementedBy
3. Both 1 and 2 Together 

How do to inject different implementations based on conditional logic?

How to use a Guice @Provider 

- Guice gives you free Providers!
- Your own Provider implementations
- @Provides
- @ProvidedBy


How to I make the Provider know about the existing implementations?
- Will cover MapBinder

How can I inject dependencies into the Provider?
- covers @Inject into Providers

How can I inject runtime data into Provider in order to choose impl. at runtime (i.e: user action)?
- covers AssistedInject (@Assisted)
  
How to use a Guice @Provider 2 

- Injecting into providers (Example: Inject a Random Implementation)
  - Java built in class
  - Guice MapBinder
- Injecting runtime data into Providers
  - Rolling your own Factory

How to use a Guice @Assist (AKA: Assisted Inject)

- Addresses what problem?
-  other options 
  - mutable object
  - build pattern
  - Write you own Factory

Advice on when to justify using Assisted Inject?
