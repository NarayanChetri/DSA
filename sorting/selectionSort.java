import java.util.*;

class selectionSort 
{

// main function 

public static void main(String[] args) 
{

Scanner sc = new Scanner(System.in);

// taking array 

System.out.println("Enter array length");
int length = sc.nextInt();
int arr[]=new int[length];
System.out.println("Enter array elements ");
for(int i =0; i<arr.length;i++)
{
arr[i]=sc.nextInt();
}

// logic

for(int i=0;i<arr.length-1;i++)
{
    int minIndex = i;

    for(int j=i+1;j<arr.length;j++)
    {
        if (arr[j]<arr[i]) {
          minIndex=j;
       
        }
    }
    // swap 
    int temp = arr[minIndex];
arr[minIndex]=arr[i];
arr[i]=temp;
}

// print

for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]);
}
 
}}