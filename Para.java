class Main
{
public void add(int a,int b,int c)
{
    int sum=a+b+c;

    System.out.println(sum);
}
public void add(int a,int b)
{
    int sum=a+b;

    System.out.println(sum);
}
}public class Para {
    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.add(4,5,6);
    obj.add(7,5);
    }
}
