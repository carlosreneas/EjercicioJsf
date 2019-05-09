package redjsf;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Usuario;
import model.UsuarioDao;

@ManagedBean
@SessionScoped
public class UsuarioBean {
	/** 
	 * Lo utilizaremos para recibir los datos del formulario Login 
	 */
	private Usuario usuario = new Usuario();
	
	
	private Usuario usuarioAutenticado = null;

	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuarioAutenticado() {
		return usuarioAutenticado;
	}

	public void setUsuarioAutenticado(Usuario usuarioAutenticado) {
		this.usuarioAutenticado = usuarioAutenticado;
	}

	public String login() {
		UsuarioDao uDao = new UsuarioDao();
		Usuario u = uDao.buscarPorUsuario(usuario.getUsuario());
		
		if(u!=null){
			if(u.getPass().contentEquals(usuario.getPass())){
				this.usuarioAutenticado = u;
				return "exito";
			}else{
				this.usuarioAutenticado = null;
				return "error";
			}
		}else{
			this.usuarioAutenticado = null;
			return "error";
		}
		
	}
	
	public List<Usuario> listar(){ 
		UsuarioDao uDao = new UsuarioDao();
		System.out.println(this.combo);
		return uDao.list();
	}
	
	private Integer combo;
	
	public Integer getCombo() {
		return combo;
	}

	public void setCombo(Integer combo) {
		this.combo = combo;
	}

	public void listar2(){ 
		System.out.println("Prueba");
	}
	
	
	
}
