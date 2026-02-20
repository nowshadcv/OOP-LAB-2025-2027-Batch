package OOPLAB;

import java.util.Scanner;

class CPU {
    double price;

    class Processor {
        double cores;
        String manufacturer;
        double cache;   
    }

    static class RAM {
        double memory;
        String manufacturer;
        double clockSpeed;
    }
}

public class CPUDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = new CPU.RAM();

        System.out.print("Enter Processor Cache: ");
        processor.cache = sc.nextDouble();   

        System.out.print("Enter RAM Clock Speed: ");
        ram.clockSpeed = sc.nextDouble();    

        System.out.println("Processor Cache = " + processor.cache);
        System.out.println("RAM Clock Speed = " + ram.clockSpeed);

        sc.close();
    }
}
