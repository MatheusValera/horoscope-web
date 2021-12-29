
package cl;


public class User 
{
    private String usuario;
    private String senha;

    public User(String usuario, String senha) {
        setUsuario(usuario);
        setSenha(senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if(!usuario.equals(""))
            this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(!senha.equals(""))
            this.senha = senha;
    }
    
    public boolean ValidaUser()
    {
        String array[] = new String[2];
        array = usuario.split("@");
        String aux = array[0];
        aux = new StringBuilder(aux).reverse().toString();
        if(aux.equalsIgnoreCase(senha))
            return true;
        return false;
    }
    
    
}
