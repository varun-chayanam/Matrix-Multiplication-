public class MatrixRunner {
    public static void main(String[] args) {
        // Define the first matrix
        Double[][] m1 = {
            {1.0, 2.0, 3.0, 5.0},
            {4.0, 5.0, 6.0, 7.0},
            {7.0, 8.0, 9.0, 9.0}
        };
        
        // Define the second matrix
        Double[][] m2 = {
            {1.0, 2.0, 3.0, 4.0, 5.0},
            {4.0, 5.0, 6.0, 7.0, 8.0},
            {7.0, 8.0, 9.0, 10.0, 11.0},
            {10.0, 11.0, 12.0, 13.0, 14.0}
        };
        
        // Multiply matrices
        Double[][] m3 = Matrix.multiply(m1, m2);
        
        // Print the result
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                sb.append(String.format("%5s", m3[i][j]) + " ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}
