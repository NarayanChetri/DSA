class getBit {

public static void main(String[] args) 
{
     int number = 5;   // 5 in binary is 0101
     int position = 2; // we calculate position from right starting from 0 index
     int bitmask = 1<<position;
     if ((bitmask&number)==0) {
        System.out.println("bit was 0");
     }
     else 
     {
        System.out.println("bit was 1");
     }
}


}