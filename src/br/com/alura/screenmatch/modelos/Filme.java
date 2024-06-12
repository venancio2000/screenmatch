package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    public int getClassificacao;
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(anoDeLancamento, nome);
    }


    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getDiretor(){
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return " Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
