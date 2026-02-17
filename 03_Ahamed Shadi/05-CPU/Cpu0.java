package program5;
import java.util.Scanner;

public class Cpu0
{
	double price;
	class Processor
	{
		double cores;
		String manufactures;
		double getcache(double c)
		{
			return c;
		}
	}
	static class RAM
	{
		double memory;
		String manufactures;
		double getClockSpeed(double s)
		{
			return s;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Cpu0 cpu=new Cpu0();
		Cpu0.Processor processor= cpu.new Processor();
		Cpu0.RAM ram=new Cpu0.RAM();
		System.out.println("Enter the cache :");
		double c=sc.nextDouble();
		System.out.println("Enter the Clock Speed :");
		double s=sc.nextDouble();
		System.out.println("processor cache= "+processor.getcache(c));
		System.out.println("RAM clock speed ="+ram.getClockSpeed(s));
		sc.close();
	}
}