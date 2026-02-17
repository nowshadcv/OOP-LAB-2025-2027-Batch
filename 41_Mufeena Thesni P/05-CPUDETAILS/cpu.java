package OOPLAB;

import java.util.Scanner;

public class cpu {
		double price; 
		class Processor { 
		double cores; 
		String manufacturer;
		double getCache (double inputCache) { 
		return inputCache;
		}
	} 
		static class RAM{ 
		double memory; 
		String manufacturer; 
		double getClockSpeed(double inputSpeed) {
			return inputSpeed ;
		}
	}
} 
		
class CPUDetails { 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		cpu cpu= new cpu(); 
		cpu.Processor processor = cpu.new Processor(); 
		cpu.RAM ram = new cpu.RAM(); 
		
		System.out.print("Enter processor Cache:");
		double userCache=sc.nextDouble();
		System.out.print("Enter RAM clock Speed:");
		double userspeed=sc.nextDouble();
		
				
		System.out.println("Processor Cache = " + processor.getCache(userCache)); 
		System.out.println("RAM Clock speed = "+ram.getClockSpeed(userspeed));
		sc.close();
	}
} 
