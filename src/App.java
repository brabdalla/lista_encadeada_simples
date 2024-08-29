public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Primeira Lista");

        LinkedList minhaLista = new LinkedList();

        minhaLista.inserirOrdenado(1);
        minhaLista.inserirOrdenado(2);
        minhaLista.inserirOrdenado(5);
        minhaLista.inserirOrdenado(15);
        //minhaLista.apagarNode(5);
        minhaLista.inserirOrdenado(12);
        minhaLista.inserirOrdenado(8);
        //minhaLista.apagarNode(20);

        minhaLista.imprimirLista();
    }
}
