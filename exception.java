import java util*;
class customexception extends exception
{
customexception()
{
System.out.println('there is an error");
}
}
public class demo
{
Pubic static void main(String[]se)
[
Scanner b=new scanner(system.in);
System.out.println("enter the age");
String a=("enter the name");
String d=b.next();
try
{
if(a.equals("40")&&d.equals("rahul"))
{
System.out.println('you are rahul");
}
else
{
throw new customexception();}
}
catch(exception e)
{
System.out.println();
}
}
}

