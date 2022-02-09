import java.util.Objects;

public class LinkedList<T> {
    public static void main(String[] args) {

        LinkedList m = new LinkedList();
        LinkedList n = new LinkedList();
        m.addElement("A");
        System.out.println(m);
        m.addElement("B");
        System.out.println(m);
        m.addElement("C");
        System.out.println(m);
        m.addElement("D");
        System.out.println(m);
        m.addElement("E");
        System.out.println(m);
        m.addElement("F");
       m.addElementByIndexs(2,"90");
        System.out.println(m+"посмотри на меня");


      //  System.out.println("element po indexs 1 = B : "+ m.getElementByIndex(3));



        n.addFirst(89);
       // System.out.println("first 1 element"+ n  );
        n.addFirst(90);
        //System.out.println("first 2 element"+ n);
        //System.out.println(m.getSize() +" 'nj getsizzz");


    }

    private int size = 0;

    private Node<T> last;

    private Node<T> first;

    @Override
    public String toString() {
        return "LinkedList{" +
                "size=" + size +
                ", last=" + last +
                ", first=" + first +
                "}\r\n\r\n";
    }

    private class Node<T> {
        public Node<T> preElement;
        public T currentElement;
        public Node<T> nextElement;

        public Node(Node<T> preElement, T currentElement, Node<T> nextElement) {
            this.preElement = preElement;
            this.currentElement = currentElement;
            this.nextElement = nextElement;
        }

        public Node<T> getPreElement() {
            return preElement;
        }

        public void setPreElement(Node<T> preElement) {
            this.preElement = preElement;
        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        @Override
        public String toString() {
            String test = " Node{\r\n";
            if (preElement != null) {
               test += "preElement=" + preElement.currentElement;
            } else {
                test += "preElement= null";
            }
            test += "\r\n, currentElement=" + currentElement + "\r\n";
            if (nextElement != null) {
               test += ", nextElement=" + nextElement.currentElement;
            } else {
                test += ", nextElement=null";
            }
            test += "}\r\n";

            /*return "Node{" +
                    "preElement=" + (preElement!=null) ? preElement.toString() : "" +
                    ", currentElement=" + currentElement +
                    ", nextElement=" + nextElement.toString() +
                    '}';*/
            return test;
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkedList)) return false;
        LinkedList<?> that = (LinkedList<?>) o;
        return size == that.size && Objects.equals(last, that.last) && Objects.equals(first, that.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, last, first);
    }


    public void addElement(T t) { // он же получается и addLast()
        if (size == 0) {
            first = new Node(null, t, null);

            last = first;

        } else if (size > 0) {
            Node pre = last;
            last = new Node(pre, t, null);
            pre.setNextElement(this.last);

        }
        size++;

    }
    public void addFirst(T t){
        if (size==0){
            first = new Node(null,t,null);
            last=first;
        }
        else if (size>0){
            Node pre = first;
            first = new Node(first,t,null);
            pre.setNextElement(this.first);
        }
        size++;
    }

    public void addElementByIndexs(int index, T t){
        if (index>size){
            System.out.println("Добавьте значение меньше ");
        } else if (index <=size){
            Node pre = first;
            for (int i = 0; i < index; i++){
               
                size++;
            }
        }
    }



    public int getSize(){
        return size;
    }
    public Node getFirst(){
        return first;
    }

    public Node getLastElement(){
        return last;
    }

    public void removeFirstElement(){

    }

    /* public T getElementByIndex ( int index){
        Node<T> result = first;
        for (int i = 0; i < index; i++){
            result = getNextElement(result);
            System.out.println(result);
        }
        return  result.getCurrentElement();
    }

    private Node<T> getNextElement(Node<T> current){
        return current.getNextElement();
    }*/



}

