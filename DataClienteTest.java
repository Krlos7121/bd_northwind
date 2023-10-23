package cert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DataClienteTest {

	@Test
	void testInsertarCliente() {
		Variables v = new Variables();
		v.setCustomerID("09876");
		v.setCompanyName("Importaciones Mendoza");
		v.setContactName("Roberto Martinez");
		v.setContactTitle("Gerente Imp. Mendoza");
		v.setAddress("Zaragoza N.17");
		v.setCity("Toluca");
		v.setRegion("");
		v.setPostalCode("52000");
		v.setCountry("Mexico");
		v.setPhone("7291965308");
		v.setFax("1234567890");
		assertEquals(v.Insertar(), true);
	}
	
	@Test
	void testEliminarCliente() {
		Variables v = new Variables();
		v.setCustomerID("12345");
		assertEquals(v.Eliminar(),true);
	}
	
	@Test
	void testCargarCliente() {
		DataCliente d = new DataCliente();
		d.cargarCliente("ALFKI");
	}
	
	@Test
	void testModificarCliente() {
		Variables v = new Variables();
		v.setCustomerID("67890");
		v.setCompanyName("Rappi S.A. de C.V.");
		v.setAddress("Independencia 96");
		v.setPhone("5567450917");
		assertEquals(v.Modificar(), true);
	}

}
