package mynewworld;

public class myfirstprogram {
    public static void main(String args[])
    {
          Class c =  myfirstprogram.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}
