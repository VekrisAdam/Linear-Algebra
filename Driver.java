public class Driver {
    public static void main(String[] args){
        double[][] test1 = {{1,2,3},{4,5,6},{7,8,9}};
        double[][] test2 = {{1},{2},{3}};

        MatrixOperations.printMatrix(MatrixOperations.multiply(test1, test2));

    }
}
