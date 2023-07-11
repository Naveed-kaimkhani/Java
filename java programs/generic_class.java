/**
 * the word generic is taken from general means a general class that can store all types values
 * in arraylist we are bound to store only a single type values
 * but what if we want to store both string and int type in an array
 * Generic class help us to achieved that
 * 
 */

class mygeneric<T>
{
    private T i;

    public void set(T  i1)
    {
        i=i1;
    }

    public T get()
    {
        return i;
    }

}

public class generic_class {
    public static void main(String[] args)
    {
            mygeneric<Integer> inte = new mygeneric<Integer>();
            mygeneric<String> str = new mygeneric<String>();
            str.set("naveed");
            inte.set(5);
            inte.set(6);
            System.out.println(inte.get()+str.get());
    }
}
