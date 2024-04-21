import java.util.ArrayList;
import java.util.List;

public class InheritanceDemo {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", "Doe", "ID123", "Mr.", 1980, 20.0));
        workers.add(new Worker("Jane", "Doe", "ID124", "Ms.", 1985, 22.0));
        workers.add(new Worker("Jim", "Beam", "ID125", "Mr.", 1975, 18.5));
        workers.add(new SalaryWorker("Sara", "Connor", "ID126", "Ms.", 1990, 25.0, 52000));
        workers.add(new SalaryWorker("Bob", "Builder", "ID127", "Mr.", 1982, 30.0, 60000));
        workers.add(new SalaryWorker("Alice", "Wonder", "ID128", "Mrs.", 1988, 28.0, 65000));

        int[] hours = {40, 50, 40}; // Weekly hours for 3 weeks
        for (int week = 0; week < 3; week++) {
            System.out.println("Week " + (week + 1) + " Payments:");
            for (Worker worker : workers) {
                System.out.println(worker.getFormalName() + ": " + worker.displayWeeklyPay(hours[week]));
            }
            System.out.println();
        }
    }
}
