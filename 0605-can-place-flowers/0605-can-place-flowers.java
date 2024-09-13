class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int i=0;

        while(i < flowerbed.length)
        {
            if(flowerbed[i]==0 && ((i == 0) || flowerbed[i-1]==0) && (i == flowerbed.length-1 || (flowerbed[i+1]==0)))
            //checks the i pos behind the i were currently at and the i ahead this will. OR is used so either or both statements maybe true ANDs are neeeded for essential checks. It is an odd hack but it works?!
            {
                flowerbed[i]=1;
                n--; // decrement the number of flowers we have left
            }

            i++;
        }

        return n<=0; // if we plant all flowers we are successful and can return true else its false
    }
}