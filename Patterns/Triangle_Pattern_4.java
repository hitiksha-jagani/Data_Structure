// n = 5
// E
// D E
// C D E
// B C D E
// A B C D E

package Patterns;

public class Triangle_Pattern_4 {
    public static void main(String[] args) {
        int n = 5, k;
        char ch;

        for(int i = 0; i < n; i++) {
            k = 65 + n - i - 1;
            for(int j = 0; j <= i; j++) {
                ch = (char)k;
                System.out.print(ch + " ");
                k++;
            }
            System.out.println();
        }
    }
}