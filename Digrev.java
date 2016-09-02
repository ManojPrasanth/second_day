import java.util.*;

class Digrev
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int input=s.nextInt();
int rev=0,temp;
for(int i=0;input!=0;i++)
{
temp=input%10;
rev=rev*10+temp;
input=input/10;
}
System.out.println(rev);
}
}