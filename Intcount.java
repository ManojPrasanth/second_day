import java.io.*;
import java.util.*;
class Intcount
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int input=s.nextInt();
int count=0;
for(int i=0;input!=0;i++)
{
input=input/10;
count++;
}
System.out.println(count);
}
}
