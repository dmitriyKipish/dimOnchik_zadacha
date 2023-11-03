import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int N = in.nextInt();
        if (N <= 0){
            System.out.println(string);
        }
        else{
            for (int i = 0; i < N; i++){
                System.out.println(string);
            }
        }
    }
}