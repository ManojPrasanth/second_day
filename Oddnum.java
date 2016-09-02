import java.util.*;
class Oddnum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int num1=s.nextInt();
for(int i=num;i<=num1;i++)
{
if(i%2!=0)
{
System.out.print(" "+i);
}
} 

}
}