package strategy;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    public void testSell() {
        ISale student = new Student();
        boolean result = student.sell(33.0);
        assertEquals(true, result);
    }
}