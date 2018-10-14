public class CountAndSay {


    public static void main(String[] args) {

        new CountAndSay().countAndSay(4);

    }

        public String countAndSay(int A) {

            if(A==0){
                return "";
            }
            StringBuffer sb = new StringBuffer();
            if(A>=1) {
                sb =new StringBuffer("1");
            }
            if(A>=2) {
                sb =new StringBuffer("11");
            }





            String nextString = sb.toString();
            int i = 2, j=1;
            int count = 0;
            while(i <= A){

                while(j < nextString.length()){
                    if(nextString.charAt(j-1) == nextString.charAt(j)){
                        count++;
                    }else{
                        sb.append(count);
                        sb.append(nextString.charAt(j));
                    }
                    j++;
                }

                nextString = sb.toString();
                sb = new StringBuffer();
i++;
            }
            System.out.println(nextString);
            return nextString;
        }
    }

