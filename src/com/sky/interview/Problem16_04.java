package com.sky.interview;

public class Problem16_04 {
	
	private String ans = "Pending";
	
    public String tictactoe(String[] board) {
    	int n = board.length;
    	if (n == 1) {
    		if (!" ".equals(board[0])) {
    			return board[0];
    		} else {
    			return ans;
    		}
    	}
    	if (judgeWinner(board, n)) {
    		return ans;
    	} else if (judgeFullBoard(board, n)) {
    		return "Draw";
    	} else {
    		return "Pending";
    	}
    }
    
    //ÅĞ¶ÏÊÇ·ñÓĞÊ¤³öµÄÍæ¼Ò
    private boolean judgeWinner(String[] board, int n) {
    	int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
    	for (int i = 0; i < n; ++i) {
    		if (board[i].charAt(i) == 'O') {
    			++cnt1;
    		} else if (board[i].charAt(i) == 'X') {
    			++cnt2;
    		}
    		if (board[i].charAt(n - 1 - i) == 'O') {
    			++cnt3;
    		} else if (board[i].charAt(n - 1 - i) == 'X') {
    			++cnt4;
    		}
    		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
    		for (int j = 0; j < n; ++j) {
    			if (board[i].charAt(j) == 'O') {
    				++num1;
    			} else if (board[i].charAt(j) == 'X') {
    				++num2;
    			}
    			if (board[j].charAt(i) == 'O') {
    				++num3;
    			} else if (board[j].charAt(i) == 'X') {
    				++num4;
    			}
    		}
    		if (num1 == n || num3 == n) {
    			ans = "O";
    			return true;
    		}
    		if (num2 == n || num4 == n) {
    			ans = "X";
    			return true;
    		}
    	}
    	if (cnt1 == n || cnt3 == n) {
    		ans = "O";
    		return true;
    	}
    	if (cnt2 == n || cnt4 == n) {
    		ans = "X";
    		return true;
    	}
    	return false;
    }
    
    //ÅĞ¶ÏÆåÅÌÊÇ·ñ°ÚÂú
    private boolean judgeFullBoard(String[] board, int n) {
    	for (int i = 0; i < n; ++i) {
    		if (board[i].contains(" ")) {
    			return false;
    		}
    	}
    	return true;
    }
}
