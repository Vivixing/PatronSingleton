import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.echeverri.BaseDatos;
import com.echeverri.BaseDatosMemoria;
import com.echeverri.Logger;

public class TestBaseDatosConLogger {

	private Logger logger;
	private BaseDatos sinLogger;
	private BaseDatos bbdd;
	
	@Before
	public void init() {
		logger = new Logger();
        sinLogger = new BaseDatosMemoria();
		// construir un LoggerDecorator usando la base de datos sinLogger y el
		// logger
		bbdd = null;
	}
	
	
	// de este test no hay que modificar nada
	@Test
	public void test_logger_decorator() {
		
		assertNotNull("falta inicializar bbdd en el metodo init()",bbdd);
		assertFalse("logger no esta vacio",logger.obtener().contains("inserta entrada"));
		bbdd.inserta("entrada");
		
		assertTrue("bbdd no ha recibido entrada", sinLogger.registros().contains("entrada"));
		assertTrue("no se ha registrado la entrada", logger.obtener().contains("inserta entrada"));

		// lectura con el adapter con logger
		List<String> registros = bbdd.registros();
		
		assertTrue("el adapter no tiene la nueva entrada", registros.contains("entrada"));
	
		assertTrue("no se ha registrado la lectura", logger.obtener().contains("lectura"));
	}

	
}
