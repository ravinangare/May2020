import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
@Test
@Parameters({"val1","val2"})
public void sum(int v1, int v2)
{
	int FinalSum = v1 + v2;
	System.out.println("The final sum of the given values is"+FinalSum);
	}
}
