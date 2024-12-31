package practice1;

public class StaticPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPara a=new StaticPara();
		StaticPara b=new StaticPara();
		a.add(10.5f,5.5f);
		b.sub(4.6f,6.7f);
	}
	public void add(float a,float b)
	{
	float c=a+b;
	System.out.println(c);
	}
	public void sub(float a,float b)
	{
	float c=a-b;
	System.out.println(c);
	}
}
