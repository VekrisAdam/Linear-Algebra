public class MatrixOperations {


    //multiplicand * multiplicator = product
    public static double[][] multiply(double[][] multiplicand, double[][] multiplicator) {
        if (multiplicand[0].length  != multiplicator.length) {
            System.out.println("Error: dimension mismatch [multiplication]");
            return null;
        }

        double summationValue = 0;
        int summationIterator = multiplicand.length; //or multiplicator[0].length

        double[][] product = new double[multiplicand.length][multiplicator[0].length];
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++){
                for (int k = 0; k < summationIterator; k++) {
                    summationValue += multiplicand[i][k] * multiplicator[k][j];
                }
                product[i][j] = summationValue;
                summationValue = 0;
            }
        }
        return product;
    }

    public static void printMatrix(double[][] matrix){
        System.out.print("\n{");
        for(int i = 0; i < matrix.length; i++){
            System.out.print("{");
            for(int j = 0; j < matrix[0].length; j++){
                if (j == matrix[0].length - 1){
                    System.out.print(matrix[i][j]);
                }
                else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.print("}");
        }
        System.out.println("}");
    }

    
    public static double[][] add(double[][] addend1, double[][] addend2){
        if (addend1.length != addend2.length || addend1[0].length != addend2[0].length){
            System.out.println("error: dimension mismatch [addition]");
            return null;
        }

        double[][] sum = new double[addend1.length][addend2[0].length];

        for(int i = 0; i < addend1.length; i++){
            for(int j = 0; j < addend2[0].length; j++){
                sum[i][j] = addend1[i][j] + addend2[i][j];
            }
        }
        return sum;
    }
}
