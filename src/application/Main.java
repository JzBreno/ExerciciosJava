package application;

import models.entities.Celular;
import models.entities.Paciente;

public class Main {
    public static void main(String[] args) {
        // Criando duas instâncias da classe Celular
        Celular celular1 = new Celular("999999999", "João Silva", 85);
        Celular celular2 = new Celular("888888888", "Maria Souza", 11);

        // Exibindo as informações dos celulares
        System.out.println("Informações do Celular 1: " + celular1);
        System.out.println("Informações do Celular 2: " + celular2);

        // Ligando de um celular para outro
        celular1.ligar(celular2.getNumero());
        celular2.enviarMensagem(celular1.getNumero(), "Oi, tudo bem?");

        // Verificando a validade dos números dos celulares
        celular1.verificarValidadeNumero();
        celular2.verificarValidadeNumero();

        // Criando duas instâncias da classe Paciente
        Paciente paciente1 = new Paciente("João Silva", celular1, "12345678901");
        Paciente paciente2 = new Paciente("Maria Souza", celular2, "09876543210");

        // Exibindo as informações dos pacientes
        System.out.println("\nInformações do Paciente 1: " + paciente1);
        System.out.println("Informações do Paciente 2: " + paciente2);

        // Marcando consultas para os pacientes
        paciente1.marcarConsulta("15/10/2024");
        paciente2.marcarConsulta("16/10/2024");

        // Enviando lembrete de consulta para os celulares dos pacientes
        paciente1.enviarLembreteConsulta("15/10/2024");
        paciente2.enviarLembreteConsulta("16/10/2024");

        // Verificando a validade dos CPFs dos pacientes
        paciente1.verificarCpfValido();
        paciente2.verificarCpfValido();
    }
}
