package ooplab;
import java.util.Scanner;
 class cpu {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double cache;
	}
	static class RAM{
		double memory;
		String manufacturer;
		double clockSpeed;
	}


    
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		cpu CPU = new cpu();
		cpu.Processor processor=CPU.new Processor();
		cpu.RAM ram=new cpu.RAM();
		System.out.println("Enrter processor cache=");
		processor.cache=sc.nextDouble();
		System.out.println("Ram clock speed=");
		ram.clockSpeed=sc.nextDouble();
		System.out.println("Processor Cache="+processor.cache);
		System.out.println("Ram clock speed="+ram.clockSpeed);
		sc.close();
	}
}