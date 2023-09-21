package Arrays;

/**
 * TwoDArray
 */
public class TwoDArray {

    public static void main(String[] args) {
        int[][] twod = new int[3][3];
        twod[0][0] =1;
        twod[0][1] =2;
        twod[0][2] =3;
        twod[1][0] =4;
        twod[1][1] =5;
        twod[1][2] =6;
        twod[2][0] =7;
        twod[2][1] =8;
        twod[2][2] =9;

        for (int i=0; i< twod.length; i++) {
            for (int j=0; j<twod.length; j++) {
                System.out.println(twod[i][j]);
            }
            System.out.println();
        }


    }
}