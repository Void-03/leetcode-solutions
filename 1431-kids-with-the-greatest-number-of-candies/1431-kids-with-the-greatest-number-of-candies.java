class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> flagged = new ArrayList<>();

        int max=0;

        for(int i=0; i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i]; // checks if the prev value is greater than the current one
            }
        }   

        for(int i=0; i < candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
             // if the next value is greater than the current return true
            {
                 flagged.add(true);
            }
            else
            {
                flagged.add(false);
            }
        }
        return flagged;

    }
}