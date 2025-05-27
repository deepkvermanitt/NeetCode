package arrays;

public class SetMatrixZero {
	public void setZeroes(int[][] matrix) {
        
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        boolean firstRowHasZero =false;
        boolean firstColHasZero =false;
        
        // first step will be checking for first row and column has 0 in it

        for (int i =0  ; i < columnLength;i++){
            if(matrix[0][i] == 0){
                firstRowHasZero =true;
                break;
            }
        }
        for(int j =0 ; j <rowLength;j++){
            if(matrix[j][0]==0){
                firstColHasZero = true;
                break;
            }
        }
         
         // Traversing the Matrix and marking it in FirstRow and column
         for(int i =0 ; i < rowLength;i++){
            for(int j =0;j<columnLength;j++){
                if(matrix[i][j] ==0){
                    matrix[0][j] = 0; //ROW Marked
                    matrix[i][0] = 0; //COLUMN Marked
                }
            }
         }
    
     for(int i =1 ; i < rowLength;i++){
            for(int j =1;j<columnLength;j++){
                if(matrix[0][j] ==0 || matrix[i][0]==0){
                    matrix[i][j] = 0; 
                }
            }
         }
         if(firstRowHasZero){
            for(int i = 0 ;i<columnLength;i++){
                matrix[0][i]=0;
            }
         }
           if(firstColHasZero){
            for(int j = 0 ;j<rowLength;j++){
                matrix[j][0]=0;
            }
         }     
}
}
