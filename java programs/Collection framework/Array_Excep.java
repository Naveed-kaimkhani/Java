public class Array_Excep {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        try {
            for(int i=0; i<100; i++)
            {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
            System.out.println("index goes out of bound");
        }

    }
}
