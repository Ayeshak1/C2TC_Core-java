package thiskeyword;

public class Demo {
void m()
{
	System.out.println(this);
	}
public static void main(String[] args) {
	Demo obj=new Demo();
	System.out.println(obj);
	obj.m();
}
}
