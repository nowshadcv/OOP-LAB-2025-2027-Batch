package OOPLAB;

import java.util.Scanner;

public class cpu_details
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
		cpu_details cpu=new cpu_details();
		cpu_details.Processor processor= cpu.new Processor();
		cpu_details.RAM ram=new cpu_details.RAM();
		System.out.println("Enter the cache :");
		double c=sc.nextDouble();
		System.out.println("Enter the Clock Speed :");
		double s=sc.nextDouble();
		System.out.println("processor cache= "+processor.getcache(c));
		System.out.println("RAM clock speed ="+ram.getClockSpeed(s));
		sc.close();
	}
}
