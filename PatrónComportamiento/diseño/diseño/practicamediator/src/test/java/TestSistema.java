import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.echeverri.Coche;
import com.echeverri.ConcreteMediator;
import com.echeverri.Radio;
import com.echeverri.Telefono;

public class TestSistema {

	private Radio radio;
	private Telefono telefono;
	private Coche coche;
	private ConcreteMediator concreteMediator;
	
	@Before
	public void init() {
		radio = new Radio();
		telefono = new Telefono();
		coche = new Coche();
		concreteMediator = new ConcreteMediator();

		concreteMediator.setCoche(coche);
		concreteMediator.setRadio(radio);
		concreteMediator.setTelefono(telefono);

		coche.setMediator(concreteMediator);
		radio.setMediator(concreteMediator);
		telefono.setMediator(concreteMediator);
	}
	
	@Test
	public void test_encender_apagar_coche() {
		assertFalse(radio.encendida());
		assertFalse(telefono.musicaEncendida());
		
		telefono.enciendeMusica();
		assertTrue(telefono.musicaEncendida());
		
		coche.enciende();
		
		assertTrue(radio.encendida());
		assertFalse(telefono.musicaEncendida());
	
		coche.apaga();
		assertFalse(radio.encendida());
	}

	@Test
	public void test_suena_telefono() {
		radio.enciende();
		assertTrue(radio.encendida());
		
		telefono.recibeLlamada();
		
		assertFalse(radio.encendida());
	}
	
	@Test
	public void test_enciende_radio() {
		
		telefono.enciendeMusica();
		assertTrue(telefono.musicaEncendida());
		
		radio.enciende();
		
		assertFalse(telefono.musicaEncendida());
	}
}