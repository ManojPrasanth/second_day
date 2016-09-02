import java.util.*;
class Numpalin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int first=s.nextInt();
int check=first;
int reverse=0,remainder;
while(first>0)
{
remainder=first%10;
reverse=reverse*10+remainder;
first=first/10;
}
if(reverse==check)
System.out.println("is a palindrome number");
else
System.out.println("its not a palindrome number");
}
}