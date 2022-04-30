package dsa.practice;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 'a', 'b', 'c');
    }

    public static void towerOfHanoi(int n, char S, char H, char D) {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, S, D, H);
        System.out.println(n + " -> " + S + " to " + D);
        towerOfHanoi(n - 1, H, S, D);
    }
}
