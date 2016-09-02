import java.io.*;
import java.util.*;
class Primecheck
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int setflag=0;
for(int i=2;i<num/2;i++)
{
if(num%i==0)
{
setflag=1;
break;
}
}
if(setflag==0)
System.out.println("its a prime number");
else
System.out.println("its not a prime number"); 
}
}