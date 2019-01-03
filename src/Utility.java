public class Utility
{
    public static int[] randInt( int count)
    {
        int[] big = new int[count];
        for(int i =0; i<big.length;i++)
        {
            big [i] = (int)(Math.random()*10001);
        }
        return big;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
    public static void bubbleSort(int[]arr)
    {
        int runThrough = 1;
        while(runThrough>0)
        {
            runThrough=0;
            for(int i = 0; i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    swap(arr,i,i+1);
                }
            }
        }
    }
}
