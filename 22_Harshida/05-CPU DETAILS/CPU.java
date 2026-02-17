package OOPLAB;

import java.util.Scanner;

public class CPU { 
    double price;

    class Processor {
        double cores;
        String manufacturer;

       
        double getCache(double inputCache) {
            return inputCache;
        }
    }

    static class RAM {
        double memory;
        String manufacturer;

        double getClockSpeed(double inputSpeed) {
            return inputSpeed;
        }
    }
} 

class CPUDetails { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
  
        CPU cpu = new CPU(); 
        CPU.Processor processor = cpu.new Processor(); 
        CPU.RAM ram = new CPU.RAM(); 

        
        
        System.out.print("Enter Processor Cache: ");
        double userCache = sc.nextDouble();


        System.out.print("Enter RAM Clock Speed: ");
        double userSpeed = sc.nextDouble();

        System.out.println("Processor Cache: " + processor.getCache(userCache));
        System.out.println("RAM Clock speed: " + ram.getClockSpeed(userSpeed));
        
        sc.close();
    }
}