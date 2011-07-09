package delucas.niles.instances.patterns;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import delucas.niles.engine.core.DataGenerator;
import delucas.niles.instances.RandomStringPatternGenerator;
import delucas.niles.instances.RandomStringPicker;
import delucas.niles.util.NameDictionaryFactory;

public class RandomStringPatternGeneratorTest {

	@Test
	public void testPatronSimple(){
		
		String pattern = "¡Hola, :nombre:!";
		RandomStringPatternGenerator generator = new RandomStringPatternGenerator(pattern);
		List<String> dataList = NameDictionaryFactory.getInstance().getSpanishMaleNames();
		DataGenerator<String> dataGenerator = new RandomStringPicker(dataList );
		generator.addParameter("nombre", dataGenerator );
		
		String resultado = generator.generateDatum();
		
		Assert.assertNotNull(resultado);
		
	}
	
}
