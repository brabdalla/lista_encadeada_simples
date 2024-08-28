public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Primeira Lista");

        LinkedList minhaLista = new LinkedList();

        minhaLista.inserir(10);
        minhaLista.inserir(20);
        minhaLista.inserir(5);
        minhaLista.inserir(15);
        minhaLista.apagarNode(5);
        minhaLista.inserir(12);
        minhaLista.inserir(8);
        minhaLista.apagarNode(20);

        minhaLista.imprimirLista();
    }
}
