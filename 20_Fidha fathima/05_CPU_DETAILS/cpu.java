package Program5;

import java.util.Scanner;

public class CPU {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double Cache;
		public Processor(double cache)
		{
			Cache = cache;
		}
		double getCache() {
			return Cache;
		}
	}
	static class RAM {
		double memory,clockspeed;
		String manufacturer;
		RAM(double cs)
		{
			clockspeed = cs;
		}
		double getClockSpeed() {
			return clockspeed;
		}
	}
	public static void main(String[] args) {
		CPU cpu = new CPU();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter cache of your processor : ");
		double cache = s.nextDouble();
		System.out.println("Enter Ram ClockSpeed ? " );
		double clockSpeed = s.nextDouble();
		CPU.Processor p = cpu.new Processor(cache);
		CPU.RAM ram = new CPU.RAM(clockSpeed);
		s.close();
		System.out.println("Processor Cache  "+p.getCache()+" MB");
		System.out.println("Ram Clock Speed  "+ram.getClockSpeed()+" GHz");
	}
	
}