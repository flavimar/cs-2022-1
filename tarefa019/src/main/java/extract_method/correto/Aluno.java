package extract_method.correto;

import lombok.Data;

@Data
public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void imprimeMedia() {
        calculaMedia();
        System.out.println("A media é " + media);
    }
    public void calculaMedia(){
        media = (nota1 + nota2) / 2;
    }
}
