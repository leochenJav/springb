import java.util.Scanner;

/**
 * Created by Administrator on 2018-09-08 .
 */
public class NumChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个整数");
        int i;
        int num1 = 0;
        int num = input.nextInt();
        while (num>0){
            i = num%10;
            num = num/10;
            num1 = num1*10 + i;
        }
        System.out.println(num1);
    }
}

