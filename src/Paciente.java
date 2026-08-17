public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    void cadastrar() {
        
    }
    void consultar() {

    }
    public void mostrar() {
        System.out.println("\n---- Dados do Paciente ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone" + telefone);
        System.out.println("Gênero: " + genero);
        System.out.println("Idade: " + idade);
    }
}
