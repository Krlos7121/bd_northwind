package cert;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cliente extends JFrame{
	
	public static void main(String[] args) {
		Cliente v = new Cliente();
		v.setVisible(true);
	}
	
	public Cliente() {
		InterfazCajas();
		InterfazVentana();
	}

	public void InterfazVentana() {
		this.setTitle("Menu");
		this.setSize(400,700);
		this.setLayout(null);
		this.setDefaultCloseOperation(2);
		Tiempo lbltiempo = new Tiempo();
		Thread r = new Thread(lbltiempo);
		this.add(lbltiempo);
		r.start();
		
	}
	
	public void InterfazCajas() {
		try {
			
			JLabel lblCustomerID = new JLabel();
			lblCustomerID.setBounds(65,30,100,30);
			lblCustomerID.setText("CustomerID");
			this.add(lblCustomerID);
			
			JFormattedTextField txtCustomerID = new JFormattedTextField(new MaskFormatter("*****"));
			txtCustomerID.setBounds(185,30,150,30);
			this.add(txtCustomerID);
			
			JLabel lblCompanyName = new JLabel();
			lblCompanyName.setBounds(65,70,100,30);
			lblCompanyName.setText("CompanyName");
			this.add(lblCompanyName);
			
			JFormattedTextField txtCompanyName = new JFormattedTextField(new MaskFormatter("****************************************"));
			txtCompanyName.setBounds(185,70,150,30);
			this.add(txtCompanyName);
			
			JLabel lblContactName = new JLabel();
			lblContactName.setBounds(65,110,100,30);
			lblContactName.setText("ContactName");
			this.add(lblContactName);
			
			JFormattedTextField txtContactName= new JFormattedTextField(new MaskFormatter("******************************"));
			txtContactName.setBounds(185,110,150,30);
			this.add(txtContactName);
			
			JLabel lblContactTitle = new JLabel();
			lblContactTitle.setBounds(65,150,100,30);
			lblContactTitle.setText("ContactTitle");
			this.add(lblContactTitle);
			
			JFormattedTextField txtContactTitle = new JFormattedTextField(new MaskFormatter("******************************"));
			txtContactTitle.setBounds(185,150,150,30);
			this.add(txtContactTitle);
			
			JLabel lblAddress = new JLabel();
			lblAddress.setBounds(65,190,100,30);
			lblAddress.setText("Address");
			this.add(lblAddress);
			
			JFormattedTextField txtAddress = new JFormattedTextField(new MaskFormatter("************************************************************"));
			txtAddress.setBounds(185,190,150,30);
			this.add(txtAddress);
			
			JLabel lblCity = new JLabel();
			lblCity.setBounds(65,230,100,30);
			lblCity.setText("City");
			this.add(lblCity);
			
			JFormattedTextField txtCity = new JFormattedTextField(new MaskFormatter("***************"));
			txtCity.setBounds(185,230,150,30);
			this.add(txtCity);
			
			JLabel lblRegion = new JLabel();
			lblRegion.setBounds(65,270,100,30);
			lblRegion.setText("Region");
			this.add(lblRegion);
			
			JFormattedTextField txtRegion = new JFormattedTextField(new MaskFormatter("***************"));
			txtRegion.setBounds(185,270,150,30);
			this.add(txtRegion);
			
			JLabel lblPostalCode = new JLabel();
			lblPostalCode.setBounds(65,310,100,30);
			lblPostalCode.setText("PostalCode");
			this.add(lblPostalCode);
			
			JFormattedTextField txtPostalCode = new JFormattedTextField(new MaskFormatter("**********"));
			txtPostalCode.setBounds(185,310,150,30);
			this.add(txtPostalCode);
			
			JLabel lblCountry = new JLabel();
			lblCountry.setBounds(65,350,100,30);
			lblCountry.setText("Country");
			this.add(lblCountry);
			
			JFormattedTextField txtCountry = new JFormattedTextField(new MaskFormatter("***************"));
			txtCountry.setBounds(185,350,150,30);
			this.add(txtCountry);
			
			JLabel lblPhone = new JLabel();
			lblPhone.setBounds(65,390,100,30);
			lblPhone.setText("Phone");
			this.add(lblPhone);
			
			JFormattedTextField txtPhone = new JFormattedTextField(new MaskFormatter("************************"));
			txtPhone.setBounds(185,390,150,30);
			this.add(txtPhone);
			
			JLabel lblFax = new JLabel();
			lblFax.setBounds(65,430,100,30);
			lblFax.setText("Fax");
			this.add(lblFax);
			
			JFormattedTextField txtFax = new JFormattedTextField(new MaskFormatter("************************"));
			txtFax.setBounds(185,430,150,30);
			this.add(txtFax);
			
			JButton btnInsertar = new JButton();
			btnInsertar.setBounds(70,480,100,30);
			btnInsertar.setText("Insertar");
			this.add(btnInsertar);
			
			JButton btnEliminar = new JButton();
			btnEliminar.setBounds(230,480,100,30);
			btnEliminar.setText("Eliminar");
			this.add(btnEliminar);
			
			JButton btnCargar = new JButton();
			btnCargar.setBounds(70,530,100,30);
			btnCargar.setText("Cargar");
			this.add(btnCargar);
			
			JButton btnModificar = new JButton();
			btnModificar.setBounds(230,530,100,30);
			btnModificar.setText("Modificar");
			this.add(btnModificar);
			
			
////////////////////////////////////////////////////////////////////////

			ActionListener aInsertar;
			aInsertar = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					Variables v = new Variables();
					v.CustomerID = txtCustomerID.getText().trim();
					v.CompanyName = txtCompanyName.getText().trim();
					v.ContactName = txtContactName.getText().trim();
					v.ContactTitle = txtContactTitle.getText().trim();
					v.Address = txtAddress.getText().trim();
					v.City = txtCity.getText().trim();
					v.Region = txtRegion.getText().trim();
					v.PostalCode = txtPostalCode.getText().trim();
					v.Country = txtCountry.getText().trim();
					v.Phone = txtPhone.getText().trim();
					v.Fax = txtFax.getText().trim();
					
					DataCliente d = new DataCliente();
					d.insertarCliente(v);
					
					
					
				}
			};
			
			btnInsertar.addActionListener(aInsertar);
			///////////////////////////////////////////////////////////////////////////////
			
			
			ActionListener aEliminar;
			aEliminar = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Variables v = new Variables();
					v.CustomerID = txtCustomerID.getText().trim();
					DataCliente d = new DataCliente();
					d.eliminarCliente(v);
				}
			};
			
			btnEliminar.addActionListener(aEliminar);
			///////////////////////////////////////////////////////////////////////////////
			ActionListener aCargar;
			aCargar = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					DataCliente d;
					d = new DataCliente();
					Variables v;
					v = d.cargarCliente(txtCustomerID.getText().trim());
					if(v!=null) {
						txtCustomerID.setText(v.CustomerID);
						txtCompanyName.setText(v.CompanyName);
						txtContactName.setText(v.ContactName);
						txtContactTitle.setText(v.ContactTitle);
						txtAddress.setText(v.Address);
						txtCity.setText(v.City);
						txtRegion.setText(v.Region);
						txtPostalCode.setText(v.PostalCode);
						txtCountry.setText(v.Country);
						txtPhone.setText(v.Phone);
						txtFax.setText(v.Fax);
					}
				}
			};
			
			btnCargar.addActionListener(aCargar);
			///////////////////////////////////////////////////////////////////////////////
			ActionListener aModificar;
			aModificar = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Variables v;
					v = new Variables();
					v.CustomerID = txtCustomerID.getText().trim();
					v.CompanyName = txtCompanyName.getText().trim();
					v.ContactName = txtContactName.getText().trim();
					v.ContactTitle = txtContactTitle.getText().trim();
					v.Address = txtAddress.getText().trim();
					v.City = txtCity.getText().trim();
					v.Region = txtRegion.getText().trim();
					v.PostalCode = txtPostalCode.getText().trim();
					v.Country = txtCountry.getText().trim();
					v.Phone = txtPhone.getText().trim();
					v.Fax = txtFax.getText().trim();
					
					DataCliente d = new DataCliente();
					d.modificarCliente(v);
				}
			};
			btnModificar.addActionListener(aModificar);
		} catch (Exception e) {
			
		}
	}
}
