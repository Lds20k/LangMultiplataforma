package control;

import java.util.ArrayList;
import java.util.Iterator;
import model.Usuario;

public class ControlUsuario {
    ArrayList<Usuario> usuarios;
    
    public ControlUsuario(){
        usuarios = new ArrayList();
        this.AdicionarUsuario("Lucas", "123");
        this.AdicionarUsuario("Julio", "123");
    }
    
    public void AdicionarUsuario(String nome, String senha){
        Usuario user = new Usuario(nome, senha);
        usuarios.add(user);
    }
    
    public boolean verificar(String nome, String senha){
        Iterator<Usuario> it = usuarios.iterator();
        while(it.hasNext()){
            Usuario user = it.next();
            if(user.getNome().equals(nome) && user.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
}
