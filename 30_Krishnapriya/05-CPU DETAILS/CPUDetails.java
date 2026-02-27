package OOPLAB;


import java.util.Scanner;

class CPU {
		double price;
		

		class Processor{
			double cores;
			String manufacturer;
			double getCache(double c) {
				return c;
			}
		}
		static class RAM{
			double memory;
			String manufacturer;
			double getClockspeed(double s) {
				return s;
			}
		}

	}
	public class CPUDetails{
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			CPU cpu=new CPU();
			CPU.Processor processor=cpu.new Processor();
			CPU.RAM ram=new CPU.RAM();
			System.out.println("Enter the cache :");
			double c=sc.nextDouble();
			System.out.println("Enter the Clock Speed :");
			double s=sc.nextDouble();
			System.out.println("Processor cache=" + processor.getCache(c));
			System.out.println("RAM Clock speed=" + ram.getClockspeed(s));
		}
	}


