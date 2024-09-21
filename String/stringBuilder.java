// various function of string builder 

public class stringBuilder 
{
        public static void main(String[] args) 
        {
              // declaration 
              StringBuilder sb = new StringBuilder("Narayan");

// char at index
System.out.println(sb.charAt(0));

// set char at index 0 
sb.setCharAt(0, 'H');
System.out.println(sb);

// insert 

sb.insert(0, 'A');
System.out.println(sb);

// delete 
sb.delete(0, 2); // goes from n to n-1 index

System.out.println(sb);

// append , insert at last
sb.append("a");
System.out.println(sb);

// reverse 
sb.reverse();
System.out.println(sb);


        }
}
