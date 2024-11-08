package pratica;

public class Professor {
    private String nome;
    private String email;
    private Escolaridade escolaridade;

    public Professor(String nome, String email, Escolaridade escolaridade){
        this.nome = nome;
        this.email = email;
        this.escolaridade = escolaridade;
        
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    @Override
    public String toString() {
        return "Dados do Professor\nNome: " + nome + "\nEmail: " + email + "\nEscolaridade: " + escolaridade;
    }

}
