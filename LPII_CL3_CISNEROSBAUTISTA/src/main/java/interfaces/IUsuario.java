package interfaces;

import java.util.List;

import model.TblUsuariocl3;

public interface IUsuario {
	public void RegistrarUsuario(TblUsuariocl3 usuario);
	public List<TblUsuariocl3> ListarUsuario();
}
