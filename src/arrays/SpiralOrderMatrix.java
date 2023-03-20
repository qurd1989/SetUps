package arrays;

public class SpiralOrderMatrix {
    public static void main(String[] args) {


        int a = 5;
        int result[][] = solve(a);
        System.out.println(result);

    }
            public static int[][] solve ( int A ) {


                int fillMatirx[][] = new int[A][A];


                int rowStart = 0;
                int rowEnd = A - 1;
                int colStart = 0;
                int colEbd = A - 1;
                int num = 1;
                while (rowStart <= rowEnd && colStart <= colEbd) {
                    for (int i = colStart; i <= colEbd; i++) {
                        fillMatirx[rowStart][i] = num++;

                    }
                    rowStart++;

                    for (int i = rowStart; i <= rowEnd; i++) {

                        fillMatirx[i][colEbd] = num++;

                    }
                    colEbd--;


                    if (rowStart <= rowEnd) {
                        for (int i = colEbd ; i >= colStart; i--) {

                            fillMatirx[rowEnd][i] = num++;

                        }
                        rowEnd--;


                    }
                    if (colStart <= colStart){

                        for (int i = rowEnd; i >=rowStart; i--) {
                            fillMatirx[i][colStart] = num++;

                        }
                        colStart++;
                    }

                }
                System.out.println(fillMatirx);
                return fillMatirx;
            }
        }