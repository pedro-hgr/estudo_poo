package pratica;

public class Aluno{
    private String nome_aluno;
    private String email_aluno;
    private String matricula_aluno;
    private Curso curso;
    
    public Aluno(String nome_aluno, String email_aluno, String matricula_aluno, Curso curso){
        this.nome_aluno =nome_aluno;
        this.email_aluno = email_aluno;
        this.matricula_aluno = matricula_aluno;
        this.curso = curso;
    }

    public String getNome() {
        return nome_aluno;
    }

    public String getEmail() {
        return email_aluno;
    }

    public String getMatricula_aluno() {
        return matricula_aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Dados do Aluno\nNome do Aluno: " + nome_aluno + "\nEmail do aluno: " + email_aluno + "\nMatricula do aluno: " + matricula_aluno + "\nCurso: " + curso;
    }

}

