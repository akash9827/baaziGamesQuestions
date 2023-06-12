public class Main {
    static int balancedSum(int arr[], int n)
    {
        int r_sum = 0, l_sum = 0;
        // Maintains left cumulative sum
        l_sum = 0;

        // Maintains right cumulative sum
        r_sum=0;
        int i = -1, j = -1;

        for( i = 0, j = n-1 ; i < j ; i++, j-- ){
            l_sum += arr[i];
            r_sum += arr[j];
            while(l_sum < r_sum && i < j){
                i++;
                l_sum += arr[i];
            }
            while(r_sum < l_sum && i < j){
                j--;
                r_sum += arr[j];
            }
        }
        if(l_sum == r_sum && i == j)
            return i;
        else
            return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};

        System.out.println(balancedSum(arr,5));
    }
}