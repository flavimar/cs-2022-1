package encapsulate_field;

public class AlunoEncapsulado {
    private String nome;
    private int idade;
    private String matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        return "Nome:" + nome +
                "Idade:" + idade +
                "Matricula" + matricula;

    }
}
