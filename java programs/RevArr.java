import java.util.Scanner;



public class RevArr{
    public static void main(String[] args)
    {
            //Scanner sc=new Scanner(System.in);
           //float n=sc.nextFloat();

            //int []arr={1,2,3};
            int []A1={1,2,3,4,5};
            int l=A1.length/2;
            int len=A1.length;
            //int temp;
            for(int i=0; i<l; i++)
            {   int temp=A1[i];
                A1[i]=A1[len-i-1];
                A1[len-i-1]=temp;

            }

          for(int ele: A1)
          {
              System.out.print(ele+" ");
          }
     }
                
    
}