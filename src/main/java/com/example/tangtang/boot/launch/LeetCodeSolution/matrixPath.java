package com.example.tangtang.boot.launch.LeetCodeSolution;

public class matrixPath {
    public static void main(String[] args) {
        char[][] chars=new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};

        boolean exist = exist(chars,"AQBCESEEEFS");
        System.out.println(exist);
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] flag;
        boolean res=false;
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[0].length; j++) {
                flag=new boolean[board.length][board[0].length];
                if (board[i][j] == word.charAt(0)) {
                    flag[i][j] = true;
                    res = findNext(board, flag, i, j, word.substring(1, word.length()));
                    if (res == true)
                        break;
                    else continue;
                }

            }
            if(res==true)
                break;
        }
        return res;
    }
    public static boolean findNext(char[][] board,boolean[][] flag,int i,int j,String word)
    {
        boolean res=false;
        if(word.length()==0)
        {
            res=true;
            return res;
        }

        if(i>0&&flag[i-1][j]==false&&board[i-1][j]==word.charAt(0))
        {
            flag[i-1][j]=true;
            res=findNext(board,flag,i-1,j,word.substring(1,word.length()));
            flag[i-1][j]=false;
            if(res==true)
                return res;
        }
        if(i<board.length-1&&flag[i+1][j]==false&&board[i+1][j]==word.charAt(0))
        {
            flag[i+1][j]=true;
            res=findNext(board,flag,i+1,j,word.substring(1,word.length()));
            flag[i+1][j]=false;
            if(res==true)
                return res;
        }
        if(j>0&&flag[i][j-1]==false&&board[i][j-1]==word.charAt(0))
        {
            flag[i][j-1]=true;
            res=findNext(board,flag,i,j-1,word.substring(1,word.length()));
            flag[i][j-1]=false;
            if(res==true)
                return res;
        }
        if(j<board[0].length-1&&flag[i][j+1]==false&&board[i][j+1]==word.charAt(0))
        {
            flag[i][j+1]=true;
            res=findNext(board,flag,i,j+1,word.substring(1,word.length()));
            flag[i][j+1]=false;
            if(res==true)
                return res;
        }
        return res;
    }
}
