/*Everybody wants to give a unique gift that will be remembered year-round.
Yet, when that special occasion comes our minds go blank and we forget what our recipients want.
Thus, we end up giving ties, scarves, and candles that inevitably get re-gifted.

Your task is to develop a program that will prompt the user for the recipient's gender.
You'll also ask for the giver's price range. Use high, medium, or low.

Now, write a program that will select the perfect gift based on the table below.
Feel free to modify the gift list if you wish.

Bonus:
Add a column to the list for age and change your program to prompt for the age (adult, teen, child) of the recipient.
You'll need to add more gift ideas if this is the case. You should also handle the possibility that you have no gift ideas.
In which case, just say ... get him/her a gift certificate.
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GiftAdvisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Who are you buying the gift for? (Him / Her)");
        String gender = input.nextLine().toLowerCase();
        System.out.println("What is your price range? (High / Medium / Low)");
        String priceRange = input.nextLine().toLowerCase();

        Random rnd = new Random();
        String giftIdea = chooseGender(gender, priceRange, rnd);
        System.out.println("How about getting a " + giftIdea + " for that special someone?");
    }

    public static String choosePriceRange(ArrayList<String> arr, Random rnd) {
        return arr.get(rnd.nextInt(arr.size()));
    }

    public static String giftForHer(String pr, Random rnd) {
        ArrayList<String> femaleHi = new ArrayList<>();
        femaleHi.add("Jewelry");
        femaleHi.add("Weekend Getaway");
        ArrayList<String> femaleMed = new ArrayList<>();
        femaleMed.add("Perfume");
        femaleMed.add("Sweater");
        ArrayList<String> femaleLow = new ArrayList<>();
        femaleLow.add("Selfie Stick");
        femaleLow.add("Wine Bottle");

        switch (pr) {
            case "high":
                return choosePriceRange(femaleHi, rnd);
            case "medium":
                return choosePriceRange(femaleMed, rnd);
            case "low":
                return choosePriceRange(femaleLow, rnd);
            default:
                return "not applicable";
        }
    }

        public static String giftForHim(String pr, Random rnd){
            ArrayList<String> maleHi = new ArrayList<>();
            maleHi.add("Smart TV");
            maleHi.add("Apple Watch");
            ArrayList<String> maleMed = new ArrayList<>();
            maleMed.add("Guitar");
            maleMed.add("Playstation");
            ArrayList<String> maleLow = new ArrayList<>();
            maleLow.add("Books");
            maleLow.add("Shoes");

            switch (pr) {
                case "high":
                    return choosePriceRange(maleHi, rnd);
                case "medium":
                    return choosePriceRange(maleMed, rnd);
                case "low":
                    return choosePriceRange(maleLow, rnd);
                default:
                    return "not applicable";
            }
        }

        public static String chooseGender(String gen, String pr, Random rnd){
            switch (gen) {
                case "her":
                    return giftForHer(pr, rnd);
                case "him":
                    return giftForHim(pr, rnd);
                default:
                    return "not applicable";
            }
        }

}