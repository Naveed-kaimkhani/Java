//Anonymous class is usefull when you need just an object to used it once
interface F1
{
    public void merhod1();
}


public class Anony_by_harry {
    public static void main(String[] args)
    {
        F1 obj = new F1()
        {
            @Override
            public void merhod1() {
                System.out.println("hey lilly");
            }
    
        };
        obj.merhod1();
    }

}
