//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Palindromes {
    public static void main(String[] args) {
        String front = "race car";
        front = front.replace(" ", ""); //ilangin the space
        String back = "";

        for (int i = 0; i < front.length(); i++) {
            back += front.charAt(i);
            System.out.println(back);
        }

        for (int i = front.length() - 2; i >= 0; i--) { //starts from 2 blkg smpe 0 ~ i-- = decrement
            back = back.substring(0, back.length() -1); //removes the last char
            System.out.println(back);
        }



        boolean palindrome = true;
        for (int i = 0; i < front.length(); i++) {
            if (front.charAt(i) != front.charAt(front.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("bjir palinderom");
        } else {
            System.out.println("yang benerrrr rugi dong"); //smpe sini blm bs cuz theres a space between "race" and "car"
        }
    }

}