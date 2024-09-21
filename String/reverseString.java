// reverse using string builder 

public class reverseString {
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Narayan");
        sb.reverse();
        System.out.println(sb);


// reverse using string 

        String original = "Hello World";
        String reversed = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversed);

    }

    
    
    
}
