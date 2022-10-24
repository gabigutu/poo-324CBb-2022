import java.util.Scanner;
//import java.lang.String;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String test;

        int[] myVector = new int[10];
        myVector[0] = 2;
        myVector[1] = 4;

        for (int i = 0; i < myVector.length; i++) {
//            System.out.print(myVector[i] + ' ');
            System.out.print(myVector[i] + " ");
        }
        System.out.println();

        String[] vectorStr, vectorStr2;
        String vectorStr3[], vectorStr4;
//        vectorStr4 = new String[10]; // not array
        vectorStr2 = new String[10];

        Scanner scanner = new Scanner(System.in);
        float[][] mat = new float[3][5];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (float) Math.random();
//                System.out.print("mat[" + i + "][" + j + "]= ");
//                mat[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("Mat (initially) = ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        float[][] mat2 = mat.clone(); // change this
        mat2[0][0] = -1;

        System.out.println("Mat (after modify) = ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(mat[0][0] + " " + mat2[0][0]);
    }

    /**
     * Returns whether the parameter is true or false
     *
     * @param truth True or false
     * @return The same as the paramter
     */
    public static boolean isItTrue(boolean truth) {
        return truth;
    }
}
