import org.junit.jupiter.api.Test;
import ru.netology.services.FreelancerRestService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerRestServiceTest {
    @Test
    public void calculateRestMonthsTestOwn() {
        FreelancerRestService freelancerRestService = new FreelancerRestService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = freelancerRestService.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
    @Test
    public void calculateRestMonthsTestTwo() {
        FreelancerRestService freelancerRestService = new FreelancerRestService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = freelancerRestService.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}
