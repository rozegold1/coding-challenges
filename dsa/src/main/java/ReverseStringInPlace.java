import java.util.Arrays;


public class ReverseStringInPlace {



    public void reverse(char[] arrayOfChars) {

        System.out.println(arrayOfChars);
        // reverse input array of characters in place
        int end = arrayOfChars.length-1;
        int start = 0;
        while(end > start){
            char temp = arrayOfChars[start];
            arrayOfChars[start] = arrayOfChars[end];
            arrayOfChars[end] = temp;
            start++;
            end--;
        }
        System.out.println(arrayOfChars);
    }














}
