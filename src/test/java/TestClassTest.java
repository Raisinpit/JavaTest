import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassTest {
    private TestClass testClass;

    @Test
    public void testReverse(){
        testClass = new TestClass();
        assertEquals(testClass.reverse("hello"),"olleh");
    }
}
