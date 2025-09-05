// n = 5
// A A A A A
// B B B B
// C C C
// D D
// E

package Patterns;

public class Triangle_Pattern_5 {
    public static void main(String[] args) {
        int n = 5, k = 65;
        char ch;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                ch = (char)k;
                System.out.print(ch + " ");
            }
            k++;
            System.out.println();
        }
    }
}