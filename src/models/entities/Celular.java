package models.entities;

public class Celular {
    // Atributos privados da classe Celular
    private String numero;      // Armazena o número de celular
    private String nome_dono;   // Armazena o nome do dono do celular
    private int ddd;            // Armazena o código de área (DDD) do celular
    
 // Construtor padrão (sem parâmetros)
    public Celular() {
        // Não faz nada, mas permite criar um objeto Celular sem definir valores iniciais
    }

    // Construtor que recebe o número do celular
    public Celular(String numero) {
        super();  // Chama o construtor da classe pai (opcional, pois não há pai explícito)
        this.numero = numero;  // Inicializa o atributo 'numero' com o valor passado como parâmetro
    }

    // Construtor que recebe o número, o nome do dono e o DDD
    public Celular(String numero, String nome_dono, int ddd) {
        super();  // Chama o construtor da classe pai (opcional, caso não haja uma superclasse, é redundante)
        this.numero = numero;      // Inicializa o atributo 'numero' com o valor passado
        this.nome_dono = nome_dono;  // Inicializa o atributo 'nome_dono' com o valor passado
        this.ddd = ddd;            // Inicializa o atributo 'ddd' com o valor passado
    }

    // Métodos getters e setters para acessar e modificar os atributos privados

    // Retorna o número do celular
    public String getNumero() {
        return numero;
    }

    // Define um novo número de celular
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Retorna o nome do dono do celular
    public String getNome_dono() {
        return nome_dono;
    }

    // Define um novo nome para o dono do celular
    public void setNome_dono(String nome_dono) {
        this.nome_dono = nome_dono;
    }

    // Retorna o DDD do celular
    public int getDdd() {
        return ddd;
    }

    // Define um novo DDD para o celular
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    // Sobrescreve o método toString para exibir as informações do celular em formato de string
    @Override
    public String toString() {
        return "Celular [numero=" + numero + ", nome_dono=" + nome_dono + ", ddd=" + ddd + "]";
    }

    //  Simula a ação de fazer uma chamada para um número de destino
    public void ligar(String numeroDestino) {
        System.out.println("Ligando para " + numeroDestino + "...");  // Exibe mensagem simulando a ligação
    }

    //  Simula o envio de uma mensagem para um número de destino, mostrando o conteúdo da mensagem
    public void enviarMensagem(String numeroDestino, String mensagem) {
        System.out.println("Enviando mensagem para " + numeroDestino + ": " + mensagem);  // Exibe mensagem simulando o envio de mensagem
    }

    //  Verifica se o número do celular é válido com base no comprimento (mínimo 8 dígitos)
    public boolean verificarValidadeNumero() {
        if (this.numero != null && this.numero.length() >= 8) {  // Verifica se o número não é nulo e possui pelo menos 8 dígitos
            System.out.println("Número válido.");  // Se válido, exibe mensagem de confirmação
            return true;
        } else {
            System.out.println("Número inválido.");  // Se inválido, exibe mensagem de erro
            return false;
        }
    }
}
