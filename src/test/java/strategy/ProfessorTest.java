package strategy;

import junit.framework.TestCase;

public class ProfessorTest extends TestCase {

    public void testSell() {
        ISale professor = new Professor();
        boolean result = professor.sell(33.0);
        assertEquals(true, result);
    }
}