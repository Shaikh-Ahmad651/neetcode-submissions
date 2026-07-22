class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> check=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for (int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                if (check.contains(board[i][j]))
                {
                    return false;
                }
                else
                {
                    check.add(board[i][j]);
                }
            }
            check.clear();
        }
        for(int i=0;i<9;i++)
        {
            for (int j=0;j<9;j++)
            {
                if(board[j][i]=='.')
                {
                    continue;
                }
                if (check.contains(board[j][i]))
                {
                    return false;
                }
                else
                {
                    check.add(board[j][i]);
                }
            }
            check.clear();
        }
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                for(int row=i;row<i+3;row++)
                {
                    for(int col=j;col<j+3;col++)
                    {
                        if(board[row][col]=='.')
                        {
                            continue;
                        }
                        if (check.contains(board[row][col]))
                        {
                            return false;
                        }
                        else
                        {
                            check.add(board[row][col]);
                        }
                    }
                }
                check.clear();
            }
        }
        return true;
    }
}
