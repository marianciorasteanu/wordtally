## :abc: WordTally - Build Your Own wc Tool Coding Challenge
> https://codingchallenges.fyi/challenges/challenge-wc/

<br>

:arrow_forward: A wc tool replica made in Java 17 to print a newline, word, char
and byte counts for each input file and a total number of lines, words, bytes and chars if more than one FILE is specified. 
A word is a non-zero-length sequence of printable characters delimited by white space.

:arrow_forward: In case there is no file as input, the app will read from standard input. 
Since this is a linux/unix command, this standard input,
which is created by another tool and redirected with pipe (|),
will be read from the stdin file descriptor of the process id of wordtally
(/proc/PID-number/fd/0).

<br>

[![final-Small.png](https://i.postimg.cc/DfLpz7ky/final-Small.png)](https://moviesondemand.io)

### Concepts/technologies used:
1. [X] Object-Oriented Programming Principles;
2. [X] Collections Framework — Array, ArraysList and HashMap;
3. [X] Lambda functions, Streams and Method references along with serialization into a JSON;
4. [X] Design patterns from the GoF: Singleton and Builder along with Dependency Injection and Inversion of Control;
5. [X] Spring Boot with CommandLineRunner interface and Lombok, Jackson and Apache Commons CLI dependencies;
6. [X] GraalVM for conversion from .jar into a binary file;
7. [X] Logging and banner were disabled (spring.main.banner-mode=OFF, logging.level.root=WARN) on Spring Boot along with Tomcat Server (spring.main.web-application-type=NONE);
8. [X] Asynchronous with Concurrency processing implemented with CompletableStage/CompletableFuture API to handle multiple files as input much easier and faster;  
9. [X] IO and NIO libraries for input/output processing;

<br>

> [!NOTE]
> Challenge is :100: completed!

<br>

## :man_technologist: How To:

:white_check_mark: Where to find the .jar file and the binary file made with GraalVM.

[![Screenshot-from-2024-04-21-07-46-08.png](https://i.postimg.cc/PqRf6LtY/Screenshot-from-2024-04-21-07-46-08.png)](https://moviesondemand.io)

<br>

:white_check_mark: Use it with short options and files as input.

![](contentforreadmepage/WordTallyClassicOptions.gif)

<br>

:white_check_mark: Use it with short/long options with files or standard input.

![](contentforreadmepage/WordTallyWithLongOptions.gif)

<br>

:white_check_mark: What happens when proper input is not provided (wrong options, files, etc).

![](contentforreadmepage/WordTallyWithErrorsHelpAndRedirectToAnotherCommand.gif)
