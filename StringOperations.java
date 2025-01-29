public class StringOperations {
    public static void main(String[] args) {
        String text = "I have to write my own code T-T(Crying emote)";

        System.out.println("Now look in the code in uppercase " + text.toUpperCase());

        System.out.println("The length of this string is " + text.length());

        String NewTxt = text.replace('a', '1');
        System.out.println("And after replacing the a with 1 it looks like this " + NewTxt);

        System.out.println("From here on starting from index 9 we get this " + text.substring(9));
    }
}
