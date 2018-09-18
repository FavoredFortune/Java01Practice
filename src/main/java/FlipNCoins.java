public class FlipNCoins {
    public static void main(String[] args) {
        //tests in main because random number generator means you cannot predict expected outcome of method
//        flipNHeads(0);
//        flipNHeads(-10);
//        flipNHeads(3);
//        flipNHeads(7);
    }

    public static void flipNHeads(int n){
        //makes sure that it is n heads flipped IN A ROW
        //realized needed this solution after reviewing classmate
        //Panos Kusama solution: https://github.com/codefellows-seattle-java-401d1/01-primitives-and-control-flow/pull/7/files
        int consectuiveHeadFlips = 0;

        //counts flips
        int flips = 0;

        //counts heads
        int headsCounter = 0;

        //edge cases ruled out if n equal to 0 or a negative number
        if(n <= 0){
            System.out.println("no flips possible");
            return;
        }

        //primary method that checks for n consecutive head flips and flips coin
        while(consectuiveHeadFlips !=n) {
            double random = Math.random();
            if (random < .5) {
                System.out.println("TAILS");
                consectuiveHeadFlips = 0;
                flips++;
            }
            if (random >=.5) {
                System.out.println("HEADS");
                consectuiveHeadFlips++;
                flips++;
            }
        }
        System.out.println("It took " + flips + " flips to get " + n + " heads in a row.");
    }
}
