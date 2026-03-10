package ooplab;

import java.util.Scanner;

class CPU {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache() {
			return 4.3;
		}
	}
	static class RAM {
		double memory;
		String manufacturer;
		double getClockSpeed() {
			return 5.5;
		}
	}

}
public class CPUDetails{
	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        CPU cpu = new CPU();

	        CPU.Processor processor = cpu.new Processor();
	        CPU.RAM ram = new CPU.RAM();


	        System.out.print("Enter number of cores: ");
	        processor.cores = s.nextDouble();

	        System.out.print("Enter processor manufacturer: ");
	        processor.manufacturer = s.next();

	        System.out.print("Enter RAM memory (GB): ");
	        ram.memory = s.nextDouble();

	        System.out.print("Enter RAM manufacturer: ");
	        ram.manufacturer = s.next();

	        // Displaying details
	        System.out.println("\n----- CPU DETAILS -----");
	        System.out.println("Processor Cores: " + processor.cores);
	        System.out.println("Processor Manufacturer: " + processor.manufacturer);
	        System.out.println("Processor Cache: " + processor.getCache());
	        System.out.println("RAM Memory: " + ram.memory + " GB");
	        System.out.println("RAM Manufacturer: " + ram.manufacturer);
	        System.out.println("RAM Clock Speed: " + ram.getClockSpeed());

	        s.close();
	    }
	}


