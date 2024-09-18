package models.entities;

// Declaração da classe Aluno
public class Aluno {
    // Atributos privados da classe: matrícula e nome do aluno
    private String matricula;
    private String nome;

    // Construtor padrão (vazio)
    public Aluno() {}

    // Construtor que inicializa a matrícula e o nome do aluno
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // Método getter para retornar o valor da matrícula
    public String getMatricula() {
        return this.matricula;
    }

    // Método setter para atribuir um valor à matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método getter para retornar o nome do aluno
    public String getNome() {
        return this.nome;
    }

    // Método setter para atribuir um valor ao nome do aluno
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para calcular a média de duas notas (n1 e n2)
    public double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // Método para verificar a aprovação de acordo com a média
    // Se a média for maior ou igual a 7.0, o aluno é aprovado, senão é reprovado
    public void calcularAprovacao(double media) {
        if (media >= 7.0) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }
    
    // Método para verificar se a matrícula é válida (diferente de null)
    public void Verifica(){
        if(this.matricula != null){
            System.out.println("Matricula Valida!");
        } else {
            System.out.println("Matricula invalida!");
        }
    }
}
