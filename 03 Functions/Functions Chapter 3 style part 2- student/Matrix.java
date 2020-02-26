public class Matrix{
    public static int[][] product(int[][] x, int[][] y){
        int[][] ans = new int[x.length][y[0].length];
        for(int i=0;i<ans.length;i++)
            for(int j=0;j<ans.length;j++){
                for(int n=0;n<x[0].length;n++)
                    ans[i][j]+=(x[i][n]*y[n][j]);
            }
        return ans;
    }
}
