import java.util.*;
public class Day1Part1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        String c = input.nextLine();

        for(int i = 0; i < c.length(); i++){
            if(c.substring(i, i+1).equals("(")){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(count);
    }
}