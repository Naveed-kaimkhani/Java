import java.util.Scanner;
public class DuplicateEle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int [5];
        for(int i=0; i<5; i++)
        {
            arr[i]=sc.nextInt();
            for(int j=0; j<=i; j++)
            {
                if(arr[i]!=arr[j])
                {
                    System.out.println(arr[i]);
                    j=0;
                    break;
                }
            }
        }


    }
}
