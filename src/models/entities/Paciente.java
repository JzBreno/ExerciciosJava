package models.entities;

public class Paciente {
    // Atributos privados da classe Paciente
    private String nome;        // Nome do paciente
    private Celular cel = new Celular();  // Objeto do tipo Celular associado ao paciente
    private String cpf;         // CPF do paciente

    // Construtor padrão (sem parâmetros)
    public Paciente() {}

    // Construtor que recebe o nome, o celular e o CPF do paciente
    public Paciente(String nome, Celular cel, String cpf) {
        super();  // Chama o construtor da classe pai (opcional)
        this.nome = nome;  // Inicializa o nome do paciente
        this.cel = cel;    // Inicializa o celular do paciente
        this.cpf = cpf;    // Inicializa o CPF do paciente
    }

    // Getters e setters para acessar e modificar os atributos privados

    // Retorna o nome do paciente
    public String getNome() {
        return nome;
    }

    // Define o nome do paciente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o objeto Celular associado ao paciente
    public Celular getCel() {
        return cel;
    }

    // Define o celular do paciente
    public void setCel(Celular cel) {
        this.cel = cel;
    }

    // Retorna o CPF do paciente
    public String getCpf() {
        return cpf;
    }

    // Define o CPF do paciente
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Sobrescreve o método toString para exibir informações do paciente em formato de string
    @Override
    public String toString() {
        return "Paciente [nome=" + nome + ", cel=" + cel + ", cpf=" + cpf + "]";
    }

    //  Simula o agendamento de uma consulta para o paciente
    public void marcarConsulta(String data) {
        System.out.println("Consulta marcada para o paciente " + nome + " no dia " + data);
    }

    //  Envia um lembrete de consulta para o número de celular do paciente
    public void enviarLembreteConsulta(String data) {
        System.out.println("Enviando lembrete de consulta para " + cel.getNumero() + " no dia " + data);
    }

    //  Verifica se o CPF do paciente é válido (um CPF tem 11 dígitos)
    public boolean verificarCpfValido() {
        if (this.cpf != null && this.cpf.length() == 11) {
            System.out.println("CPF válido.");
            return true;
        } else {
            System.out.println("CPF inválido.");
            return false;
        }
    }
}
