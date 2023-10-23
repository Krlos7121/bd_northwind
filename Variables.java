package cert;

public class Variables {
	public String CustomerID;
	public String CompanyName;
	public String ContactName;
	public String ContactTitle;
	public String Address;
	public String City;
	public String Region;
	public String PostalCode;
	public String Country;
	public String Phone;
	public String Fax;
	
	DataCliente dc= null;
	
	public Variables() {
		dc = new DataCliente();
	}


	public boolean Insertar() {
		if (dc.insertarCliente(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Eliminar() {
		if (dc.eliminarCliente(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean Modificar() {
		if (dc.modificarCliente(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setCustomerID(String customerid) {
		CustomerID = customerid;
	}
	
	public void setCompanyName(String companyname) {
		CompanyName = companyname;
	}
	
	public void setContactName(String contactname) {
		ContactName = contactname;
	}
	
	public void setContactTitle(String contacttitle) {
		ContactTitle = contacttitle;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public void setCity(String city) {
		City = city;
	}
	
	public void setRegion(String region) {
		Region = region;
	}
	
	public void setPostalCode(String postalcode) {
		PostalCode = postalcode;
	}
	
	public void setCountry(String country) {
		Country = country;
	}
	
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	public void setFax(String fax) {
		Fax = fax;
	}
	
}