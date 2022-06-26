package mynewworld;

public class stringoperation {
    public static void main(String args[])
    {
          String text = "   Cut string";
          System.out.println(text);
          text = text.trim();
          System.out.println(text);
          String one = "Hello";
          String two  = "World";
          int number = 10;
          System.out.println(one + two);
          System.out.println(one + " "+ number);
          String new_string = one + two + " " + number;
          System.out.println(new_string);
          String first = "Hello";
          String second = "World";
          String lower = "hello";
          String same = "Hello";
          System.out.println(first.equals(lower));
          System.out.println(one.equals(same));
          System.out.println(first.equals(same));
          System.out.println(one + two + number);
          String greet = "Hello World,My name is Waldo,How are you";
          String[] greetings = greet.split(",");
          System.out.println(greetings[0]);
          System.out.println(greetings[1]);
          System.out.println(greetings[2]);
          String choice = "CoffeeorTea";
          System.out.println(choice.substring(8));
          System.out.println(choice.substring(0,6));
          System.out.println(greet.length());
          String new_word = "mynameisakanksha";
          System.out.println(new_word.toUpperCase());
          System.out.println(new_word.toLowerCase());

    }
}
