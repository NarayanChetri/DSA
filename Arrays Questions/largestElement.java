/**
 * largestElement
 */
import java.util.Scanner;
import java.util.function.Function;
public class largestElement {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter total rows :");
int rows = sc.nextInt();
System.out.println("Enter total column :");
int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];

        // taking array
for(int i = 0;i<rows;i++)
{

    for(int j = 0;j<columns;j++)
    {
arr[i][j]=sc.nextInt();

    }

}

int max =Integer.MIN_VALUE;

for(int i = 0;i<rows;i++)
{

    for(int j = 0;j<columns;j++)
    {
if(arr[i][j]>max)
{
    max=arr[i][j];
}

    }

}

System.out.println("The largest number is  "+ max);

    }
}