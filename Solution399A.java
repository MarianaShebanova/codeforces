import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution399A {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> strength = new HashSet<>();
        for (int i = 0; i < n; i++) {
        	strength.add(sc.nextInt());
        }
        System.out.println(Math.max(strength.size() - 2, 0));
        sc.close();
    }
}
