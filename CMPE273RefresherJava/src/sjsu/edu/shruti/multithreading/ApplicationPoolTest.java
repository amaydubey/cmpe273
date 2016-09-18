package sjsu.edu.shruti.multithreading;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;


public class ApplicationPoolTest {

	Processor proc = new Processor("1");

	@Test
	public void testRun() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		String time = simpleDateFormat.format(date);
		String expectedOutput = proc.getName() + " Starting : " + time + "\n";
		proc.run();
		time = simpleDateFormat.format(date);
		expectedOutput += proc.getName() + " Completed : " + time + "\n";
		Assert.assertEquals(expectedOutput, output.toString());
	}

}
