import java.util.Arrays;

public class MergeSortedArray {


    public static void main(String[] args) {
        int[] arr1 = new int[]{3,4,6,10,11,15};
        int[] arr2 = new int[]{1,5,8,12,14,19};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
    }

    public static int[] mergeArrays(int[] myArray, int[] alicesArray) {
        int len1 = myArray.length;
        int len2 = alicesArray.length;
        int len = len1+len2;
        int[] result = new int[len];
        int i=0,i1=0,i2=0;

        while(i<len && i1< len1 && i2<len2 ){
            if(myArray[i1] < alicesArray[i2]){
                result[i] = myArray[i1];
                i1++;
            }else{
                result[i] = alicesArray[i2];
                i2++;
            }
            i++;
        }
        if(i1<len1 && i2>=len2){
            while(i<len && i1<len1){
                result[i]=myArray[i1];
                i++;
                i1++;
            }
        }else if(i1>=len1 && i2<len2){
            while(i<len && i2<len2){
                result[i]=alicesArray[i2];
                i++;
                i2++;
            }
        }

        return result;
    }
}
