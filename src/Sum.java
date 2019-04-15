/**
 * Created by Administrator on 2018-09-08 .
 */
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 1; i <+10 ; i++) {
            sum += i;
            if (sum>20){
                break;
            }
        }
        System.out.println(sum);
        System.out.println(i);
    }
}
