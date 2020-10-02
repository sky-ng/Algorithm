package com.sky.contest;

public class AutumnContest_Solution_1 {
	
	private int helper(int n, int i) {
		int x = 1;
		int y = 1;
		for (int j = 1; j <= i; ++j) {
			y *= j;
		}
		for (int j = 1; j <= i; ++j) {
			x *= (n--);
		}
		return x / y;
	}
	
    public int paintingPlan(int n, int k) {
    	if (k == n * n || k == 0) return 1;
    	if (k < n) return 0;
    	int ans = 0;
    	for (int i = 0; i < n; ++i) {
    		for (int j = 0; j < n; ++j) {
    			if ((n * i + n * j - i * j) == k) {
    				ans += helper(n, i) * helper(n, j);
    			}
    		}
    	}
    	return ans;
    }
    
    private int paintingPlan1(int n, int k) {
    	if(k==n*n||k==0) return 1;
        if(k<n) return 0;
        int[] c = new int[n + 1];
        c[0]=1;
        c[1]=n;
        for(int i=2;i<=n;++i)
        {
            c[i]=c[i-1]*(n-i+1)/i;
        }
        int res=0;
        for(int i=0;i<=n;++i)
        {
            for(int j=0;j<=n;++j)
            {
                if((n*i+n*j-i*j)==k)
                {
                    res+=c[i]*c[j];
                }  
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
    	AutumnContest_Solution_1 p = new AutumnContest_Solution_1();
//    	System.out.println(p.paintingPlan(2, 2));
//    	System.out.println(p.paintingPlan(2, 1));
//    	System.out.println(p.paintingPlan(2, 4));
//    	System.out.println(p.paintingPlan(6, 6));
//    	System.out.println(p.paintingPlan(6, 7));
//    	System.out.println(p.paintingPlan(6, 11));
//    	System.out.println(p.paintingPlan(1, 0));
//    	System.out.println(p.paintingPlan(1, 1));
//    	System.out.println(p.paintingPlan(2, 4));
//    	System.out.println(p.paintingPlan(3, 9));
//    	System.out.println(p.paintingPlan(4, 16));
//    	System.out.println(p.paintingPlan(5, 25));
//    	System.out.println(p.paintingPlan(6, 0));
    	for (int i = 1; i <= 6; ++i) {
    		for (int j = 0; j <= i * i; ++j) {
    			if (p.paintingPlan(i, j) != p.paintingPlan1(i, j)) {
    				System.out.println(i + " " + j);
    				System.out.println(p.paintingPlan(i, j));
    				System.out.println(p.paintingPlan1(i, j));
    				System.out.println();
    			}
    		}
    	}
	}
}
