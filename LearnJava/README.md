# 📘 LearnJava: A Java Learning Repository

Welcome to LearnJava, a structured repository for learning Java!

This project contains different Java lessons, organized by topics, to help students build their understanding step by step.

# 📂 Project Structure

This repository follows a standard Java project structure:

LearnJava/
│── src/ # Source code (contains all lesson packages)
│ ├── main/ # Main package (LessonRunner lives here)
│ ├── firstcup/ # Java Basics lessons
│ ├── threads/ # (Future) Threads and concurrency lessons
│ ├── ... # Additional topics as needed
│── bin/ # Compiled Java classes (generated by `javac`)
│── lib/ # External libraries (if needed)
│── README.md # Project documentation (You are Here)
│── .gitignore # Git ignore rules (e.g., ignoring `bin/`)

# 🛠️ Key Components

## src/ (Source Code)

This is where all Java source files (.java) live.
Each topic (e.g., firstcup, threads) is organized into its own package (which is just a folder).

## bin/ (Compiled Classes)

This folder stores compiled Java .class files (generated by javac).

Java source code (.java) is compiled using:
`javac -d bin src/firstcup/HelloWorld.java`

Once compiled, you can run the class from bin/:
`java -cp bin firstcup.HelloWorld`

## lib/ (Libraries - Optional)

If you use external libraries (like JUnit, Gson, or Apache Commons), JAR files go here.
Not used yet, but useful for advanced topics.

## LessonRunner.java (Optional)

A centralized launcher that allows students to select and run lessons from a menu.
Located in src/main/LessonRunner.java.
