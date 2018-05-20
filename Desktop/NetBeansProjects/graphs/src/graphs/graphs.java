/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Arrays;

/**
 *
 * @author fetouh
 */
public class graphs {

    /**
     * @param args the command line arguments
     */
  static void  createMST(int x[][]){
  boolean visited [][] = new boolean [x.length][x.length];

  boolean flag=false;
  int min=0,row=0,col=0;
 int i,j,k,m=0;

 
 for(k=1;k<x.length;k++){
 
     for( i=0;i<k;i++)
  { 
       for( j=0;j<x.length;j++){
           
           if(flag==false)
           {   if( visited[i][j]==false && x[i][j]!=0)
   { min=x[i][j];  row=i; col=j;  flag=true;                }      }
           
           
           
           
           
           
           else{         
   if(x[i][j]<min && visited[i][j]==false && x[i][j]!=0)
   { min=x[i][j];  row=i; col=j;  flag=true;                }
          
           }
       
       
       
       
       
       }
      
      
  }
 visited[row][col]=true;
        visited[col][row]=true; 
 flag = false;
     System.out.println("Edge\t"+row+"-"+col+"\t\tWeight:"+x[row][col]);
  }
   
  }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
                                  
      int graph[][]=new int[][]   {{0, 2, 0, 6, 0},
                                    {2, 0, 3, 8, 5},
                                    {0, 3, 0, 0, 7},
                                    {6, 8, 0, 0, 9},
                                    {0, 5, 7, 9, 0},
                                   };
 
        
        
      createMST(graph);  
        
        
    }
    
}
