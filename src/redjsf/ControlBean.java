package redjsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import entities.Publicacion;

import java.util.*;

@ManagedBean
public class ControlBean {
	
	@ManagedProperty(value="#{usuarioBean}")
	private UsuarioBean usuarioBean;
	
	
	
	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}



	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}



	public List<Publicacion> traerPublicaciones() {
		
		return usuarioBean.getUsuarioAutenticado().getPublicacions();
		
	}

}
