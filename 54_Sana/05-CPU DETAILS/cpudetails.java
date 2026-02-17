package OOPLAB;
import java.util.Scanner;
import OOPLAB.cpu.Processor;
public class cpudetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cpu cpu = new cpu();
        System.out.print("Enter CPU price: ");
        cpu.price = sc.nextDouble();
        cpu.Processor processor = cpu.new Processor();
        System.out.print("Enter number of processor cores: ");
        processor.cores = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter processor manufacturer: ");
        processor.manufacturer = sc.nextLine();
        cpu.RAM ram = new cpu.RAM();
        System.out.print("Enter RAM memory (GB): ");
        ram.memory = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter RAM manufacturer: ");
        ram.manufacturer = sc.nextLine();
        System.out.println("\n--- CPU Details ---");
        System.out.println("CPU Price: " + cpu.price);
        System.out.println("Processor Cores: " + processor.cores);
        System.out.println("Processor Manufacturer: " + processor.manufacturer);
        System.out.println("Processor Cache: " + processor.getCache());
        System.out.println("RAM Memory: " + ram.memory + "GB");
        System.out.println("RAM Manufacturer: " + ram.manufacturer);
        System.out.println("RAM Clock Speed: " + ram.getClockSpeed());
        sc.close();
    }
}

