
public class mindiff {

    public static int getMinDifferenceSubsetSumArrayPartition(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray = sumOfArray + arr[i];
        }

        int sum = sumOfArray / 2;

        boolean[][] mat = new boolean[arr.length+1][sum + 1];

        for (int i = 0; i < arr.length; i++) {
            mat[i][0] = true;
        }
// Initialize top row, except dp[0][0],
		// as false. With 0 elements, no other
		// sum except 0 is possible
        for (int i = 1; i <= sum; i++) {
            mat[0][i] = false;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= sum; j++) {

                if (mat[i - 1][j]) {
                    mat[i][j] = true;

                } else {
                    if (j >= arr[i]) {
                        mat[i][j] = mat[i - 1][j - arr[i]];

                    }
                }

            }
        }

        int lastRow = arr.length - 1;
        int firstPartitionSum = 0;

        for (int j = sum; j >= 0; j--) {
            if (mat[lastRow][j]) {
                firstPartitionSum = j;

                break;
            }

        }
        int minans = 0;
        for (int i = 0; i < sum / 2; i++) {
            if (mat[arr.length - 1][i] == true) {
                
                minans = Math.min(minans, sum - 2 * i);

        }
        }


	
        System.out.println(minans);
        int secondPartitionSum = sumOfArray - firstPartitionSum;
        // System.out.println(firstPartitionSum);
        // System.out.println(secondPartitionSum);
        return Math.abs(firstPartitionSum - secondPartitionSum);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };

        System.out.println(mindiff.getMinDifferenceSubsetSumArrayPartition(arr));

    }

}