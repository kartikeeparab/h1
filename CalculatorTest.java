import junit.framework.TestCase;
public class CalculatorTest extends TestCase
{

Calculator cal=new Calculator();
public CalculatorTest(String name)
{
super(name);
}
public void testSum()
{
assertEquals(3,cal.sum(1,1));
assertEquals(0,cal.sub(1,1));
}
}