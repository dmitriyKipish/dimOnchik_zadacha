import java.util.Scanner;
public class second
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int litrs = in.nextInt();
        if (count > 0 && litrs > 0){
            int result = 0;
            int sum = litrs * count;
            for (int i = 0; i < 16; i++){
                result = sum * (i+1);
                System.out.println("К " + (i + 1) + " неделе будет выпито " + result + " литров жидкости");
            }
            if (result < 120){
                System.out.println("К сожалению, студент не принят в клуб");
            }
            else{
                System.out.println("Студент принят в IT-клуб");
            }    
        }
        else{
            System.out.println("Введены некорректные данные");
        }
    }
}