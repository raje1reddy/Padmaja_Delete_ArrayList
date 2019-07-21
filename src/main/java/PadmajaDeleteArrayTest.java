import java.lang.String;
import java.lang.StringBuilder;
import java.util.Scanner;
import java.util.ArrayList;

//code for deleting the elements of array list
public class PadmajaDeleteArrayTest {
    public static void main(String[] args){
        ArrayList<StringBuilder> myArrList = new ArrayList();
        StringBuilder sb1 = new StringBuilder("one");
        StringBuilder sb2 = new StringBuilder("two");
        StringBuilder sb3 = new StringBuilder("three");
        StringBuilder sb4 = new StringBuilder("four");
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb3);
        myArrList.add(sb4);
        myArrList.remove(1);
        for(StringBuilder element : myArrList)
            System.out.println(element);
        myArrList.remove(sb3);
        myArrList.remove(new StringBuilder("four"));
        System.out.println();
        for(StringBuilder element : myArrList)
            System.out.println(element);
    }
}

