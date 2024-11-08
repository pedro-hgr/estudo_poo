package pratica;

public class Disciplina {
    private String nome_disciplina;
    private String codigo_disciplina;
    private Sala sala;

    public Disciplina(String nome_disciplina, String codigo_disciplina, Sala sala){
        this.nome_disciplina = nome_disciplina;
        this.codigo_disciplina = codigo_disciplina;
        this.sala = sala;
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }
    public String getCodigo_disciplina() {
        return codigo_disciplina;
    }
    public Sala getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "Dados da Disciplina:\nNome da disciplina: " + nome_disciplina + "\nCodigo da disciplina:" + codigo_disciplina + "\nSala:"
                + sala;
    }
    
}
