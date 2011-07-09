package delucas.niles.engine.text;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import delucas.niles.instances.RandomStringPicker;
import delucas.niles.util.NameDictionaryFactory;

public class RandomStringPickerDictionariesTest {

	private RandomStringPicker randomStringPicker;

	@Before
	public void setUp(){
		
		randomStringPicker = new RandomStringPicker(NameDictionaryFactory.getInstance().getSpanishSurnames());
	}
	
	@Test
	public void testTraeDato(){
		String aleatorio = randomStringPicker.generateDatum();
		
		Assert.assertNotNull(aleatorio);
	}
	
}
