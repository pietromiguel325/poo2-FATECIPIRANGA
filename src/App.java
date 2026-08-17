public class App {
    public static void main(String[] args) throws Exception {

        // Paciente
        Paciente paciente1 = new Paciente();
        paciente1.nome = "Pietro Miguel Simões de Oliveira";
        paciente1.cpf = "129.055.546-61";
        paciente1.telefone = "11 93421-9351";
        paciente1.genero = "Masculino";
        paciente1.idade = 21;

        paciente1.mostrar();

        // Médico
        Medico medico1 = new Medico();
        medico1.nome = "Adalberto Silva Santos";
        medico1.crm = "12244-GO";
        medico1.telefone = "11 98453-2341";
        medico1.especialidade = "Odontologia";
        medico1.senha = "123MNB";

        medico1.mostrar();

        // Recepcionista
        Recepcionista recepcionista1 = new Recepcionista();
        recepcionista1.nome = "Jéssica Salvo Ramos";
        recepcionista1.cpf = "123.875.412-61";
        recepcionista1.telefone = "11 98312-7635";
        recepcionista1.senha = "MNB#yu";

        recepcionista1.mostrar();

        // Agenda
        Agenda agenda1 = new Agenda();
        agenda1.data = "19/08/2018";
        agenda1.hora = "19:32";
        agenda1.medico = "Adalberto Silva Santos";
        agenda1.paciente = "Pietro Miguel Simões de Oliveira";

        agenda1.mostrar();

        // Consulta
        Consulta consulta1 = new Consulta();
        consulta1.data = "19/08/2018";
        consulta1.hora = "19:32";
        consulta1.medico = "Adalberto Silva Santos";
        consulta1.paciente = "Pietro Miguel Simões de Oliveira";
        consulta1.motivo = "Febre Alta";
        consulta1.historico = "Sem motivo";

        consulta1.mostrar();

        // Receita
        Receita receita1 = new Receita();
        receita1.consulta = "Consulta do dia 19/08/2018";
        receita1.data = "19/08/2018";
        receita1.descritivo = "Tomar Dipirona 500mg de 8 em 8 horas em caso de dor ou febre alta.";

        receita1.mostrar();

        // Exame
        Exame exame1 = new Exame();
        exame1.consulta = "Consulta do dia 19/08/2018";
        exame1.data = "19/08/2018";
        exame1.descritivo = "Hemograma completo e Ultrassonografia abdominal.";
        
        exame1.mostrar();
    }
}