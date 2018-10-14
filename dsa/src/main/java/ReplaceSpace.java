public class ReplaceSpace {


    public static void main(String[] args) {
        System.out.println(replaceSpace("Mr John Smith    "));
    }

    private static String replaceSpace(String s) {

        char[] c = s.toCharArray();

        int length = c.length;
        int fill = length-1;
        int charIndex=length-1;

        for(int i=length-1; i>0 ; i--){
            if(c[i] != ' '){
                charIndex=i;
                break;
            }
        }

        for (int i=charIndex;i>0 ; i-- ){
            if(c[i] == ' '){
                fill = replaceSpace(c, i, charIndex, fill);
                charIndex = i;
            }
        }


        return new String(c);
    }

    private static int replaceSpace(char[] c, int start, int charIndex, int fill) {

        char percent = '%';
        char two = '2';
        char zero = '0';

        for(int i=charIndex;i>start;i--){

            c[fill] = c[i];

            fill--;
        }
        c[fill--]=zero;
        c[fill--]=two;
        c[fill--]=percent;

        return fill;

    }
}
