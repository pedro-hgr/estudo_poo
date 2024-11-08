package pratica;

public class Dados implements I_dados{

    public Coordenador[] Coordenador(){
        Coordenador[] Coordenador = new Coordenador[2];
        Coordenador objCoordenador = new Coordenador("Osvaldo Requeijão", "osvaldinho@gmail.com");
        Coordenador[0] = objCoordenador;
        objCoordenador = new Coordenador("Ricardo Estevão", "ricardao@gmail.com");
        Coordenador[1] = objCoordenador;
        return Coordenador;
    }

    public Curso[] Curso(){
        Curso[] Curso = new Curso[2];
        Curso objCurso = new Curso("Analise e Desenvolvimento de Sistemas", "ADS");
        Curso[0] = objCurso;
        objCurso = new Curso("Direito", "DIR");
        Curso[1] = objCurso;
        return Curso;
    }

    public Aluno[] Aluno(){
            Aluno[] Aluno = new Aluno[3];
            Aluno objAluno = new Aluno("Peu", "pedro@gmail.com", "223334444", Curso()[0]);
            Aluno[0] = objAluno;
            objAluno = new Aluno("Jaqueline", "jaja@gmail.com", "122555550", Curso()[1]);
            Aluno[1] = objAluno;
            objAluno = new Aluno("Iady", "i_simoes@gmail.com", "123456789", Curso()[0]);
            Aluno[2] = objAluno;
            return Aluno;
        }

    public Professor[] Professor(){
        Professor[] Professor = new Professor[2];
        Professor ojbProfessor = new Professor("Angela", "anjo@gmail.com", Escolaridade.DOUTORADO);
        Professor[0] = ojbProfessor;
        ojbProfessor = new Professor("Jeremias", "jjjj@gmail.com", Escolaridade.MESTRADO);
        Professor[1] = ojbProfessor;
        return Professor;
    }

    public Disciplina[] Disciplina(){
        Disciplina[] Disciplina = new Disciplina[2];
        Disciplina objDisciplina = new Disciplina("Logica de Programacao e Algoritmos", "LPA", Sala.A_03);
        Disciplina[0] = objDisciplina;
        objDisciplina = new Disciplina("Programacao Orientada a Objetos", "POO", Sala.C_01);
        Disciplina[1] = objDisciplina;
        return Disciplina;
    }

    public Informacao_curso informacao_curso(){
        Informacao_curso informacao_curso = new Informacao_curso(Curso()[0], Coordenador()[0], Disciplina(), Professor(), Aluno());
        return informacao_curso;
    }
}
