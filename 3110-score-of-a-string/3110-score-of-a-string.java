class Solution 
{
    public int scoreOfString(String s) 
    {
        int final_score = 0;
        for(int i=0; i<s.length()-1;i++)
        {
            final_score += Math.abs(s.charAt(i)-s.charAt(i+1));
        }        
        return final_score;
    }
}