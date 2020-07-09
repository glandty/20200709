/**
 * 输入球的中心点和球上某一点的坐标，计算球的半径和体积
 *
 * 输入描述:
 * 球的中心点和球上某一点的坐标，以如下形式输入：x0 y0 z0 x1 y1 z1
 *
 *
 * 输出描述:
 * 输入可能有多组，对于每组输入，输出球的半径和体积，并且结果保留三位小数
 *
 * 为避免精度问题，PI值请使用arccos(-1)。
 * 示例1
 * 输入
 * 0 0 0 1 1 1
 * 输出
 * 1.732 21.766
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int[]num = new int[6];
            for (int i = 0; i < num.length ; i++) {
                num[i] = in.nextInt();
            }
            double r = 0;
            int a = (int) Math.pow((num[3] - num[0]),2);
            int b = (int) Math.pow((num[4]-num[1]),2);
            int c = (int) Math.pow((num[5]-num[2]),2);
            r = Math.sqrt(a+b+c);
            double V = (4*Math.acos(-1)*Math.pow(r,3))/3;
            System.out.printf("%.3f",r);
            System.out.print(" ");
            System.out.printf("%.3f",V);

        }
        in.close();
    }
}
