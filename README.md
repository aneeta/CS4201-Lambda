# CS4201-Lambda
Practical 2 for CS4201 Programming Language Design and Implementation.

Lambda calculus reference interpreter for *Funl* functional programming language.

## How to run

Run the interpreter with:

```bash
java -jar CS4201-Lambda.jar <path to file>
```

For example:

```bash
java -jar CS4201-Lambda.jar Funl/examples/add.hs
```

will output:
```
((λx. λy. (x + y)) 2) 3
(λy. (2 + y)) 3
(2 + 3)
5
```

Alternatively, you can compile the source `java` files with ANTLR in your classpath and run `Translate.main`.

## Test programs
Test programs are included in `Funl/examples`.