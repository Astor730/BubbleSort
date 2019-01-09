public class SortingUtil
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
                    runThrough++;
                }
            }
        }
    }
    public static boolean isSorted(int[] arr)
    {
        for(int i = 0; i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkSum(int[]before, int[] after)
    {
        int x = 0;
        int y=0;
        for(int i = 0;i<before.length;i++)
        {
            x = x+before[i];
        }
        for(int z = 0;z<after.length;z++)
        {
            y = y +after[z];
        }
        if(x==y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void selection(int[] arr)
    {
        int minPos=0;
        int minVal=0;
        for( int curPos = 0;curPos<arr.length-1; curPos++)
        {
            minPos = curPos;
            minVal = arr[curPos];
            for(int i =0; i<arr.length;i++)
            {
                if(minVal>arr[i])
                {
                    minVal=arr[i];
                    minPos=i;
                }
                swap(arr,arr[curPos],arr[minPos]);
            }
        }
    }
}
