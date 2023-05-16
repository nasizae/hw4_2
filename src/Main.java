import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("input listA:");
        ArrayList<String> listA=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String input=scanner.nextLine();
            listA.add(input);
        }
        System.out.println(listA);

        ArrayList<String> listB =new ArrayList<>();
        System.out.println("input listB:");
        for (int i = 0; i < 5; i++) {
            String input=scanner.nextLine();
            listB.add(input);
        }
        System.out.println(listB);
        Collections.reverse(listB);
        System.out.println(listB);
        ArrayList<String> listC =new ArrayList<>();
        for (int i = 0; i< listA.size(); i++) {
            listC.addAll(i, Collections.singleton(listA.get(i)));

        }
        int g=1;
            for (int j = 0; j < listB.size(); j++) {
                listC.addAll(g, Collections.singleton(listB.get(j)));
                g+=2;
            }
        System.out.println(listC);
            listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);



    }
}
