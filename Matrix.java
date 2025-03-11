public class Matrix {
    /**
     * Multiplies two matrices and returns the result.
     * @param a First matrix (Double[][])
     * @param b Second matrix (Double[][])
     * @return The resulting matrix or a matrix containing null values if multiplication cannot be performed
     */
    public static Double[][] multiply(Double[][] a, Double[][] b) {
        // Check if matrices can be multiplied
        if (a == null || b == null || a.length == 0 || b.length == 0 || a[0].length != b.length) {
            Double[][] nullVal = {{null, null}};
            return nullVal;
        }
        
        int aRows = a.length;
        int aCols = a[0].length;
        int bCols = b[0].length;
        
        // Create result matrix
        Double[][] result = new Double[aRows][bCols];
        
        // Perform matrix multiplication
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                result[i][j] = 0.0;
                for (int k = 0; k < aCols; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        return result;
    }
}
