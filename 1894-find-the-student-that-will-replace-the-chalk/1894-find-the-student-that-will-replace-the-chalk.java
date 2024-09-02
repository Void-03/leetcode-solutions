class Solution 
{
    public int chalkReplacer(int[] chalk, int k) 
    {
        long total = 0;

        for(int i : chalk)
        {
            total += i; 
        } 

        int remainder = (int)(k % total);

        for(int i = 0; i<chalk.length;i++)
        {
            if(remainder<chalk[i])
            {
                return i;   

            }
            remainder -= chalk[i];
        }
        return 0;
    }
}