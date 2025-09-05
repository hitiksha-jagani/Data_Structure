// n = 5
// E E E E E
// D D D D
// C C C
// B B
// A

package Patterns;

public class Triangle_Pattern_2 {
    public static void main(String[] args) {
        int n = 10, k;
        char ch;

        for(int i = 0; i < n; i++) {
            k = 65 + n - i - 1;
            for(int j = 0; j < n - i; j++) {
                ch = (char)k;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}