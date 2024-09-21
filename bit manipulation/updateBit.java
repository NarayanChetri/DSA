public class updateBit 
{
    public static void main(String[] args) 
    {
        int n =5; //  0101
        int pos = 1;
        int bitmask = 1<<pos;
        int res =0;
        if((bitmask&n)==0)
        {
res = bitmask | n;
System.out.println(res);
        }
        else
        {
            res = ~(bitmask);
            res = res&n;
            System.out.println(res);
        }

    }
    
}
