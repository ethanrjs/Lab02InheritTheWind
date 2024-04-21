import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WorkerTest {

    @Test
    void testCalculateWeeklyPayNoOvertime() {
        Worker worker = new Worker("Jane", "Doe", "ID002", "Ms.", 1985, 20.0);
        assertEquals(800.0, worker.calculateWeeklyPay(40));
    }

    @Test
    void testCalculateWeeklyPayWithOvertime() {
        Worker worker = new Worker("Jane", "Doe", "ID002", "Ms.", 1985, 20.0);
        assertEquals(1100.0, worker.calculateWeeklyPay(50));  // 40 hours * $20 + 10 hours * $30 (1.5 times rate)
    }

    @Test
    void testDisplayWeeklyPay() {
        Worker worker = new Worker("Jane", "Doe", "ID002", "Ms.", 1985, 20.0);
        String expectedOutput = "Regular Pay (40 hrs): $800.0, Overtime Pay (10.0 hrs): $300.0, Total: $1100.0";
        assertEquals(expectedOutput, worker.displayWeeklyPay(50));
    }
}
