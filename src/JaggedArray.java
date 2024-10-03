import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        System.out.println("Setir sayini qeyd edin: ");
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[scanner.nextInt()][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1 + " setir uchun sutun sayini qeyd edin: ");
             arr[i] = new int[scanner.nextInt()];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i+1 + " setirinin " + (j+1) + " sutununa deyer teyin edin: " );
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
