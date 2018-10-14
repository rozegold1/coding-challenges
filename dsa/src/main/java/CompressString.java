import java.util.HashMap;
import java.util.Map;

public class CompressString {


    public static void main(String[] args) {
char a = 'z';
        System.out.println(a - 'a');
        //System.out.println(new CompressString().compressString("aabccccaaa"));
    }

    private String compressString(String s) {

        Map map = new HashMap();

        if(null == s || s.length() == 0){
            return s;
        }
        char[] arr = s.toCharArray();
        int index=0, count=1;
        char currChar = arr[0];
char temp;

        for(int i=1 ; i<arr.length ; i++){
            if(currChar == arr[i]) {
                count++;
            } else{
                System.out.println(arr);
                temp = arr[i];
                arr[index] = currChar;
                currChar=temp;
                System.out.println(count);
                arr[++index] = (char)('0'+count);
                count=1;
                index++;

            }
        }
        arr[index] = currChar;
        arr[++index] = (char)('0'+count);
        index++;
        System.out.println(arr);
        return s.substring(0, index);


    }
}
