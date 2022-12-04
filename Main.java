import java.util.*;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        String c = input.nextLine();

        for(int i = 0; i < c.length(); i++){
            if(c.substring(i, i+1).equals("(")){
                count++;
            }else{
                count--;
                if(count == -1){
                    count = i+1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}