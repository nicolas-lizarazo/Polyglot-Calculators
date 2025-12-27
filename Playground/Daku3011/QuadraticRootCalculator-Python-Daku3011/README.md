# Quadratic Root Calculator

A simple Python program that calculates the roots of a quadratic equation using the quadratic formula.

## Description

This calculator solves quadratic equations of the form **ax² + bx + c = 0** and determines the nature and values of the roots based on the discriminant (b² - 4ac).

## Features

- ✅ Calculates real roots for quadratic equations
- ✅ Handles three cases:
  - Two distinct real roots (discriminant > 0)
  - One repeated real root (discriminant = 0)
  - No real roots (discriminant < 0)
- ✅ Input validation (checks if coefficient 'a' is zero)
- ✅ Interactive command-line interface

## Requirements

- Python 3.x
- No external libraries required (uses built-in `math` module)

## Usage

1. Run the program:
   ```bash
   python main.py
   ```

2. Enter the coefficients when prompted:
   - Coefficient a (must not be zero)
   - Coefficient b
   - Coefficient c

3. View the calculated roots

## Examples

### Example 1: Two Real Roots
```
Enter coefficient a: 1
Enter coefficient b: -5
Enter coefficient c: 6
Two real roots: x1 = 3.0, x2 = 2.0
```

### Example 2: One Real Root
```
Enter coefficient a: 1
Enter coefficient b: -4
Enter coefficient c: 4
One real root: x = 2.0
```

### Example 3: No Real Roots
```
Enter coefficient a: 1
Enter coefficient b: 2
Enter coefficient c: 5
No real roots exist.
```

### Example 4: Invalid Input
```
Enter coefficient a: 0
Enter coefficient b: 2
Enter coefficient c: 3
Error: 'a' must not be zero.
```

## Mathematical Formula

The program uses the quadratic formula:

x = (-b ± √(b² - 4ac)) / (2a)

Where the discriminant Δ = b² - 4ac determines:
- Δ > 0: Two distinct real roots
- Δ = 0: One repeated real root
- Δ < 0: No real roots (complex roots)

## Author

Daku3011

## License

This project is part of the Polyglot Calculators contribution repository.
