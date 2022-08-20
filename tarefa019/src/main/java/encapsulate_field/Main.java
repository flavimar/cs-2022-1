package encapsulate_field;

public class Main {
    public static void main(String[] args) {
        //Implementação sem encapsulamento
        AlunoIncorreto alunoIncorreto = new AlunoIncorreto();
        alunoIncorreto.nome = "Fulando";
        alunoIncorreto.idade = 18;
        alunoIncorreto.matricula = "0101";
        System.out.println("nome do aluno é " + alunoIncorreto.nome);
        //Implementação com encapsulamento
        AlunoEncapsulado alunoEncapsulado = new AlunoEncapsulado();
        alunoEncapsulado.setNome("Ciclano");
        alunoEncapsulado.setIdade(19);
        alunoEncapsulado.setMatricula("0202");

        System.out.println("nome do aluno é " + alunoEncapsulado.getNome());
    }
}
