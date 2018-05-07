package snakecamel;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcase(){

		SnakeCamelUtil scu = new SnakeCamelUtil();

	    String expected = "SmileGirl";

		String actual = scu.snakeToCamelcase("smile_girl");

		assertThat(actual, is(expected));

		}
	
	@Test
		public void camelToSnakecase(){

		SnakeCamelUtil scu = new SnakeCamelUtil();

		 String expected = "smile_girl";

		String actual = scu.camelToSnakecase("SmileGirl");

		assertThat(actual, is(expected));

		}
	
	@Test
		public void capitalize(){

		SnakeCamelUtil scu = new SnakeCamelUtil();

		 String expected = "Smile";

		String actual = scu.capitalize("smile");

		assertThat(actual, is(expected));

		}

	@Test
		public void uncapitalize(){

		SnakeCamelUtil scu = new SnakeCamelUtil();

		 String expected = "smile";

		String actual = scu.uncapitalize("Smile");

		assertThat(actual, is(expected));

		}
}
