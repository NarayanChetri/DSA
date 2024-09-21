// always set bit to 1 in the given position

public class setBit {
    public static void main(String[] args) {
         
        int n=5; // 0101
        int pos = 1; // targeting 0
        int bitmask = 1<<pos;
       int newNum = bitmask | n; // the new number will become 0111 which is 7 in decimals
       System.out.println(newNum);
    }
    
}
