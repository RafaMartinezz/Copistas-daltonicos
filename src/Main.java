import java.util.Scanner;

/**
 * Main class that simulates color changes in a 2D grid based on user input.
 * The program reads a grid (matrix) of characters representing colors and then
 * performs replacements to adjust the grid for color blindness.
 * Each replacement modifies a specific character (color) across the entire
 * grid.
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Read the initial number of rows and columns
        int filas = teclado.nextInt();
        int columnas = teclado.nextInt();
        teclado.nextLine(); // Consume the newline after the integer input

        // Continue processing while there are valid rows and columns
        while (filas != 0 && columnas != 0) {
            // Initialize a 2D character array (grid) with specified dimensions
            char[][] cuadro = new char[filas][columnas];

            // Populate the grid with character data, row by row
            for (int f = 0; f < filas; f++) {
                cuadro[f] = teclado.nextLine().toCharArray();
            }

            // Read the number of color replacements (for colorblind adjustments)
            int daltonicos = teclado.nextInt();

            // Perform the specified replacements
            char antes; // Character to be replaced
            char despues; // Replacement character
            for (int d = 0; d < daltonicos; d++) {
                antes = teclado.next().charAt(0);
                despues = teclado.next().charAt(0);

                // Iterate over each cell in the grid to replace colors
                for (int f = 0; f < filas; f++) {
                    for (int c = 0; c < columnas; c++) {
                        if (cuadro[f][c] == antes) {
                            cuadro[f][c] = despues; // Replace color if it matches `antes`
                        }
                    }
                }
            }

            // Print the modified grid
            for (int f = 0; f < filas; f++) {
                for (int c = 0; c < columnas; c++) {
                    System.out.print(cuadro[f][c]);
                }
                System.out.println();
            }

            // Read the next grid dimensions to repeat the process or end if 0 0
            filas = teclado.nextInt();
            columnas = teclado.nextInt();
            teclado.nextLine(); // Consume the newline
        }
        teclado.close(); // Close the scanner
    }
}
