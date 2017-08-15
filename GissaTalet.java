package gissatalet;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Kim-Christian
 */
public class GissaTalet {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = 0;
        int grad = 0;
        while(val != 1 && val != 2 && val != 3) {
            System.out.println("Välj svårighet: 1=lätt 2=medel 3=svår");
            val = sc.nextInt();
        }
        switch (val) {
            case 1: grad = 9;
                    break;
            case 2: grad = 99;
                    break;
            case 3: grad = 999;
                    break;
        }
        int tal = (int)(Math.random() * grad) + 1;
        int gissning = 0;
        System.out.println("Gissa ett tal mellan 1 och " + Integer.toString(grad+1));
        while (gissning != tal) {
            gissning = sc.nextInt();
            if (gissning > tal) {
                System.out.println("För högt!");
            }
            else if (gissning < tal) {
                System.out.println("För lågt!");
            }
        }
        System.out.println("Talet var " + Integer.toString(tal));
    }
}