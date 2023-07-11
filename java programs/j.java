import java.util.Scanner;
public class j {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
     int [][]   arr={{1,2,3},
                    {4,5,6}};
     /*   for(int i =0; i<arr.length; i++)
        {
            for (int j = 0; j < arr[i].length;j++) {
                if(i==0&&j==1)
                {
                    arr[i][j]=0;
                }
                //System.out.println(arr[i][j]);
                
            }
        }
        for(int i =0; i<arr.length; i++)
        {
            for (int j = 0; j < arr[i].length;j++) {
               System.out.println(arr[i][j]);
            }
    }*/
   for(int i =0; i<arr.length; i++)
    {
        for (int j = 0; j < arr[i].length;j++) {
           arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("am doing great\n");
    for(int i =0; i<arr.length; i++)
    {
        for (int j = 0; j < arr[i].length;j++) 
        {
           System.out.println(arr[i][j]);
        }
    }

}
}