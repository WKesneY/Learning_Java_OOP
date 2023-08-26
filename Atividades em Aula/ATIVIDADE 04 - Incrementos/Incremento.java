public class Incremento{

public static void main(String[] args)
{
    int x = 5;
    int y = x++;
    int z = ++x;

    int a = 10;
    int b = (a++ + ++a);

    System.out.printf("%d\t%d\t%d\n\n", x, y, z);
    System.out.printf("%d\t%d", a, b);
}
}