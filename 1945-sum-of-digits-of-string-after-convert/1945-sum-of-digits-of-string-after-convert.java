class Solution 
{
    public int getLucky(String s, int k) 
    {
        int sum = 0;

        for(char c : s.toCharArray())
        {
            int temp =  c-96;
            sum += temp %10; // gets first digit
            temp /= 10;
            sum += temp; // gets second digit
        }
        k--; // first transistion takes place

        while(k>0)
        {
            int temp = sum;
            sum=0;
            while(temp!=0)
            {
                sum += temp%10;
                temp /= 10; // get final number and sum
            }
            k--; /// second transistion takes place
        }
        return sum;
    }
}