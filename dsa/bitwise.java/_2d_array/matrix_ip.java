package _2d_array;

import java.util.Scanner;
// i=row, j=col.
public class matrix_ip {
    public static boolean search(int matrix[][],int key)  {
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {if(matrix[i][j]==key)
               { 
                System.out.println("key found at indexes:"+i+", "+j);
                return true;

                
           } }
        }
        System.out.println("key not in matrix.");
        return false;
        
    }

public static void largest(int matrix[][]) 
{
    int large_no=Integer.MIN_VALUE;
     for(int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(large_no<matrix[i][j])
                {
                    large_no=matrix[i][j];
                }
            }
        }
        System.out.println(large_no);
    
}

public static void diagonal_sum(int matrix[][]) {
    // here m==n.
    int sum=0;
    for(int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                // primary diagonal
               if(i==j) 
               {
                sum+=matrix[i][j];
               }
               else if(i+j==matrix.length-1)
               {
                sum+=matrix[i][j];          

               }
            }
        }
        System.out.println("sum"+sum);
    
}

// optimized diagonal sum
public static void optDiagonal_Sum(int matrix[][]) {
    int sum=0;
    for(int i=0;i<matrix.length;i++)
    {
        // primary diagonal
        sum+=matrix[i][i];
        // secondary diagonal; i+j=n-1.
        if(i!=matrix.length-i-1)
        {
            sum+=matrix[i][matrix.length-i-1];

        }
         System.out.println(sum);
    }
    
}
// for sorted matrix.
public static boolean staircaseSearch(int matrix[][],int key) {
    int row=0, col=matrix[0].length-1;
    while(row<matrix.length && col>0)
    {
        if(matrix[row][col]==key)
        {
            System.out.println("key found at index"+row+", "+col);
            return true;

        }
        else if(key<matrix[row][col])
        {
            col--;
        }
        else
        {
            row++;
        }
    }
    System.out.println("key not is in matix");
    return false;

    
}
public static boolean Stircase_search_fromButtom(int matrix[][],int key) {
    int row=matrix.length-1, col=0;
    while(row>=0 && col<matrix[0].length)
    {
        if(matrix[row][col]==key)
        {
            System.out.println("found at index"+row+", "+col);
            return true;
        }
        else if(key<matrix[row][col])
        {
            row--;
        }
        else
        {
            col++;
        }
    }
    System.out.println("not found anywhere.");
    return false;

    
}

public static void printSpiral(int matrix[][]) {
    int startRow=0;
    int startCol=0;
    int endRow=matrix.length-1;
    int endCol=matrix[0].length-1;

    while(startRow<=endRow && startCol<=endCol)
    {
        // top
        for(int j=startCol;j<=endCol;j++)
        {
            System.out.print(matrix[startRow][j]+"  ");
        }
        // right
        for(int i=startRow+1;i<=endRow;i++)
        {
            System.out.print(matrix[i][endCol]+" ");
        }
        // bottom
        for(int j=endCol-1;j>=startCol;j--)
        {
            if(startRow==endRow)
            {
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }
        // left
        for(int i=endRow-1;i>=startRow+1;i--)
        {
            if(startCol==endCol)
            {
                break;
            }
            System.out.print(matrix[i][startCol]+" ");
        }

        startCol++;
        startRow++;
        endCol--;
        endRow--;
    }
    System.out.println();
    
}

public static void count(int matrix[][],int key) {
    int count=0;
    
    for(int i=0;i<matrix.length;i++)
     {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==key)
            {
                count++;
            }
        }
       
    }
     System.out.println("count"+count);
}

public static void second_row_sum(int matrix[][]) {
    int sum=0;
        for(int j=0;j<matrix[0].length;j++)
        {
            sum+=matrix[1][j];
        }
        System.out.println(sum);
   }

   public static void TransposeMatrix(int matrix[][]) {
    int T_matrix[][]=new int[3][3];
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0; j<matrix[0].length;j++)
        // {
        //     System.out.print(matrix[j][i]+" ,");
        // }
        // System.out.println();
        {
            T_matrix[j][i]=matrix[i][j];

        }
        
    
    
    }



    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0; j<matrix[0].length;j++)
        
        {
            T_matrix[j][i]=matrix[i][j];
            System.out.print(T_matrix[i][j]+" ,");
        }
        System.out.println();
    
    
    }
    
   }

    public static void main(String[] args) {
               int matrix[][]=new int[3][3];

        // int matrix[][]=new int[2][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
// search(matrix, 3);
// largest(matrix);
// diagonal_sum(matrix);
// int key=33;
// staircaseSearch(matrix, 33);
// Stircase_search_fromButtom(matrix, 33);
// printSpiral(matrix);   
// optDiagonal_Sum(matrix);
// count(matrix, 7);
// second_row_sum(matrix);

TransposeMatrix(matrix);}
    
}
