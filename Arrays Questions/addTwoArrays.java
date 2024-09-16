// adding two arrays and storing the result in one array

public class addTwoArrays {
    public static void main(String[] args) {
        
// using loops 

int rows =2,columns=3;

int arr1[][] = {
    {10,20,30},
    {11,22,33} };

    int arr2[][] = {
        {15,25,35},
        {11,22,33} };

int arr3 [][]=new int[rows][columns];

for(int i =0;i<rows;i++)
{
    for(int j =0; j<columns;j++)
    {
          arr3[i][j]=arr1[i][j]+arr2[i][j];
    }
   
}

for(int i =0;i<rows;i++)
{
    for(int j=0;j<columns;j++)
    {
        System.out.print(" "+arr3[i][j]);
    }
    System.out.println();
}



/////////////// second method ///////////////



    }
}
