package OOPLAB;

public class cpu {
	double price ;
	class Processor {
			double cores ; 
			String manufacturer;
			double getCache ( ) {
				return 4.3 ;}}
	static class RAM{
				double memory ;
				String manufacturer;
				double gatClockSpeed() {
				return 5.5 ;}}}

public class cpuDetails {
	public static void main(String[] args) {
		cpu cpu = new cpu() ;
		cpu.Processor processor = cpu.new Processor() ;
		cpu.RAM ram = new cpu.RAM();
		System.out.println("Processor Cache = " + processor.getCache() ) ;
		System.out.println("RAM Clock speed = " + ram.getCacheSpeed() ) ;}}
	

