import java.util.*;

class Armstrange
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int num1=s.nextInt();
for(int j=num;j<=num1;j++)
{
int temp1=j;
int input=j;
int temp=0;
int check=0;
for(int i=0;temp1!=0;i++)
{
temp=temp1%10;
check=check+(temp*temp*temp);
temp1=temp1/10;
}
if(input==check)
{
System.out.println(input);
}
}
}
}