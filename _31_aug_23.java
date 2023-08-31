import java.util.ArrayList;

public class _31_aug_23 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String phrase = "The quick brown fox over the lazy dog";

        System.out.println(phrase);

        String myStr = "";

        int theCharIndex = 0;
        int theCharIndex02 = 0;

        theCharIndex = phrase.indexOf("brown fox");

        System.out.println("\n the index of 'b' is:" + theCharIndex);

        theCharIndex02 = phrase.indexOf("x");

        System.out.println("\n the index of 'x' is:" + theCharIndex02);

        myStr = phrase.substring(theCharIndex,theCharIndex02);

        System.out.println(phrase.substring(10,19));

        String [] friends = {"Jim", "Nate", "Matt"};

        for (int i = 0; i < friends.length ; i++){
            System.out.println(friends[i]);
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        for (int a : numbers) {
            System.out.println(a);
        }
        
    }
}