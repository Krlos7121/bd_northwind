package cert;
import java.sql.*;
import javax.swing.JOptionPane;
public class DataCliente {
	public Connection Conexion;
	public DataCliente(){
		Conectar();
	}
	
	public void Conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind","root","");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public ResultSet EjecutarConsultaSQL(String instruccion) {
		try {
			Statement sentencia;
			sentencia = Conexion.createStatement();
			ResultSet resultado;
			resultado = sentencia.executeQuery(instruccion);
			
			System.out.println("Instruccion correcta:"+instruccion);
			return resultado;
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
			}
		return null;
	}
	
	
	public int EjecutarSQL(String instruccion) {
		try {
			System.out.println(instruccion);
			return Conexion.createStatement().executeUpdate(instruccion);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	///////////////////////////////////////////////////////////
	public boolean insertarCliente(Variables v) {
		if(EjecutarSQL("INSERT INTO Customers VALUES ("+
				"'" + v.CustomerID +"',"+
				"'" + v.CompanyName +"',"+
				"'" + v.ContactName +"',"+
				"'" + v.ContactTitle +"',"+
				"'" + v.Address +"',"+
				"'" + v.City +"',"+
				"'" + v.Region +"',"+
				"'" + v.PostalCode +"',"+
				"'" + v.Country +"',"+
				"'" + v.Phone +"',"+
				"'" + v.Fax +"')")>0) {
		
				JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
				return true;
	} else {
		JOptionPane.showMessageDialog(null, "Error al guardar registro");
		return false;
		}
	}
		
	public boolean eliminarCliente(Variables v) {
		if(EjecutarSQL("DELETE FROM Customers WHERE CustomerID=+'"+v.CustomerID+"'")>0) {
			JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Error al eliminar registro");
			return false;
		
		}
	}
	
	public Variables cargarCliente(String customerid) {
		try {
			ResultSet r;
			r = EjecutarConsultaSQL("SELECT * FROM Customers WHERE CustomerID ='"+customerid+"';");
			if(r!=null) {
				if(r.next()) {
					Variables v;
					v=new Variables();
					v.CustomerID = r.getString(1);
					v.CompanyName = r.getString(2);
					v.ContactName = r.getString(3);
					v.ContactTitle = r.getString(4);
					v.Address = r.getString(5);
					v.City = r.getString(6);
					v.Region = r.getString(7);
					v.PostalCode = r.getString(8);
					v.Country = r.getString(9);
					v.Phone = r.getString(10);
					v.Fax = r.getString(11);
					JOptionPane.showMessageDialog(null, "Busqueda exitosa");
					return v;
				}
			}
		} catch(Exception e) {
			
		}
		JOptionPane.showMessageDialog(null, "Error en la busqueda");
		return null;
		
	}	
		
	public boolean modificarCliente(Variables v) {
			if(EjecutarSQL("UPDATE Customers SET CustomerID="+
					"'"+v.CustomerID+"',CompanyName="+
					"'"+v.CompanyName+"',ContactName="+
					"'"+v.ContactName+"',ContactTitle="+
					"'"+v.ContactTitle+"',Address="+
					"'"+v.Address+"',City="+
					"'"+v.City+"', Region="+
					"'"+v.Region+"', PostalCode="+
					"'"+v.PostalCode+"',Country="+
					"'"+v.Country+"', Phone="+
					"'"+v.Phone+"', Fax="+
					"'"+v.Fax+"'"+
					"WHERE CustomerID='"+v.CustomerID+"'")>0) {
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Error al modificar registro");
				return false;
			
			}
	}
}	
	

