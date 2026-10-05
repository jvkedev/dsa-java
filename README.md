# DSA Java Practice

A Java repository for practicing core Data Structures and Algorithms concepts along with pattern-based problem solving.

This project is designed to help build confidence in Java fundamentals, loops, conditional logic, math operations, and structured thinking through small problem-solving exercises.

## Repository Structure

```text
DSA-Java/
├── README.md
├── methods/
│   ├── CountFactors.java
│   ├── DigitSumCalculator.java
│   ├── EvenOrOddChecker.java
│   ├── GCDCalculator.java
│   ├── PowerFunction.java
│   ├── PrimeChecker.java
│   └── ReverseNumber.java
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

## Included Topics

### Methods

The `methods` folder contains utilities and algorithmic exercises such as:

- `PrimeChecker.java`
- `GCDCalculator.java`
- `ReverseNumber.java`
- `CountFactors.java`
- `EvenOrOddChecker.java`
- `DigitSumCalculator.java`
- `PowerFunction.java`

These programs focus on logic building, arithmetic, loops, conditionals, and beginner-friendly algorithmic thinking.

### Patterns

The `patterns` folder contains visual Java pattern programs such as:

- Alphabet patterns: `AlphabetTriangle`, `InvertedAlphabetTriangle`, `ReverseAlphabetRightAngleTriangle`
- Number patterns: `FloydTriangle`, `NumberTriangle`, `PascalTriangle`
- Solid shapes: `SolidRectangle`, `SolidSquare`, `SolidPyramid`, `SolidDiamond`
- Hollow shapes: `HollowRectangle`, `HollowSquare`, `HollowPyramid`, `HollowDiamond`
- Special patterns: `Butterfly`, `HourGlass`, `Rhombus`, `ZigZag`

## Learning Focus

This repository helps practice:

- Java syntax and class structure
- loops and nested loops
- arithmetic logic and mathematical operations
- conditionals and branching
- pattern decomposition
- problem-solving through small, focused exercises

## How to Run

From the project root, compile and run a program:

```bash
javac methods/PrimeChecker.java
java -cp methods PrimeChecker
```

Example for a pattern:

```bash
javac patterns/SolidRectangle.java
java -cp patterns SolidRectangle
```

To compile multiple Java files at once:

```bash
find methods patterns -name "*.java" -print0 | xargs -0 javac
```

## Purpose

This repository is intended for Java practice and beginner-to-intermediate DSA learning, with a mix of numerical logic problems and visual pattern exercises.

## Language

Java
