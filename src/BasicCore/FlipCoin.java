package BasicCore;

public class FlipCoin {
     public static void main(String[] args) {
         int numoftime =0, tails =0;
         while( numoftime < 10 ) {
             int flip = (int) (Math.random() * 2);
             if (flip < 0.5) {
                 System.out.println(flip + "-> tails" );
                 tails = tails+1;
             } else {
                 System.out.println(flip + "-> heads" );
             }
             numoftime++;
         }
         double percenttails = (100*tails/10);
         System.out.println("Percent of tails:" +percenttails);
         double percentheads = (10 - tails)*100/10;
         System.out.println("Percent of heads:" +percentheads);
     }


 }
