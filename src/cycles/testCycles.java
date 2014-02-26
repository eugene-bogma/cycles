package cycles;

/**
 * Created by Demandred on 2/26/14.
 */

import java.util.*;
public class testCycles {
    public static void main(String[] args) {

        int theLength = 20;
        int[] testArray = new int[theLength];

        double c = theLength % 2;
        //System.out.println(c);
     if ((theLength%2)==0) {
            for (int x =0, y = (theLength-1); (x<theLength/2)&&(y>0);x++,y--  ){
         testArray[x] = theLength/2 -x;
         testArray[y]= Math.abs(x-theLength/2);
        }
     }
     else if (0 != (theLength % 2)){
           testArray[(theLength-1)/2 +1] = 0;
             for (int x =0, y = (theLength-1); (x<(theLength-1)/2)&&(y>0);x++,y--  ){
                 testArray[x] = (theLength-1)/2 -x;
                 testArray[y]= Math.abs(x-(theLength-1)/2);
         }
     }
System.out.println(Arrays.toString(testArray));

}
}