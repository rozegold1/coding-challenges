import java.util.Objects;

public class PokerShuffleDeck {




    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {

        int deckLen = shuffledDeck.length-1;
        int len1= half1.length-1;
        int len2 = half2.length-1;
        if(len1+len2+1 != deckLen)
            return false;
        System.out.println(len1+""+len2);
       /* if((shuffledDeck[0] != half1[0] && shuffledDeck[0] != half2[0]) ||
                (shuffledDeck[deckLen] != half1[len1] && shuffledDeck[deckLen] != half2[len2])){
            return false;
        }*/
        Objects.requireNonNull(half1);
        int id=0, i1 =0 , i2 = 0 ;

        while(id <= deckLen){
            if(i1>=0 && i1<=len1 && shuffledDeck[id] == half1[i1]){
                i1++;

            }
            else if(i2>=0 && i2 <=len2 && shuffledDeck[id] == half2[i2]){
                i2++;

            }
            else if(i1>=0 && i2>=0 && (len1 >= i1 && shuffledDeck[id] != half1[i1]) && (len2>=i2 && shuffledDeck[id] != half2[i2])){
                return false;
            }
            id++;
        }


        return true;
    }

}
