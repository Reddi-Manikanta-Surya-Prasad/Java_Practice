A variable is a name given to a memory location. It is the basic unit of storage in a program.

The value stored in a variable can be changed during program execution.
A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
In Java, all the variables must be declared before use.

We can decalre the variable name as follows:

example: int cost = 20;
here  int --> data type
      cost --> varaible name
      20  --> value of the variable

      int cost  --> declaration of a variable
      int cost = 20;  --> declaration and initialisation of a variable

Data Type:       Type of data that can be stored in this variable.
Variable Name:   Name given to the variable.
Value:           It is the initial value stored in the variable.

Examples:
 
//Declaring float variable
float simpleInterest;
//Declaring and Initializing integer variable 
int time = 10, speed = 20; 
// Declaring and Initializing character variable
char var = 'h'; 

Types of variables
 

There are three types of variables in Java:

Local Variables
Instance Variables
Static Variables

Let us now learn about each one of these variables in detail.
 

Local Variables: 
A variable defined within a block or method or constructor is called a local variable.
These variables are created when the block is entered or the function is called and destroyed after exiting from the block or when the call returns from the function.
The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variables only within that block.
The initialization of local variables is mandatory.

Instance Variables: 
Instance variables are non-static variables declared in a class outside any method, constructor, or block.
As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.
Initialisation of the Instance Variable is not mandatory. They are initialized to default values by constructors.
Instance Variable can be accessed only by creating objects, outside the class in which they are declared.

Static Variables: 
Static variables are also known as Class variables.
These variables are declared similarly to instance variables, the difference is that static variables are declared using the static keyword within a class outside any method, constructor, or block.
Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
Static variables are created at the start of the program execution and are destroyed automatically when the execution ends.
Initialisation of Static Variable is not mandatory. They are initialized to default values.

If we access the static variable like the Instance variable (through an object), the compiler will show the warning message and it won't halt the program. The compiler will replace the object name with the class name automatically.
If we access the static variable without class name, the compiler will automatically append the class name.

 

Instance variable Vs Static variable

Each object will have its own copy of the instance variable whereas We can only have one copy of a static variable per class irrespective of how many objects we create.
Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of the instance variable. In the case of static variables, changes will be reflected in other objects as static variables are common to all objects of a class.
We can access instance variables through object references and Static Variables can be accessed directly using the class name.
The syntax for static and instance variables:

class Example
    {
        static int a; //static variable
        int b;        //instance variable
    }

    