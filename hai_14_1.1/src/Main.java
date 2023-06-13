import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập tên của bạn:");
        Scanner sc= new Scanner(System.in);
        String Ten=sc.nextLine();
        char []array=Ten.toCharArray();
        boolean Space=true;
        for(int i=0;i<array.length;i++)
        {
            if(Character.isLetter(array[i]))
            {
                if(Space)
                {
                 array[i]=Character.toUpperCase(array[i]);
                 Space=false;
                }
            }else{
                Space=true;
            }
        }
        Ten=String.valueOf(array);
        System.out.println(Ten);
    }
}