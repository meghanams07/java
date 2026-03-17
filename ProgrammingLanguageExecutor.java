class ProgrammingLanguageExecutor {
    public static void main(String[] args) {
        System.out.println("=== TOP 20 PROGRAMMING LANGUAGES & THEIR SYNTAX ===\n");

        Syntax s1 = new Syntax(101, "Java", "int a = 10;", "for, while", "if, switch",
                             "public void method()", "class Example{}", "Example e = new Example();",
                             "int arr[]", "try-catch", "// or /* */", "Scanner",
                             "System.out.println", "package com.example;", "import java.util.*;",
                             "extends", "implements", "public", "{}", ";");

        Syntax s2 = new Syntax(102, "C", "int a = 10;", "for, while, do-while", "if, switch",
                             "int func() { }", "N/A", "N/A", "int arr[10];", "N/A",
                             "// or /* */", "scanf", "printf", "N/A", "#include <stdio.h>",
                             "N/A", "N/A", "return", "{}", ";");

        Syntax s3 = new Syntax(103, "C++", "int a = 10;", "for, while, do-while, range-for", "if, switch",
                             "int func() { }", "class Example { };", "Example e;",
                             "int arr[10];", "try-catch-throw", "// or /* */", "cin",
                             "cout", "namespace ns { }", "#include <iostream>",
                             ": public Base", "abstract via virtual", "virtual", "{}", ";");

        Syntax s4 = new Syntax(104, "Python", "a = 10", "for, while", "if, elif, else",
                             "def func():", "class Example:", "e = Example()",
                             "arr = [1, 2, 3]", "try-except-finally", "#", "input()",
                             "print()", "__init__.py", "import module", "class Child(Parent):",
                             "ABC via abc module", "def", "Indentation", "Newline");

        Syntax s5 = new Syntax(105, "JavaScript", "let a = 10;", "for, while, for-of", "if, switch",
                              "function func() {}", "class Example {}", "let e = new Example();",
                              "let arr = [];", "try-catch-finally", "// or /* */", "prompt() (browser)",
                              "console.log()", "npm modules", "import x from 'm';", "extends",
                              "N/A", "let", "{}", ";");

        Syntax s6 = new Syntax(106, "C#", "int a = 10;", "for, while, foreach", "if, switch",
                             "void Method() {}", "class Example {}", "Example e = new Example();",
                             "int[] arr = new int[5];", "try-catch-finally", "// or /* */",
                             "Console.ReadLine()", "Console.WriteLine()", "namespace NS {}",
                             "using System;", ": BaseClass", ": IInterface", "using", "{}", ";");

        Syntax s7 = new Syntax(107, "PHP", "$a = 10;", "for, while, foreach", "if, switch",
                             "function func() {}", "class Example {}", "$e = new Example();",
                             "$arr = [];", "try-catch-finally", "// or /* */", "From $_GET/$_POST",
                             "echo", "Composer packages", "use Namespace\\\\Class;", "extends",
                             "implements", "echo", "{}", ";");

        Syntax s8 = new Syntax(108, "Ruby", "a = 10", "for, while, each", "if, elsif, unless",
                            "def func; end", "class Example; end", "e = Example.new",
                            "arr = []", "begin-rescue-ensure", "#", "gets", "puts",
                            "gems", "require 'lib'", "< Parent", "Mixins via modules", "end",
                            "do/end, {}", "Newline");

        Syntax s9 = new Syntax(109, "Kotlin", "var a = 10", "for, while", "if, when",
                             "fun func() {}", "class Example {}", "val e = Example()",
                             "val arr = arrayOf(1,2)", "try-catch-finally", "// or /* */",
                             "readLine()", "println()", "package com.example", "import pkg.Class",
                             ": Parent()", ": Interface", "fun", "{}", "; (optional)");

        Syntax s10 = new Syntax(110, "Swift", "var a = 10", "for-in, while", "if, switch",
                              "func funcName() {}", "class Example {}", "let e = Example()",
                              "var arr: [Int] = []", "do-try-catch", "// or /* */",
                              "readLine()", "print()", "Swift Package Manager", "import Module",
                              ": ParentClass", "protocol", "let", "{}", "");

        Syntax s11 = new Syntax(111, "Go", "var a int = 10", "for", "if, switch",
                              "func f() {}", "struct types", "var x T", "var arr [10]int",
                              "error return", "// or /* */", "fmt.Scan", "fmt.Println",
                              "package main", "import \"fmt\"", "composition", "interface{}",
                              "defer", "{}", "; (optional)");

        Syntax s12 = new Syntax(112, "Rust", "let x: i32 = 10;", "for, while, loop", "if, match",
                               "fn func() {}", "struct / enum", "let e = Example {};",
                               "let arr = [1,2,3];", "Result, Option", "// or /* */",
                               "stdin().read_line", "println!()", "crate, module", "use std::io;",
                               "traits", "trait", "match", "{}", ";");

        Syntax s13 = new Syntax(113, "Scala", "val a = 10", "for, while", "if, match",
                              "def func() = {}", "class Example {}", "val e = new Example",
                              "val arr = Array(1,2)", "try-catch-finally", "// or /* */",
                              "StdIn.readLine()", "println()", "package example", "import scala.io._",
                              "extends", "trait", "val", "{}", "");

        Syntax s14 = new Syntax(114, "TypeScript", "let a: number = 10;", "for, while, for-of", "if, switch",
                               "function f(a: number): void {}", "class Example {}", "let e = new Example();",
                               "let arr: number[] = [];", "try-catch-finally", "// or /* */",
                               "prompt() (browser)", "console.log()", "npm modules", "import {X} from 'm';",
                               "extends", "interface", "interface", "{}", ";");

        Syntax s15 = new Syntax(115, "R", "a <- 10", "for, while, repeat", "if, else",
                              "func <- function() {}", "S3/S4 classes", "obj <- new(\"Class\")",
                              "v <- c(1,2,3)", "tryCatch()", "#", "readline()", "print()",
                              "library()", "library(pkg)", "S4 extends", "N/A", "function", "{}", "");

        Syntax s16 = new Syntax(116, "MATLAB", "a = 10;", "for, while", "if, switch",
                              "function y = f(x)", "classdef Example", "e = Example();",
                              "A = [1 2; 3 4];", "try-catch", "%", "input()", "disp()",
                              "+package folders", "import pkg.*", "< SuperClass", "abstract classes",
                              "end", "end blocks", "");

        Syntax s17 = new Syntax(117, "Perl", "my $a = 10;", "for, while, foreach", "if, unless, given",
                              "sub func { }", "packages, Moose", "my $o = Class->new();",
                              "my @arr = ();", "eval { }", "#", "<STDIN>", "print",
                              "package X;", "use Module;", "@ISA", "roles", "my", "{}", ";");

        Syntax s18 = new Syntax(118, "Shell Script", "a=10", "for, while, until", "if, case",
                              "func() { }", "N/A", "N/A", "arr=(1 2 3)", "exit codes",
                              "#", "read", "echo", "source files", ". file.sh", "N/A",
                              "N/A", "fi", "{}", "newline");

        Syntax s19 = new Syntax(119, "SQL", "DECLARE @a INT;", "Procedural (PL/SQL/T-SQL)", "CASE, IF (proc)",
                              "CREATE FUNCTION f()", "N/A", "N/A", "TABLE rows", "TRY-CATCH (T-SQL)",
                              "-- or /* */", "Client", "SELECT", "Schemas", "N/A", "N/A",
                              "N/A", "SELECT", "()", ";");

        Syntax s20 = new Syntax(120, "HTML", "N/A", "N/A", "N/A", "N/A", "class=\"...\" (attribute)",
                              "N/A", "N/A", "N/A", "<!-- comment -->", "<input>",
                              "Rendered in browser", "<head>, <body>", "<script src='...'>",
                              "N/A", "N/A", "<div>", "<>", "Tag close");

        ProgrammingLanguage p1 = new ProgrammingLanguage(1, "Java", "James Gosling", 1995, "Object Oriented", "OOP",
                                                       "Strong", "JVM", "Javac", ".java", "Programming", "High",
                                                       "Oracle", "Java 17", "Blue", "Software Development",
                                                       "Oracle Docs", "oracle.com", "Active", "Computer Science", s1);

        ProgrammingLanguage p2 = new ProgrammingLanguage(2, "C", "Dennis Ritchie", 1972, "Procedural", "Procedural",
                                                       "Static", "Compiled", "GCC", ".c", "Programming", "High",
                                                       "Bell Labs", "C18", "Dark Blue", "System Programming",
                                                       "ISO C Standard", "iso.org", "Active", "Computer Science", s2);

        ProgrammingLanguage p3 = new ProgrammingLanguage(3, "C++", "Bjarne Stroustrup", 1985, "Object Oriented", "OOP, Generic",
                                                       "Static", "Compiled", "G++", ".cpp", "Programming", "High",
                                                       "ISO", "C++20", "Purple", "System & App Dev",
                                                       "C++ Reference", "isocpp.org", "Active", "Computer Science", s3);

        ProgrammingLanguage p4 = new ProgrammingLanguage(4, "Python", "Guido van Rossum", 1991, "High Level", "Multi-paradigm",
                                                       "Dynamic", "Interpreter", "CPython", ".py", "Programming", "Very High",
                                                       "Python Software Foundation", "Python 3.12", "Yellow", "Scripting, ML, Web",
                                                       "Python Docs", "python.org", "Active", "Computer Science", s4);

        ProgrammingLanguage p5 = new ProgrammingLanguage(5, "JavaScript", "Brendan Eich", 1995, "Scripting", "Event-driven, Functional",
                                                       "Dynamic", "Browser/Node.js", "JIT", ".js", "Programming", "Very High",
                                                       "ECMA", "ES2023", "Yellow", "Web Development",
                                                       "MDN Docs", "developer.mozilla.org", "Active", "Computer Science", s5);

        ProgrammingLanguage p6 = new ProgrammingLanguage(6, "C#", "Anders Hejlsberg", 2000, "Object Oriented", "OOP",
                                                       "Static", ".NET CLR", "Roslyn", ".cs", "Programming", "High",
                                                       "Microsoft", "C# 12", "Violet", "Enterprise, Games",
                                                       "MSDN", "learn.microsoft.com", "Active", "Computer Science", s6);

        ProgrammingLanguage p7 = new ProgrammingLanguage(7, "PHP", "Rasmus Lerdorf", 1995, "Scripting", "Procedural, OOP",
                                                       "Dynamic", "Server-side", "Zend Engine", ".php", "Programming", "High",
                                                       "PHP Group", "PHP 8", "Purple", "Web Backend",
                                                       "PHP Manual", "php.net", "Active", "Computer Science", s7);

        ProgrammingLanguage p8 = new ProgrammingLanguage(8, "Ruby", "Yukihiro Matsumoto", 1995, "Scripting", "OOP",
                                                       "Dynamic", "Interpreter", "MRI", ".rb", "Programming", "Medium",
                                                       "Ruby Community", "Ruby 3.3", "Red", "Web (Rails)",
                                                       "Ruby Docs", "ruby-lang.org", "Active", "Computer Science", s8);

        ProgrammingLanguage p9 = new ProgrammingLanguage(9, "Kotlin", "JetBrains", 2011, "Object Oriented", "OOP, Functional",
                                                       "Static", "JVM/Android", "Kotlin Compiler", ".kt", "Programming", "High",
                                                       "JetBrains", "Kotlin 2.0", "Blue Purple", "Android, Backend",
                                                       "Kotlin Docs", "kotlinlang.org", "Active", "Computer Science", s9);

        ProgrammingLanguage p10 = new ProgrammingLanguage(10, "Swift", "Apple Inc", 2014, "Compiled", "OOP, Functional",
                                                        "Static", "iOS/macOS", "Swift Compiler", ".swift", "Programming", "High",
                                                        "Apple", "Swift 5.9", "Orange", "iOS Apps",
                                                        "Swift Docs", "swift.org", "Active", "Computer Science", s10);

        ProgrammingLanguage p11 = new ProgrammingLanguage(11, "Go", "Robert Griesemer", 2009, "Compiled", "Concurrent",
                                                        "Static", "Go Runtime", "Go Compiler", ".go", "Programming", "High",
                                                        "Google", "Go 1.22", "Cyan", "Backend, Cloud",
                                                        "Go Docs", "go.dev", "Active", "Computer Science", s11);

        ProgrammingLanguage p12 = new ProgrammingLanguage(12, "Rust", "Graydon Hoare", 2010, "Compiled", "Systems, Functional",
                                                        "Static", "LLVM", "rustc", ".rs", "Programming", "High",
                                                        "Mozilla", "Rust 1.75", "Brown", "Systems, WebAssembly",
                                                        "Rust Book", "rust-lang.org", "Active", "Computer Science", s12);

        ProgrammingLanguage p13 = new ProgrammingLanguage(13, "Scala", "Martin Odersky", 2004, "High Level", "Functional, OOP",
                                                        "Static", "JVM", "scalac", ".scala", "Programming", "Medium",
                                                        "Lightbend", "Scala 3", "Red", "Big Data, Backend",
                                                        "Scala Docs", "scala-lang.org", "Active", "Computer Science", s13);

        ProgrammingLanguage p14 = new ProgrammingLanguage(14, "TypeScript", "Microsoft", 2012, "Superset", "OOP, Functional",
                                                        "Static (optional)", "Browser/Node", "tsc", ".ts", "Programming", "High",
                                                        "Microsoft", "TS 5", "Blue", "Web Apps",
                                                        "TS Docs", "typescriptlang.org", "Active", "Computer Science", s14);

        ProgrammingLanguage p15 = new ProgrammingLanguage(15, "R", "Ross Ihaka", 1993, "Statistical", "Functional",
                                                        "Dynamic", "Interpreter", "R Engine", ".R", "Programming", "Medium",
                                                        "R Foundation", "R 4.3", "Light Blue", "Data Science",
                                                        "R Manuals", "r-project.org", "Active", "Statistics", s15);

        ProgrammingLanguage p16 = new ProgrammingLanguage(16, "MATLAB", "MathWorks", 1984, "Numeric", "Procedural",
                                                        "Dynamic", "MATLAB Runtime", "MATLAB Engine", ".m", "Programming", "High",
                                                        "MathWorks", "R2024a", "Orange Blue", "Numerical Computing",
                                                        "MATLAB Docs", "mathworks.com", "Active", "Engineering", s16);

        ProgrammingLanguage p17 = new ProgrammingLanguage(17, "Perl", "Larry Wall", 1987, "Scripting", "Multi-paradigm",
                                                        "Dynamic", "Interpreter", "Perl Engine", ".pl", "Programming", "Low",
                                                        "Perl Foundation", "Perl 5", "Camel", "Text Processing",
                                                        "perldoc", "perl.org", "Active", "Computer Science", s17);

        ProgrammingLanguage p18 = new ProgrammingLanguage(18, "Shell Script", "Various", 1979, "Scripting", "Procedural",
                                                        "Dynamic", "Unix Shell", "Shell Interpreter", ".sh", "Scripting", "High",
                                                        "GNU", "Bash 5", "Green", "Automation",
                                                        "man bash", "gnu.org", "Active", "System Admin", s18);

        ProgrammingLanguage p19 = new ProgrammingLanguage(19, "SQL", "IBM", 1974, "Query", "Declarative",
                                                        "Static", "DB Engines", "SQL Engine", ".sql", "Database", "Very High",
                                                        "ISO/IEC", "SQL:2016", "Teal", "Database Queries",
                                                        "DB Docs", "iso.org", "Active", "Databases", s19);

        ProgrammingLanguage p20 = new ProgrammingLanguage(20, "HTML", "Tim Berners-Lee", 1991, "Markup", "Declarative",
                                                        "N/A", "Browser", "HTML Parser", ".html", "Markup", "Very High",
                                                        "W3C", "HTML5", "Orange", "Web Pages",
                                                        "MDN/W3C", "w3.org", "Active", "Web", s20);


        p1.getProgrammingLanguageDetails();
        p2.getProgrammingLanguageDetails();
        p3.getProgrammingLanguageDetails();
        p4.getProgrammingLanguageDetails();
        p5.getProgrammingLanguageDetails();
        p6.getProgrammingLanguageDetails();
        p7.getProgrammingLanguageDetails();
        p8.getProgrammingLanguageDetails();
        p9.getProgrammingLanguageDetails();
        p10.getProgrammingLanguageDetails();
        p11.getProgrammingLanguageDetails();
        p12.getProgrammingLanguageDetails();
        p13.getProgrammingLanguageDetails();
        p14.getProgrammingLanguageDetails();
        p15.getProgrammingLanguageDetails();
        p16.getProgrammingLanguageDetails();
        p17.getProgrammingLanguageDetails();
        p18.getProgrammingLanguageDetails();
        p19.getProgrammingLanguageDetails();
        p20.getProgrammingLanguageDetails();

        System.out.println("\n=== END OF PROGRAMMING LANGUAGES ANALYSIS ===");
        System.out.println("Total Languages: 20 | Total Syntax Profiles: 20");
    }
}