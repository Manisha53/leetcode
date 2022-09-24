class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        replace_color(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    
    
    public void replace_color(int[][] image, int i, int j, int color, int old){
        if((i>=image.length || i<0) || (j>=image[0].length || j<0)) return;
        
        if(image[i][j]!=old || image[i][j]==color ) return;
        
            old=image[i][j];
            image[i][j]=color;
        
            replace_color(image,i-1,j,color,old);
            replace_color(image,i+1,j,color,old);
            replace_color(image,i,j-1,color,old);
            replace_color(image,i,j+1,color,old); 
    }
    
    
}
