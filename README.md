# java-generics

***This project provides some examples of how to use generics*** 
<p align="justify">
Generics enable classes and interfaces as a types, to be parameters when defining classes, interfaces and methods that  
provides a way to re-use the same code with different inputs. The difference is that the inputs to formal parameters are 
values, while the inputs to type parameters are types.
</p>
Code that uses generics has many benefits over non-generic code:

* Stronger type checks at compile time. A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety. 
    Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.  

* Elimination of casts. The following code snippet without generics requires casting:  
  
  >List list = new ArrayList();  
  list.add("hello");  
  String s = (String) list.get(0);
  
  When re-written to use generics, the code does not require casting:  
  >List<String> list = new ArrayList<String>();  
  list.add("hello");  
  String s = list.get(0);   // no cast

* Enabling programmers to implement generic algorithms.
    By using generics, programmers can implement generic algorithms that work on collections of different types, can be 
    customized, and are type safe and easier to read.



