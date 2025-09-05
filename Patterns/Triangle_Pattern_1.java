// n = 5
// A B C D E
// B C D E
// C D E
// D E
// E

package Patterns;

public class Triangle_Pattern_1 {
    public static void main(String[] args) {
        int k = 65, n = 6;
        char ch;

        for(int i = 0; i < n; i++) {
            k = 65 + i;
            for(int j = 0; j < n - i; j++){
                ch = (char)k;
                System.out.print(ch + " ");
                k++;
            }
            System.out.println();
        }
    }
}