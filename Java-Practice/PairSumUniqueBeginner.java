import java.util.*;

public class PairSumUniqueBeginner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input key (target sum)
        System.out.print("Enter the key (target sum): ");
        int key = sc.nextInt();

        // To track used elements
        boolean[] b = new boolean[n];

        System.out.println("Pairs with sum " + key + ":");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k=j+1; k<n; k++){
                if (!b[i] && !b[j] && arr[i] + arr[j] == key) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + key);
                    b[i] = true;
                    b[j] = true;
                    b[k] = true;

                }
            }
            }
        }
    }
}
