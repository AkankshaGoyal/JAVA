package mynewworld;

public class multiplication {
    public static String test(int num) {
        int i = 1;
        String answer = " ";
        int table;
        while (i <= 10) {
            table = num * i;
            answer = answer + String.valueOf(table) + " ";
            i++;
        }
        return answer;
    }

    public static void main(String args[]) {
        System.out.println(test(5));
    }

}