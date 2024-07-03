package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassUsuarioImp;
import model.TblUsuariocl3;

public class ControladorUsuario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public ControladorUsuario() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	ClassUsuarioImp crud = new ClassUsuarioImp();
		List<TblUsuariocl3> listarusuario = crud.ListarUsuario();
		request.setAttribute("listadousuarios", listarusuario);
		request.getRequestDispatcher("/RegistrarUsuario.jsp").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String usuariocl3 = request.getParameter("nombre");
		String passwordcl3 = request.getParameter("password");
		
		TblUsuariocl3 usuario = new TblUsuariocl3();
		ClassUsuarioImp crud = new ClassUsuarioImp();
		
		usuario.setUsuariocl3(usuariocl3);
		usuario.setPasswordcl3(passwordcl3);
		crud.RegistrarUsuario(usuario);
		
		List<TblUsuariocl3> listarUsuario = crud.ListarUsuario();
		request.setAttribute("listadousuarios", listarUsuario);
		request.getRequestDispatcher("/RegistrarUsuario.jsp").forward(request, response);	
	}
}