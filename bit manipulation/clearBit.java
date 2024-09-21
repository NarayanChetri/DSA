// always set bit to 1 in the given position

public class clearBit {
    public static void main(String[] args) {
        int n = 5 ; // 0101
        int pos = 2;
        int bitmask = 1<<pos;
 int newNum = ~(bitmask); // finding not first 
 newNum = newNum & n; // and doing and with n 
 System.out.println(newNum);
    }
    
}
