# 🧵 Introduction to Threads in Java

# What is a Thread?

A thread is a small, independent unit of execution inside a program.

In Java, every program has at least one thread, called the main thread, which runs your main() method.

# Why Use Threads?

Threads are useful when you want to do multiple things at the same time. Some examples:

    📶 Downloading a file while still interacting with a program.
    🎮 Running a game loop while handling player input.
    📡 Handling multiple users on a website (like Google serving many search requests at once).
    🎵 Playing music while loading the next song in the background.

Without threads, a program does one thing at a time and has to wait before moving to the next task.

NOTE!: Using to many threads can slow a program down.

# 🛠️ Creating Threads in Java

There are two main ways to create a thread in Java:

## 1. Extending the Thread Class

This is the easiest way to create a thread. You create a class that inherits (extends) the Thread class and override the run() method.

-> See ThreadExample

## 2. Implementing the Runnable Interface

Another way to create a thread is by implementing Runnable, which is useful when your class needs to extend something else.

-> See Runnable Example

Key Points:

Runnable is more flexible because your class can extend another class.
The thread is started using new Thread(runnableInstance).start().

# Understanding Thread Safety (Synchronization)

Sometimes, multiple threads need to share a resource (like a bank account). If they change it at the same time, problems can happen.

-> See ThreadSyncExample

## Example of a Race Condition:

# Summary

Threads allow programs to run multiple tasks at once.
You can create threads using Thread (extends) or Runnable (implements).
Threads need synchronization (synchronized) to avoid conflicts when sharing resources.
Use threads when working with background tasks, animations, downloads, and multi-user applications.

# What Now?

- Try modifying the examples to add more threads.
- Experiment with Thread.sleep() to see how timing affects execution.
- Learn about ExecutorService for advanced thread management.
