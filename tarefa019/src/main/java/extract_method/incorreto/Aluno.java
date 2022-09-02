package extract_method.incorreto;

import lombok.Data;

@Data
public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private Double nota1;
    private Double nota2;
    private Double media;

    public void imprimeMedia() {
        media = (nota1 + nota2) / 2;
        System.out.println("A media é " + media);
    }
}
