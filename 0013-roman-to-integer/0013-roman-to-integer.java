class Solution 
{
    public int romanToInt(String s) 
    {
        int counter=0;
        int prev_val=0;
        for(int i=s.length()-1; i>=0;i--)
        {
            char current_char = s.charAt(i);
            int current_val =romantodecimal(current_char);
            
            // If the current value is less than the previous value, subtract it
            if(current_val<prev_val)
            {
             counter -= current_val;   
            }
            else
            {
                //add the current value to the counter
                counter+=current_val;
            }
            //updating prev value
            prev_val = current_val;
        }
        return counter;
    }

    public int romantodecimal(char numeral)
    {
        switch(numeral)
            {
                case 'I':  return 1;  
                case 'V':  return 5;  
                case 'X':  return 10; 
                case 'L':  return 50; 
                case 'C':  return 100; 
                case 'D':  return 500; 
                case 'M':  return 1000;
                default :  return 0;
        }
    }
}