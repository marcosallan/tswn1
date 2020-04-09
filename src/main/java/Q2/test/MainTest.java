package Q2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Q2.Main;

public class MainTest {
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
	
	@Test
	public void minTest() {
		assertNotEquals(sdf.format(new Date()), new Main().getHorario(), 0.1);
	}

}
