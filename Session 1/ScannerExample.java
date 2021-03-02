import java.util.Arrays;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        String str1=scanner.nextLine();
        int b= scanner.nextInt();
        String str2=scanner.nextLine();
        String str3=scanner.nextLine();

        System.out.printf("%d\n%s\n%d\n%s\n%s\n",a,str1,b,str2,str3);

    }
}
