public class LinkLst <T> {
    public Node head;

    public class Node {
        public Node next;
        public T value;

    }

    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node node = head;
        while (node != null) {
            sb.append(node.value);
            sb.append('\n');
            node = node.next;
        }
        return sb.toString();
    }

    public void reverse() {
        Node node = head;
        Node temp;
        Node previous = null;

        while (node != null) {
            temp = node.next;
            node.next = previous;
            previous = node;
            node = temp;
        }
        head = previous;
    }
}
