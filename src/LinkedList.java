/**
 * LinkedList
 */
public class LinkedList {

Node head;

public LinkedList(){
    this.head = null;
}

public void inserir (int data ){
    Node novoNo = new Node(data);
    if (head == null) {
        this.head = novoNo;
    }else{
        Node atual = this.head;
        while (atual.next != null) {
            atual = atual.next;
        }
        atual.next = novoNo;
    }
}

public void inserirOrdenado (int data ){
    Node novoNo = new Node(data);
    if (head == null) {
        this.head = novoNo;
    }else{
        Node atual = this.head;
        Node anterior = null;
        if (data <= atual.data) {
            novoNo.next = atual;
            this.head = novoNo;
            
        }else{
            while (atual != null && atual.data < data) {
                anterior = atual;
                atual = atual.next;
            }
            anterior.next = novoNo;
            novoNo.next = atual;

        }

        
    }
}



public void imprimirLista(){
    Node atual = head;

    while (atual != null) {
        System.out.println(atual.data);
        atual = atual.next;
        
    }

    System.out.println("Fim Lista");

}

public void apagarNode(int data){
    Node atual = this.head;
    Node anterior = null;

    if (head == null) {
        System.out.println("A Lista está vazia");
    }else{

        while (atual.data != data) {
            anterior = atual;
            atual = atual.next;
        }
    
        anterior.next = atual.next;
    }
    

}

}