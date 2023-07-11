public class Task3 {
    public static void main(String[] args)
    {
        int[] arr ={1,3,2,4,5,-1};
        int max=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        System.out.println("Minimum value in array is "+max);
    }
}
