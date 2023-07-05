import java.util.Scanner;

public class Rect {

    class Leer {

        public static int[][] matrix(int f, int c) {
            int[][] matrix = new int[f][c];
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = ((i > 0 && i < f - 1) && (j > 0 && j < c - 1)) ? 0 : 1;
                    /*
                     * if ((i > 0 && i < f - 1) && (j > 0 && j < c - 1)) {
                     * matrix[i][j] = 0;
                     * } else {
                     * matrix[i][j] = 1;
                     * }
                     */
                }
            }
            return matrix;
        }
    }

    class Imprimir {

        public static void matrix(int[][] mat, int f, int c) {
            int[][] matx = mat;
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    String sal = (mat[i][j] == 0) ? " " : "*";
                    System.out.print(sal);
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String args[]) {
        int f, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas: ");
        f = sc.nextInt();
        System.out.print("Número de columnas: ");
        c = sc.nextInt();

        int[][] matrix = Leer.matrix(f, c);
        Imprimir.matrix(matrix, f, c);

    }
}