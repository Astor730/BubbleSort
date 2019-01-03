public class Runner
{
    public static void main(String args[])
    {
        int[] big = Utility.randInt(30);
        System.out.print("Before: ");
        for(int num:big)
            System.out.print(num+" ");
        System.out.println();

        Utility.bubbleSort(big);

        System.out.print("After: ");
        for(int num:big)
            System.out.print(num+" ");
        System.out.println();
    }
}
