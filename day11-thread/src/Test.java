import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        String num = sc.nextLine();
        System.out.println("请输入要删除的位数：");
        int n = sc.nextInt();

        //把字符串转换成字符数组
        char[] c = num.toCharArray();

        if (n >  c.length) {
            System.out.println("错误");
            return;
        }

        if (n == 0) {
            System.out.println(num);
        } else if (n == c.length) {
            System.out.println(0);
        } else {
              int i = 0;
              int t = n;
              while(t > 0 && i < c.length - 1) {
                  if (c[i] > c[i + 1]) {
                      for (int j = i; j < c.length - 1; j++) {
                          c[j] = c[j + 1];
                      }
                      t--;
                      i = 0;
                  }
                  i++;

              }
        }

        String s = new String(c, 0, c.length - n);
        System.out.println(s);
    }

}
