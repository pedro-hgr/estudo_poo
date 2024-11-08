package pratica;

public class Curso {
    private String nome_curso;
    private String codigo_curso;

    public Curso(String nome_curso, String codigo_curso){
        this.nome_curso = nome_curso;
        this.codigo_curso = codigo_curso;
    }
    
    public String getNome_curso() {
        return nome_curso;
    }
    public String getCodigo_curso() {
        return codigo_curso;
    }

    @Override
    public String toString() {
        return "Curso: "+ nome_curso + "\nCodigo do Curso: " + codigo_curso;
    }
}
