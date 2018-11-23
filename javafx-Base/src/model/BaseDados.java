package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class BaseDados {
	public static Set<Usuario> usuarios = new HashSet<>() ;
	public static  Set<Cliente> clientes = new HashSet<>() ;
	static {
		usuarios.add(new Usuario("admin", "admin"));
		clientes.add(new Cliente("Maria","FEMININO", new Date()));
		clientes.add(new Cliente("Jose", "MASCULINO", new Date()));
	}
	
	public static  boolean logar(Usuario usuario) {
		for(Usuario e: usuarios)
			if(usuario.getLogin().equalsIgnoreCase(e.getLogin()) && usuario.getSenha().equals(e.getSenha()))
				return true;
		return false;
	}
}
