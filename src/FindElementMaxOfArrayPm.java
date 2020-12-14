import java.util.Arrays;
import java.util.Scanner;

public class FindElementMaxOfArrayPm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số lượng phần tử mảng 1");
        int n1 = sc.nextInt();
        System.out.println("mời bạn nhập số lượng phần tử mảng 2");
        int n2 = sc.nextInt();
        double[][] arr = new double[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = Math.floor(Math.random() * 100);
            }
        }
        for (double[] x: arr) {
            for (double y:x) {
                System.out.print(y+" ");
            }
        }
        double maxValue = arr[0][0];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(arr[i][j]>maxValue){
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + maxValue);
    }
}
