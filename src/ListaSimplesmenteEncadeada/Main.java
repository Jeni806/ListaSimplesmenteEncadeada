package ListaSimplesmenteEncadeada;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws SLinkedList.EmptySLinkedList {
        SLinkedList s = new SLinkedList();
        System.out.println("Adicionando elementos à cabeça da lista:");
        s.addHead("BOS");
        System.out.println(s);
        s.addHead("ATL");
        System.out.println(s);
        s.addHead("MSP");
        System.out.println(s);
        s.addHead("LAX");
        System.out.println(s);
        System.out.println("\nAdicionando elementos à cauda da lista:");
        SLinkedList t = new SLinkedList();
        t.addTail("MSP");
        System.out.println(t);
        t.addTail("ATL");
        System.out.println(t);
        t.addTail("BOS");
        System.out.println(t);
        t.addTail("MIA");
        System.out.println(t);
        System.out.println("\nRemovendo o primeiro elemento da lista:");
        t.removeFirst();
        System.out.println(t);
        t.removeFirst();
        System.out.println(t);
        t.removeFirst();
        System.out.println(t);
        t.removeFirst();
        System.out.println(t);

        t.removeFirst();

    }
}