// Java program to Find another array
// such that the hamming distance
// from the original array is maximum
class sq2
{
// Return the maximum hamming
// distance of a rotation
static int maxHamming(int arr[], int n)
{
    // arr[] to brr[] two times so that
    // we can traverse through all rotations.
    int brr[]=new int[2 *n + 1];
    for (int i = 0; i < n; i++){
        brr[i] = arr[i];
        brr[n+i] = arr[i];
    }
 
    // We know hamming distance with
    // 0 rotation would be 0.
    int maxHam = 0;
 
    // We try other rotations one by one
    // and compute Hamming distance
    // of every rotation
    for (int i = 1; i < n; i++)
    {
        int currHam = 0;
        for (int j = i, k=0; j < (i + n); j++,
                                          k++)
            if (brr[j] != arr[k])
                currHam++;
 
        // We can never get more than n.
        if (currHam == n)
            return n;
 
        maxHam = Math.max(maxHam, currHam);
    }
 
    return maxHam;
}
 
// driver code
public static void main (String[] args)
{
    int arr[] = {2, 4, 6, 8};
    int n = arr.length;
    System.out.print(maxHamming(arr, n));    
}
}
 
// This code is contributed by Anant Agarwal.