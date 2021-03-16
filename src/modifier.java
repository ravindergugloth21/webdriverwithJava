class  modifier
{
static int p;
static int q;
void addition(int n1 , int n2)
{
p = n1 + n2;
q = p + n2;
}
}
public class static_use
{
public static void main(String args[])
{
modifier obj1 = new modifier();
modifier obj2 = new modifier();
int n1 = 5;
obj1.addition(n1, n1 + 3);
obj2.addition(7, n1);
System.out.println(obj1.p + " " + obj2.q);
}
}
