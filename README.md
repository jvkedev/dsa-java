# DSA Solutions

A Java practice repository focused on pattern-based problem solving and core programming fundamentals.

This project helps build confidence with loops, nested iterations, conditional logic, spacing, and structured output while solving visual pattern exercises.

## Repository Structure

```text
DSA-Solutions/
├── README.md
├── patterns/
│   ├── AlphabetTriangle.java
│   ├── Butterfly.java
│   ├── FloydTriangle.java
│   ├── HollowDiamond.java
│   ├── HollowPyramid.java
│   ├── HollowRectangle.java
│   ├── HollowRightAngleTriangle.java
│   ├── HollowSquare.java
│   ├── HourGlass.java
│   ├── InvertedAlphabetTriangle.java
│   ├── InvertedRightAngleTriangle.java
│   ├── InvertedSolidPyramid.java
│   ├── NumberPyramid.java
│   ├── NumberTriangle.java
│   ├── PascalTriangle.java
│   ├── ReverseAlphabetRightAngleTriangle.java
│   ├── Rhombus.java
│   ├── SolidDiamond.java
│   ├── SolidPyramid.java
│   ├── SolidRectangle.java
│   ├── SolidRightAngleTriangle.java
│   ├── SolidSquare.java
│   ├── SymmetricAlphabetPyramidTriangle.java
│   └── ZigZag.java
└── .gitignore
```

## Pattern Collection

The repository includes a wide range of Java pattern programs such as:

- Alphabet patterns: `AlphabetTriangle`, `InvertedAlphabetTriangle`, `ReverseAlphabetRightAngleTriangle`, `SymmetricAlphabetPyramidTriangle`
- Number patterns: `FloydTriangle`, `NumberPyramid`, `NumberTriangle`, `PascalTriangle`
- Solid shapes: `SolidPyramid`, `SolidRectangle`, `SolidRightAngleTriangle`, `SolidSquare`, `SolidDiamond`
- Hollow shapes: `HollowPyramid`, `HollowRectangle`, `HollowRightAngleTriangle`, `HollowSquare`, `HollowDiamond`
- Special patterns: `Butterfly`, `HourGlass`, `Rhombus`, `ZigZag`, `InvertedSolidPyramid`

## Learning Focus

These exercises help practice:

- nested loops
- row and column logic
- spacing and alignment
- conditional branching inside loops
- pattern decomposition and step-by-step reasoning
- Java syntax and console output formatting

## How to Run

From the project root, compile and run any Java file:

```bash
javac patterns/AlphabetTriangle.java
java -cp patterns AlphabetTriangle
```

To run a different pattern, replace `AlphabetTriangle` with the class name from the `patterns` folder.

You can also compile all files in the folder with:

```bash
for file in patterns/*.java; do
  javac "$file"
done
```

## Purpose

This repository is currently focused on pattern-based Java practice and is intended to support beginner-to-intermediate understanding of loops, logic building, and structured problem solving in DSA.

## Language

Java
