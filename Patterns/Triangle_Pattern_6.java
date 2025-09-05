// n = 5
// A
// B A
// C B A
// D C B A
// E D C B A

package Patterns;

public class Triangle_Pattern_6 {
    public static void main(String[] args) {
        int n = 5, k;
        char ch;

        for(int i = 0; i < n; i++) {
            k = 65 + i;
            for(int j = 0; j <= i; j++) {
                ch = (char)k;
                System.out.print(ch + " ");
                k--;
            }
            System.out.println();
        }
    }
}