import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseWordsOrderInPlace {


    public static void main(String[] args) {
        char[] message = { 'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' };

        reverseWords(message);
        System.out.println(message);

        // prints: "steal pound cake"
    }

    public static void reverseWords(char[] message) {

        int start = 0;
        int end = message.length-1;

        swap(message, start, end);
        reverseWordsInPlace(message);


    }

    private static void swap(char[] message, int start, int end) {
        while(start<end){
            char temp = message[start];
            message[start] = message[end];
            message[end]=temp;
            start++;
            end--;
        }
    }

    private static void reverseWordsInPlace(char[] message) {
        int start=0;
        int space=0;

        while(space<message.length){
            if (message[space] == ' ') {
                swap(message, start, space - 1);

                start = ++space;
            }
            space++;
        }
        swap(message, start, space - 1);


    }

}
