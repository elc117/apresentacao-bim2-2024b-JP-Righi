public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe
        SharedObjectExample sharedObject = new SharedObjectExample(10);
        
        // Exibindo o valor inicial
        System.out.println("Valor inicial: " + sharedObject.getValue());

        // Atualizando o valor
        sharedObject.updateValue(20);
        System.out.println("Valor atualizado: " + sharedObject.getValue());
    }
}
