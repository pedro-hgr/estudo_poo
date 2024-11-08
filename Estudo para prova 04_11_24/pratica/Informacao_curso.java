package pratica;

import java.util.Arrays;

public class Informacao_curso {
    private Aluno[] alunos;
    private Disciplina[] disciplinas;
    private Curso curso;
    private Coordenador coordenador;
    private Professor[] professores;

    public Informacao_curso(Curso curso, Coordenador coordenador, Disciplina[] disciplinas,Professor[]professores,Aluno[] alunos ){
        this.curso=curso;
        this.alunos = alunos;
        this.disciplinas = disciplinas;
        this.curso = curso;
        this.coordenador = coordenador;
        this.professores = professores;
    }

    public Curso getCurso() {
        return curso;
    }
    public Coordenador getCoordenador() {
        return coordenador;
    }
    public Disciplina[] getDisciplina() {
        return disciplinas;
    }
    public Professor[] getProfessor() {
        return professores;
    }
    public Aluno[] getAluno() {
        return alunos;
    }
    @Override
    public String toString() {
        return "Informacao do Curso\nCurso: " + curso + "\nCoordenador: " + coordenador +"\nDisciplinas: "+ Arrays.toString(disciplinas)
                + "\nProfessores: " + Arrays.toString(professores)+"\nAlunos:" + Arrays.toString(alunos);
    }


    
}
