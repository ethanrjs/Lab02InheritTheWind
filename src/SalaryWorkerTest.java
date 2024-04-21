import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SalaryWorkerTest {

    @Test
    void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Alice", "Wonder", "ID003", "Mrs.", 1988, 0.0, 52000);
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40)); // $52,000 / 52 weeks
    }

    @Test
    void testDisplayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Alice", "Wonder", "ID003", "Mrs.", 1988, 0.0, 52000);
        String expectedOutput = "Weekly Pay: $1000.0";
        assertEquals(expectedOutput, salaryWorker.displayWeeklyPay(40));
    }
}
