package pratica;

public class Executar{
    public static void main(String[] args){
        Impressao imp = new Impressao();
        I_dados dados = new Dados();
        imp.imprimir(dados.informacao_curso());
    }

}