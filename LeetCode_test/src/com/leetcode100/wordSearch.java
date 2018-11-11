package com.leetcode100;

public class wordSearch {
    public static boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || word == null || word.length() == 0)
            return false;
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if (DFS(board,i,j,0,word))
                    return true;
            }
        }
        return false;
    }

    private static boolean DFS(char[][] board, int i, int j,int index, String word) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return false;
        char temp = board[i][j];
        if (board[i][j] == word.charAt(index)) {
            board[i][j] = '0';
            if (DFS(board, i - 1, j, index + 1, word) ||
                    DFS(board, i + 1, j, index + 1, word) ||
                    DFS(board, i, j - 1, index + 1, word) ||
                    DFS(board, i, j + 1, index + 1, word)) {
                return true;
            }
            board[i][j] = temp;
        }

        return false;
    }

    public static void main(String[] args){
//        char[][] test = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        char[][] test = {{'A'}};
        System.out.println(exist(test,"A"));
    }
}
