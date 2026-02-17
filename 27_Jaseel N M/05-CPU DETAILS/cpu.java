package mca_s2_27;

import java.util.Scanner;
public class CPU {
	Scanner sc = new Scanner(System.in);
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache() {
			System.out.print("Enter the cache : ");
			double cache = sc.nextDouble();
			return cache;
		}
	}
	static class ram{
		Scanner sc = new Scanner(System.in);
		double memory;
		String manufacturer;
		double getClockSpeed() {
			System.out.print("Enter the clock speed : ");
			double clckspeed = sc.nextDouble();
			return clckspeed;
		}
	}

	public static void main(String[] args) {
		CPU cpu1 = new CPU();
		CPU.Processor processor=cpu1.new Processor() ;
		CPU.ram RAM =new CPU.ram();
		System.out.println("Processor Cache = " + processor.getCache());
		System.out.println("RAM Clock speed = " + RAM.getClockSpeed());
	
}}

