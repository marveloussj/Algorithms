package xyz.marsj.dp;
/** 343
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
	例如，给定 n = 2，返回1（2 = 1 + 1）；给定 n = 10，返回36（10 = 3 + 3 + 4）。
	注意：你可以假设 n 不小于2且不大于58。
 * @author sj
 *
 */
public class IntegerBreak {
    private int max3(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    public int integerBreak(int n) {
        int[] res=new int[n+1];
        res[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
            	//考虑自己，分割成2个，分割成多个
                res[i]=max3(res[i],j*(i-j),j*res[i-j]);
            }
        }
        return res[n];
    }
}
