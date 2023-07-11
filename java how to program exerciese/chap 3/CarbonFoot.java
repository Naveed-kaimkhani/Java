interface Carbon_Footprint
{
    public void getCarbonFoot();
}





class Bus implements Carbon_Footprint
{   public int distance;
    public int fuel;

}

class Motorcycle implements Carbon_Footprint
{
    public int distance;
    public int fuel;
    
}
class Car implements Carbon_Footprint
{
    public int distance;
    public int fuel;
}


public class CarbonFoot {
    public static void main(String[] args){
        
    }
}
