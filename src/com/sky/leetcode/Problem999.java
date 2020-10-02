package com.sky.leetcode;

public class Problem999 {
    public int numRookCaptures(char[][] board) {
    	boolean flag = true;
    	int i = 0, j = 0;
    	int ans = 0;
        for (i = 0; i < 8 && flag; i++) {
        	for (j = 0; j < 8 && flag; j++) {
        		if (board[i][j] == 'R') {
        			flag = false;
        			i--;
        			j--;
        		}
        	}
        }
        
        //左边是否有卒
        for (int m = j - 1; m >= 0; m--) {
        	if (board[i][m] == 'B') {
        		break;
        	} else if (board[i][m] == 'p') {
        		ans++;
        		break;
        	}
        }
        
        //右边是否有卒
        for (int m = j + 1; m < 8; m++) {
        	if (board[i][m] == 'B') {
        		break;
        	} else if (board[i][m] == 'p') {
        		ans++;
        		break;
        	}
        }
        
        //上边是否有卒
        for (int m = i - 1; m >= 0; m--) {
        	if (board[m][j] == 'B') {
        		break;
        	} else if (board[m][j] == 'p') {
        		ans++;
        		break;
        	}
        }
        
        //下边是否有卒
        for (int m = i + 1; m < 8; m++) {
        	if (board[m][j] == 'B') {
        		break;
        	} else if (board[m][j] == 'p') {
        		ans++;
        		break;
        	}
        }
        
    	return ans;
    }
    
    public static void main(String[] args) {
		char[][] board = {
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','R','.','.','.','p'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'}
				};
		System.out.println(new Problem999().numRookCaptures(board));
	}
}
