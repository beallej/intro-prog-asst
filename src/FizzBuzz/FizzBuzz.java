package FizzBuzz;

/**
 * Created by josiebealle on 09/09/2016.
 */
public class FizzBuzz {

    public static void printFizzBuzz(){
        StringBuilder builder = new StringBuilder();
        boolean haveStringForNumber = false;
        for (int i = 1; i < 101; i++){
            if (i % 3 == 0){
                builder.append("Fizz");
                haveStringForNumber = true;
            }
            if (i % 5 == 0) {
                builder.append("Buzz");
                haveStringForNumber = true;
            }
            if (!haveStringForNumber){
                builder.append(i);
            }
            haveStringForNumber = false;
            builder.append("\n");
        }
        System.out.print(builder.toString());
    }

    public static void main(String[] args) {
        printFizzBuzz();
    }
}
