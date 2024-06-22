package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassClienteImpl;
import model.TblCliente;

/**
 * Servlet implementation class ControladorCliente
 */
public class ControladorCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCliente() {
        super();
        // TODO Auto-generated constructor stub
    } // fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		TblCliente cliente = new TblCliente();
		ClassClienteImpl crud = new ClassClienteImpl();
		List<TblCliente> listadocliente = crud.ListadoCliente();
		request.setAttribute("Listadodeproductos", listadocliente);
		//redireccionamos
		request.getRequestDispatcher("/ListadoClientes.jsp").forward(request,response);
	} // fin del doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		// recuperamos los valores del formulario ...
		
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String dni=request.getParameter("dni");
		String email=request.getParameter("email");
		String telf=request.getParameter("telf");
		String sexo=request.getParameter("sexo");
		String nacionalidad=request.getParameter("nacionalidad");
		
		// instanciar las respectivas entidades ...
		TblCliente cliente = new TblCliente();
		ClassClienteImpl crud = new ClassClienteImpl();
		
		// asignamos valores
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		cliente.setEmail(email);
		cliente.setTelf(telf);
		cliente.setSexo(sexo);
		cliente.setNacionalidad(nacionalidad);
		
		crud.RegistrarClientes(cliente);
		request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);
		
	} // fin del doPost

}
