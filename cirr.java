import java.io.*;
public class cirr
{
public static void main(String [] args)
{
int a,b,i,j,count=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println(" Enter the snumber of students:");
int a = Integer.parseInt(br.readLine());
b=2*a;
for(i=0;i<b;i++)
{
for(j=i+1;j<=b;j++)
 {
 System.out.println(i+""+j);
 count++;
 }  }
 System.out.println("the daily walk combination is "+count);
}
