public class SumOfArray {
    public static void main(String[] args)
    {
            //Scanner sc=new Scanner(System.in);
           //float n=sc.nextFloat();

            int [][] marks1 ={{1,2,3},
                            {4,5,6}} ;

            
            int [][] marks2 ={{1,2,3},
                            {4,5,6}} ;
            int [][] sum={{0,0,0},{0,0,0}};
            for(int i=0; i<marks1.length; i++)
                for(int j=0; j<marks1[i].length; j++)
                {   //System.out.format("setting values for i=%d and j=%d\n",i,j);
                    sum[i][j]=marks1[i][j]+marks2[i][j];
                }
                for(int i=0; i<sum.length;i++)
                {
                    for(int j=0; j<sum[i].length; j++)
                    {
                        System.out.print(sum[i][j]+" ");
                    }
                    System.out.println(" ");
                }
}
