package pratica;

public class Coordenador{
    private String nome;
    private String email;
    
    public Coordenador (String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Dados do Coordenador: \nNome: " + nome + "\nEmail: " + email;
    }
    
}
