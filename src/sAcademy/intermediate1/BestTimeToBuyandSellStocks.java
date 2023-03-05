package intermediate1;

public class BestTimeToBuyandSellStocks {

    public static void main(String[] args) {



    }

    public static int maxPorift(int [] A){

           int n = A.length;
        if (n < 1) {
        return 0;

        }
        int minPrice  =  A[0];

        int mscProfit = 0 ;

        for (int i = 1; i < n; i++) {

        if (A[i] < minPrice) {
        minPrice = A[i];

        }else
        mscProfit = Math.max(mscProfit, A[i] - minPrice);
        }

        return mscProfit >0 ? mscProfit :0;
        }
        }
