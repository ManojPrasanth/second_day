import java.util.*;
class Primerange
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int num1=s.nextInt();
int setflag=0;
int check=0;
for(int j=num;j<num1;j++)
{
setflag=0;
check=j;
for(int i=2;i<=check/2;i++)
{
if(check%i==0)
{
setflag=1;
break;
}
}
if(setflag==0)
System.out.print(" "+check);
}
}
}