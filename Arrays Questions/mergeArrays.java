// Adding two arrays in one
import java.util.*;
//////////////////////using loop///////////////////////////////
public class mergeArrays {
    public static void main(String[] args) {
        
int arr1[]={1,2,3};
int arr2[]={4,5,6};

int arr3[]=new int[arr1.length+arr2.length];

//adding first array in 3rd
for(int i =0;i<arr1.length;i++)
{

arr3[i]=arr1[i];

}
//adding 2nd array in 3rd
for(int i =0;i<arr2.length;i++)
{

arr3[arr1.length+i] = arr2[i];

}

//printing newly added array
for(int i = 0;i<arr3.length;i++)
{
    System.out.print(" "+arr3[i]);
}

System.out.println();
////////////////// using arraycopy method////////////////////////////////

int arr4[] = new int[arr1.length+arr2.length];

// copying from 1 to 4

System.arraycopy(arr1,0,arr4,0,arr1.length);


// copying from 2 to 4

System.arraycopy(arr2,0,arr4,arr1.length,arr2.length);


//printing using second method
for(int i = 0;i<arr4.length;i++)
{
    System.out.print(" "+arr4[i]);
}





    }
}

