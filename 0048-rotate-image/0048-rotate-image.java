class Solution 
{
    public void rotate(int[][] matrix) 
    {
        int rows = matrix.length;//gets each row

        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<i ;j++)
            {
                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;


            }
        }
        for(int i=0; i < rows;i++)
        { 
            int start = 0;
            int end = matrix.length-1;

            while(start<end)
            {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}