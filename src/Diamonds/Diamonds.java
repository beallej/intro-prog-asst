package Diamonds;

import static Utils.Utils.repeat;

/**
 * Created by josiebealle on 09/09/2016.
 *
 * Isosceles Triangle

 Given a number n, print a centered triangle. Example for n=3:
 *
 ***
 *****
 Diamond

 Given a number n, print a centered diamond. Example for n=3:

 *
 ***
 *****
 ***
 *

 Diamond with Name

 Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:

 *
 ***
 Bill
 ***
 *
 *
 *
 *
 */
public class Diamonds {


    private static StringBuilder generateCenteredTriangle(int numberOfLines, StringBuilder builder, boolean upsideDown, int offset) {

        int longestStarAmount = 2*numberOfLines - 1;
        int numberStars = determineInitialNumberOfStars(longestStarAmount, upsideDown);

        for (int i = 1; i <= numberOfLines; i++) {
            int numberSpaces = (calculateNumberSpaces(numberStars, longestStarAmount, offset));
            builder = generateTriangleLine(numberSpaces, numberStars, builder);
            numberStars = updateNumberStars(numberStars, upsideDown);
        }
        return builder;
    }

    private static int calculateNumberSpaces(int numberOfStars, int longestStarAmount, int offset) {
        return (longestStarAmount - numberOfStars)/2 + offset;
    }

    private static int determineInitialNumberOfStars(int longestStarAmount, boolean upsideDown){
        int numberStars;
        if (upsideDown) {
            numberStars = longestStarAmount;
        }
        else {
            numberStars = 1;
        }
        return numberStars;
    }

    private static int updateNumberStars(int oldNumberStars, boolean upsideDown){
        int numberStars = oldNumberStars;
        if (upsideDown) {
            numberStars -= 2;
        }
        else {
            numberStars += 2;
        }
        return numberStars;
    }
    
    private static  StringBuilder generateTriangleLine(int numberSpaces, int numberStars, StringBuilder builder){
        builder = repeat(" ", numberSpaces, builder);
        builder = repeat("*", numberStars, builder);
        builder.append("\n");
        return builder;
    }

    public static void printCenteredTriangle(int n) {

        StringBuilder builder = new StringBuilder();
        builder = generateCenteredTriangle(n, builder, false, 0);
        System.out.print(builder.toString());

    }

    public static void printDiamond(int n){
        StringBuilder builder = new StringBuilder();
        builder = generateCenteredTriangle(n, builder, false, 0);
        builder = generateCenteredTriangle(n - 1, builder, true, 1);
        System.out.print(builder.toString());
    }



    public static void printNameDiamond(int n, String name){
        StringBuilder builder = new StringBuilder();
        builder = generateCenteredTriangle(n - 1, builder, false, 1);
        builder.append(name);
        builder.append("\n");
        builder = generateCenteredTriangle(n - 1, builder, true, 1);
        System.out.print(builder.toString());
    }

    public static void main(String[] args) {
        printCenteredTriangle(4);
        printDiamond(4);
        printNameDiamond(3, "Meow");

    }
}
