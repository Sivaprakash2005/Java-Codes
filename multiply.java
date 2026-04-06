import java.util.Scanner;

public class multiply {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Matrix Multiplication of squared matrix:");
        System.out.print("Enter row:");
        int r=sc.nextInt();
        System.out.print("Enter column:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        int[][] b=new int[r][c];
        System.out.println("Enter matrix 1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;a[i][j++]=sc.nextInt());
        }
        System.out.println("Enter matrix 2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;b[i][j++]=sc.nextInt());
        }
        int[][] d=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<c;k++){
                    d[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;System.out.print(d[i][j++]+" "));
            System.out.println();
        }
        sc.close();
    }
}
