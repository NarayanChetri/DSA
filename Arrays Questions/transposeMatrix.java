// finding the transpose of a matrix 
// Transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, the transpose of A[][] is obtained by changing A[i][j] to A[j][i]
import java.util.Scanner;
public class transposeMatrix {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("ENter rows number :");
int rows = sc.nextInt();

System.out.println("Enter columns number :");
int columns = sc.nextInt();

int arr1[][]=new int[rows][columns];

// taking input 
System.out.println("Enter matrix element :");

for(int i =0;i<rows;i++)
{
    for(int j=0;j<columns;j++)
    {
        arr1[i][j]=sc.nextInt();
    }
}

int arr2[][]= new int[columns][rows]; // dimension should be swapped


for(int i =0;i<columns;i++)
{
    for(int j=0;j<rows;j++)
    {
        arr2[i][j]=arr1[j][i];
    }
}
System.out.println("The transpose of the given matrix is :");
for(int i =0;i<rows;i++)
{
    for(int j=0;j<columns;j++)
    {  
        System.out.print(" " + arr2[i][j]);
    }
    System.out.println();
}





        
    }
    
}
