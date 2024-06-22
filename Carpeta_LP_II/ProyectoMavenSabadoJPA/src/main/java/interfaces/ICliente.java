package interfaces;

import java.util.List;

import model.TblCliente;

public interface ICliente {
	
	// declarar metodos
	public void RegistrarClientes(TblCliente cliente);
	public void ActualizarCliente(TblCliente cliente);
	public void EliminarCliente(TblCliente cliente);
	public TblCliente BuscarCliente(TblCliente cliente);
	public List<TblCliente> ListadoCliente();
	// fin de interfaz

}
