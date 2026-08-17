public class Receita {
    public String consulta;
    public String data;
    public String descritivo;
    
    public void preescrever() {

    }
    public void consultar() {
        
    }
    public void mostrar() {
        System.out.println("\n---- Dados da Receita ---");
        System.out.println("Nome: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }
}
