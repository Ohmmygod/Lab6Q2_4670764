import java.util.Scanner;
public class Lab6Q2_4670764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[5];
        int [] result = new int[5];
        int resultIdx = 0;
        boolean hasPair = false;

        System.out.print("Enter 5 numbers separated by spaces: ");
        String inputLine = sc.nextLine();
        String[] numsToken = inputLine.split(" ");
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numsToken[i]);
        }
        sc.close();
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (current == nums[j]) {
                    boolean isInResult = false;
                    for (int k = 0; k < resultIdx; k++) {
                        if (result[k] == current) {
                            isInResult = true;
                            break;
                        }
                    }
                    if (!isInResult) {
                        result[resultIdx++] = current;
                        hasPair = true;
                    }
                    break;
                }
            }
        }
        if (hasPair) {
            for (int i = 0; i < resultIdx; i++) {
                System.out.print(result[i] + " ");
            }
        } else {
            System.out.println("-1");
        }
    }
}
