package intermediat2;

import java.util.Scanner;

public class ClassMatrix {

    int row, column;

    int[][] mat;

    ClassMatrix(int r, int c){

        this.row = r;
        this.column = c;
        this.mat = new int[r][c];

    }

    Scanner sc = new Scanner(System.in);
    void input(Scanner sc){
        for (int i = 0; i< this.row; i++) {
            for (int j = 0; j < this.column; i++) {
                mat[i][j] = sc.nextInt();
            }
        }

    }

    ClassMatrix add(ClassMatrix x){

        ClassMatrix res = new ClassMatrix(this.row, this.column);

        for (int i =0; i < this.row; i++) {
        for (int j =0; j < this.column; j++) {
            res.mat[i][j] = this.mat[i][j] + x.mat[i][j];
        }

        }
        return res;

    }

    ClassMatrix subtract(ClassMatrix x){

        ClassMatrix res = new ClassMatrix(this.row, this.column);

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                res.mat[i][j] = this.mat[i][j] - x.mat[i][j];

            }
        }
        return res;

    }

    ClassMatrix transpose(){
        ClassMatrix res = new ClassMatrix(this.row, this.column);

        for (int i = 0; i < this.row; i++) {
            if (this.column >= 0) System.arraycopy(this.mat[i], 0, res.mat[i], 0, this.column);
        }
        return res;
    }

    void print(){
      for (int i = 0; i < this.row; i++) {
          for (int  j = 0; j < this.column; j++) {
              System.out.println(this.mat[i][j] + " ");
          }
      }
        System.out.println("\n");

    }



    public static void main(String[] args) {

    }

}
