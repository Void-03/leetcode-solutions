class Solution 
{

    public boolean isHappy(int n) 
    {
        while(n > 9)
        {
            int squared = 0;
            while(n != 0)
            {   
                int temp = n%10;
                n /= 10;
                squared += (temp*temp);
            }

            n=squared;
        }
          if(n==1|| n==7)
            {
                return true;
            }
        else
        return false;
    }
}