import java.util.*;

public class basicString {
    public static void main(String[] args) {
        // declare 

   String name = "Narayan";

// string methods 

// to find string length  we use VarName.length();
System.out.println(name.length());

// character at index i

for(int i=0;i<name.length();i++)
{
    System.out.println(name.charAt(i));
}

// compare strings

String name1="narayan";
String name2="narayan2";

// dont use name1==name2 cuz it is not accurated and may not pass all test case

if(name1.compareTo(name2)==0)
{
    System.out.println("Equal");

}
else
{
    System.out.println("not equal");
}

// substring

// string.substring(begin index, endIndex)

String sentence ="i am a coder";
String subString = sentence.substring(8,sentence.length());
System.out.println(subString);





 


    }
    
}
