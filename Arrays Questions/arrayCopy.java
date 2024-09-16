// copy one array to another 

//importing for 2nd method 
import java.util.Arrays;

// 1st method using loop


public class arrayCopy {
    public static void main(String[] args) {
        int arr1[]={10,20,30};
        int arr2[]= new int[arr1.length];
        for(int i =0;i<arr1.length;i++)
        {

arr2[i]=arr1[i];

        }
        // printing
        System.out.println("Elements of array using loop:");
        for(int i = 0;i<arr2.length;i++)
        {
         
            System.out.println(arr2[i]);
        }

// 2nd method // using java.util.Arrays method

int arr3[]=Arrays.copyOf(arr1,arr1.length);

   // printing
   System.out.println("Elements of array using Arrays.copyOf method:");
   for(int i = 0;i<arr3.length;i++)
   {
    
       System.out.println(arr3[i]);
   }

   // using clone method

  int arr4[]=arr1.clone();

System.out.println("Elements of array using clone method:");
   for(int i = 0;i<arr4.length;i++)
   {
    
       System.out.println(arr4[i]);
   }




    }
}

