package excercises2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        int[] wednesday = new int [] {1, 1, 2, 3, 5, 8};

        for (int i = 0; i <= wednesday.length; i++) {
            if (wednesday[i] % 2 != 0) {
                System.out.println(wednesday[i]);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseArr = new String[32];
        phraseArr = phrase.split(" ");
        System.out.println(Arrays.toString(phraseArr));



    }

}
