import java.util.Scanner;

/**
 * Created by Administrator on 2018-09-08 .
 */
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String adnim = "addff";
        int password = 123456;
        int i;
        boolean flag = false;
        for (i = 2;i>=0; i--){
            System.out.println("请输入用户名");
            String admin1 = input.next();
            System.out.println("请输入密码");
            int password1 = input.nextInt();
            if (admin1.equals(adnim) && password == password1){
                flag = true;
                break;
            }else {
                System.out.println("输入错误！您还有"+i+"次机会");
            }
        }if (flag){
            System.out.println("欢迎登陆MyShopping系统！");
        }else {
            System.out.println("对不起，您3次输入均错误！");
        }
    }
}
