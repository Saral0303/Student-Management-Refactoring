# Student Management System - Code Refactoring

## Introduction

This project is a refactored version of the poorly written Java
Student Management source code provided for the code refactoring
assignment.

The main purpose of this project is to improve the readability,
maintainability, modularity, and overall design of the original code
without changing its main functionality.

## Original Code Issues

The original source code contained several design and coding problems:

- One large method was responsible for multiple tasks.
- The method name `doEverything()` was unclear.
- Student information was stored using a String array.
- Magic numbers were used for menu choices and grade calculation.
- Variable names were not descriptive.
- Broad exception handling was used.
- File handling and student management logic were mixed together.
- File resources were manually closed.
- The average score used integer division, which could lose decimal values.

## Refactoring Improvements

The code was improved by:

- Creating a separate `Student` class.
- Separating student operations into `StudentService`.
- Separating file operations into `StudentFileRepository`.
- Replacing unclear names with meaningful names.
- Replacing magic numbers with named constants.
- Using `double` for accurate average calculation.
- Using specific exception handling.
- Using try-with-resources for safe file handling.
- Dividing responsibilities into smaller and more manageable classes.

## Project Structure

```text
student-management-refactoring/
│
├── Main.java
├── Student.java
├── StudentService.java
├── StudentFileRepository.java
└── README.md
