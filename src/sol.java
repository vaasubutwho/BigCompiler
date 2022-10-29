import java.util.HashSet;
import java.util.Set;

public class sol {
    static int[][] dir=new int[][]{{1, 0}, {0,1}, {0, -1}, {-1, 0}};
    static Set<String> set=new HashSet<>();
    static int count=0;
    static String res="";
    public static void get() {
        int[][] grid = new int[2][2];
        int ind=1;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                grid[j][i]=ind;
                ind++;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.println("Hell");
                helper(grid, i, j);
            }
        }
    }
    public static void helper(int[][] grid, int i, int j){
        if(i==grid.length-1 && j==grid[0].length-1){
            res=res+","+grid[i][j];
            System.out.println(res);
            res="";
            count++;

            return;
        }
        res=res+","+grid[i][j];
        int xCoord=i;
        int yCoord=j;
        String toAdd=i+","+j;
        set.add(toAdd);
        System.out.println(res);

        count++;

        for(int[] d:dir){
            int newX=xCoord+d[0];
            int newY=yCoord+d[1];
            if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length && !set.contains(newX+","+newY)){
                helper(grid, newX, newY);
            }
        }
    }
    public static void main(String[] args){
        get();
        System.out.println(count);
    }
}
