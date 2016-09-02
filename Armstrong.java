import java.util.*;

class Armstrong
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int input=num;
int temp=0;
int check=0;
for(int i=0;num!=0;i++)
{
temp=num%10;
check=check+(temp*temp*temp);
num=num/10;
}
if(input==check)
{
System.out.println("Armstrong");
}
else
{
System.out.println("Not armstrong");
}
}
}