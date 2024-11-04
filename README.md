# Color Adjustment in Grids

This Java project simulates color adjustments in a 2D grid based on user input. The grid is represented by a matrix of characters, where each character signifies a color. The program performs specific color replacements to adjust the grid for color blindness or other viewing preferences. This is accomplished by transforming specified characters within the grid, based on user-defined replacements.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Class Structure](#class-structure)
- [Input Format](#input-format)
- [Example Input and Output](#example-input-and-output)
- [Explanation](#explanation)

---

## Overview

The program reads a grid of characters and a set of color replacement instructions from the user. Each replacement modifies a specific character (color) across the grid. After all replacements are applied, the adjusted grid is printed. The program continues processing grids until an input of `0 0` is received, signaling the end.

## Purpose

This project serves as a **learning exercise** in:
- Handling **2D arrays** to represent and manipulate grid-based data.
- Applying **nested loops** for cell-by-cell transformations across a matrix.
- Managing **user input** to control dynamic modifications in the grid.

## Features

- **Grid Representation**: Stores and manipulates grid data using a 2D character array.
- **Color Adjustment**: Allows user-defined character replacements, simulating color transformations.
- **Continuous Processing**: Handles multiple grids sequentially, processing each until `0 0` is entered.

## Class Structure

- **`Main`**: Contains the entire program logic, reading grid dimensions and color replacements, applying transformations, and printing the modified grid.

## Input Format

1. **Grid Dimensions**: The program begins by reading two integers representing the number of rows and columns.
2. **Grid Data**: Each row of the grid is entered as a string, with one character per cell.
3. **Replacement Instructions**: The number of replacements is entered, followed by pairs of characters:
   - The first character is the color to be replaced.
   - The second character is the replacement color.
4. **End Signal**: An input of `0 0` for grid dimensions signals the end of the program.

### Example

```plaintext
Input:
3 3
RGB
GRB
BRG
2
R G
B R
0 0

Output:
GGG
GRG
RGG
```

## Example Input and Output

### Input

```plaintext
2 3
RBG
RGB
1
R G
0 0
```

### Output

```plaintext
GBG
GGB
```

### Explanation

- The grid has 2 rows and 3 columns.
- The character `R` is replaced with `G` across the grid.
- The modified grid reflects this transformation in all instances of `R`.

## Explanation

The program processes each grid by:
1. **Building** the grid from user input.
2. **Applying** specified color replacements to match each character change.
3. **Printing** the modified grid after all transformations are complete.