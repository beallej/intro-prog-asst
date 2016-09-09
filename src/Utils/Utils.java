package Utils;

/**
 * Created by josiebealle on 09/09/2016.
 */
public class Utils {


    public static String repeat(String toRepeat, int repeats) {
        StringBuilder builder = new StringBuilder(repeats*toRepeat.length());
        builder = repeat(toRepeat, repeats, builder);
        return builder.toString();
    }

    public static StringBuilder repeat(String toRepeat, int repeats, StringBuilder builder) {
        for (int i = 0; i < repeats; i++) {
            builder.append(toRepeat);
        }
        return builder;
    }
}
