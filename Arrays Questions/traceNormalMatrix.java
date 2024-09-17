
// Java Program to Find the Normal and Trace of a Matrix
import java.util.*;

class traceNormalMatrix {

    public static void main(String[] args) {

        int normal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row and column :");
        int num = sc.nextInt();
        int matrix[][] = new int[num][num];
        System.out.println("Enter element of a square matrix :");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Normal of the given matrix is : " + normal(matrix, num));
        System.out.println("Trace of the given matrix is : " + trace(matrix, num));

    }

    public static int normal(int matrix[][], int num) {
        int res = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                res += matrix[i][j] * matrix[i][j];
            }
        }
        return (int) Math.sqrt(res);
    }

    public static int trace(int matrix [][],int num)
    {
int sum=0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) 
            {
               if(i==j)
               {
sum+=matrix[i][j];
               }
            }
        }
        return sum;
    }

}