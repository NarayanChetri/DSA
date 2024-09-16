//program to check if the two array is equals


import java.util.Arrays;

// using Arrays.equals

public class arrayEqual {
    public static void main(String[] args) {
        
        int arr1[]={11,22,33};
        int arr2[]={11,22,33};
        boolean result = Arrays.equals(arr1,arr2);
        System.out.println(result + " using first method ");


// using loop
boolean res = true;
if(arr1.length==arr2.length)
{

for(int i=0;i<arr1.length;i++)
{
    if(arr1[i]!=arr2[i])
    {
res = false;
    }
    else 
    {
        res = true;
    }
}
System.out.println(res + " using second method ");

}





    }
    
}

