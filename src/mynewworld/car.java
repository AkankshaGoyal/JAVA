package mynewworld;

public class car {
    public String color;
    public car(){};
    public car(String col)
    {
          this.color = col;
    }
    public String getColour()
    {
          return this.color;
    }
    public static void main(String args[])
    {
        car newcar = new car("Pink");
        System.out.println(newcar.getColour());
        setcolorBlue(newcar);
        System.out.println(newcar.getColour());
    }
    public static void setcolorBlue(car c)
    {
        c.color = "Blue";
    }
}
