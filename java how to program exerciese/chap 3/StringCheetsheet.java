import jdk.internal.jshell.tool.StopDetectingInputStream;

public class StringCheetsheet {
    public static void main(String[] args){
      String s="Naveed";
        String s1= "Muzammil";
         s=s.concat("kaimkhani");

        // compare to method
        System.out.println(s.compareTo(s1)); 
     
        //contains method
        System.out.println(s.contains("Nav"));
        System.out.println(s1.contains("Akber"));

        //ends with method
        System.out.println(s.endsWith("eed"));
        System.out.println(s1.endsWith("eed"));

        //substring method
       System.out.println(s.substring(1)); //this will return a string after the specified index
       System.out.println(s1.substring(1, 5)); //this will return a string index to index

        //getbyte method
       byte [] byt=s.getBytes();   //getBytes function will change the whole sting in byte 
        for (int i = 0; i < byt.length; i++) {
           System.out.println(byt[i]);
        }
       
        //indexof method
        System.out.println(s.indexOf("veed"));
        System.out.println(s1.indexOf("mm",2));


        //isEmpty method
        System.out.println(s.isEmpty());

       // join method
        String a=String.join("/","2","5","2020");
        String b=String.join("_","naveed","kk","akber","kk");
        System.out.println(a);
         System.out.println(b);

        //replace method
     s =s.replace('e','a');
       System.out.println(s);

    // //split method
    String splitt="    wanna be a progr ammer      ";
    String [] nw=splitt.split("-");
    for (String ele : nw) {
        System.out.println(ele);
    }

    //substring method
    String s2=s.substring(0,3);
    System.out.println(s2);

    //tocharArray method
    char [] ch=s.toCharArray();
    for (char c : ch) {
        System.out.println(c);
        
    }

    //trim method
    System.out.println(splitt);
    System.out.println(splitt.trim());

}
}
