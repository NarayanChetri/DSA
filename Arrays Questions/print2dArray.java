import java.util.Scanner;

public class print2dArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows :");
        int rows = sc.nextInt();
        System.out.println("Enter total column :");
        int columns = sc.nextInt();
                int arr[][] = new int[rows][columns];
        
                // taking array input
        for(int i = 0;i<rows;i++)
        {
        
            for(int j = 0;j<columns;j++)
            {
        arr[i][j]=sc.nextInt();
        
            }
        
        }
        
        //printing array

        for(int i = 0;i<rows;i++)
        {
        
            for(int j = 0;j<columns;j++)
            {
System.out.print(arr[i][j]+" ");
        
            }
        System.out.println();
        }
        



    }
    
}
