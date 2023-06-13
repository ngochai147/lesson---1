import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập đoạn thơ lục bát:");
        Scanner sc= new Scanner(System.in);
        String line[]= new String[12];
        for(int i=0;i<4;i++) {
            line[i] = sc.nextLine();
        }
        poem(line);
    }

    public static void poem(String s[]) {


        for(int i=0;i<4;i++)
        {
            if(i%2!=0)
            {
                System.out.println(s[i]);
            }else{
                System.out.println("  "+s[i]);
            }
        }
    }
}