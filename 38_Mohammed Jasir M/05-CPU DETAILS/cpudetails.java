import java.util.Scanner;

public class cpudetails {

    double price;

    class Processor {
        int cores;
        String manufacturer;
        double cache;

        void getProcessorData(Scanner sc) {
            System.out.print("Enter number of cores: ");
            cores = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter processor manufacturer: ");
            manufacturer = sc.nextLine();

            System.out.print("Enter processor cache (MB): ");
            cache = sc.nextDouble();
            sc.nextLine();
        }

        void displayProcessorData() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
            System.out.println("Processor Cache: " + cache + " MB");
        }
    }

    static class RAM {
        int memory;
        String manufacturer;
        double clock;

        void getRAMData(Scanner sc) {
            System.out.print("Enter RAM memory (GB): ");
            memory = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter RAM manufacturer: ");
            manufacturer = sc.nextLine();

            System.out.print("Enter RAM clock speed (GHz): ");
            clock = sc.nextDouble();
            sc.nextLine();
        }

        void displayRAMData() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
            System.out.println("RAM Clock Speed: " + clock + " GHz");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = new CPU.RAM();

        processor.getProcessorData(sc);
        ram.getRAMData(sc);

        System.out.println("\n----- CPU DETAILS -----");

        processor.displayProcessorData();
        ram.displayRAMData();

        sc.close();
    }
}
