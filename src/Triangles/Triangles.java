package Triangles;

import com.sun.deploy.util.StringUtils;

/**
 * Created by josiebealle on 09/09/2016.
 *
 * Easiest exercise ever

 Print one asterisk to the console.
 Example:
 *

 Draw a horizontal line

 Given a number n, print n asterisks on one line.
 Example when n=8:
 ********

 Draw a vertical line

 Given a number n, print n lines, each with one asterisks
 Example when n=3:
 *
 *
 *

 Draw a right triangle

 Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
 Example when n=3:
 *
 **
 ***
 *
 *
 */
public class Triangles {

    public static void printOneAsterisk() {
        System.out.println("*");
    }

    public static void printHorozontalLine(int numberOfAsterisks) {
        String line = repeat("*", numberOfAsterisks);
        System.out.println(line);
    }

    public static void printVerticalLine(int numberOfAsterisks) {
        String line = repeat("*\n", numberOfAsterisks);
        System.out.print(line);
    }

    private static String repeat(String toRepeat, int repeats) {
        StringBuilder builder = new StringBuilder(repeats*toRepeat.length());
        builder = repeat(toRepeat, repeats, builder);
        return builder.toString();
    }

    private static StringBuilder repeat(String toRepeat, int repeats, StringBuilder builder) {
        for (int i = 0; i < repeats; i++) {
            builder.append(toRepeat);
        }
        return builder;
    }

    public static void printTriangle(int numberOfLines) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= numberOfLines; i++) {
            builder = repeat("*", i, builder);
            builder.append("\n");
        }
        System.out.print(builder.toString());
    }
    public static void main(String[] args) {
        printOneAsterisk();
        printHorozontalLine(4);
        printTriangle(4);
        printVerticalLine(4);
    }


}


