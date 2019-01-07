public class Runner
{
    public static void main(String args[])
    {
        int[] big = SortingUtil.randInt(5);
        System.out.print("Before: ");
        for(int num:big)
            System.out.print(num+" ");
        System.out.println();

        SortingUtil.bubbleSort(big);

        System.out.print("After: ");
        for(int num:big)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        SortingUtil.bubbleSort(SortingUtil.randInt(5));
        time = System.nanoTime() - time;
        System.out.println("Time Taken " + time);
    }
}
