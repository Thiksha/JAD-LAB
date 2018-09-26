class thiksha
{
void run()
{
System.out.println("car is running");
}
}
class bike extends thiksha
{
void run()
{
System.out.println("bike is running fast");
}
public static void main(String[] args)
{
bike obj= new bike();
obj.run();
}
}

