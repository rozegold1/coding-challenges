import java.util.stream.IntStream;

public class RotateLeft {

    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5,6,7};
        int k=3;
char c1 = '1'; //48
char c2 = 'b'; //48
        int q1 = c1- '0';
        int q2 = c2 - 'a';
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(Character.getNumericValue(c1));

    //   rotLeft(a,k);

    }


    /*static int[] rotLeft(int[] a, int k) {
        if(0 == k || 0 == a.length ) {
            IntStream.range(0,a.length)
                    .forEach(j -> System.out.print(a[j]+","));
            return a;
        }

        int count=0, n=a.length;
        int i=n, temp1=a[i-k], temp2= a[n-1];
        int x=1;

        while(count<= n){
            if(i-k >= 0){
                if(0==x){
                    temp2=temp1;
                }
                temp1 = a[i-k];
                a[i-k] = temp2;
                i=i-k;
                x=0;
            }else{
                if(1==x){
                    temp1=temp2;
                }
                temp2 = a[n-k+i];
                a[n-k+i] = temp1;
                i=n-k+i;
                x=1;

            }
            count++;
        }

        IntStream.range(0,a.length)
                .forEach(j -> System.out.print(a[j]+","));

        return a;


    }*/
}
