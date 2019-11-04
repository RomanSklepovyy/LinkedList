public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {}

    /* Додати елемент в кінець списку */
    public void add(Integer data) {

        Node node = new Node();
        node.setData(data);

        if (first == null)
        {
            first = node;
            last = node;
        }
        else
        {
            last.setNext(node);
            last = node;
        }
    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {


        Node currentNode = first;
        int i = -1;

        while (currentNode != null)
        {
            i++;

            if (i == index)
            {
                return currentNode.getData();
            }

            currentNode = currentNode.getNext();
        }

        return null;

    }

    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {

        Node previousNode = null;
        Node currentNode = first;
        int i = 0;

        while (currentNode != null)
        {
            if (i == index)
            {
                if (previousNode != null)
                {
                    previousNode.setNext(currentNode.getNext());

                    if (currentNode.getNext() == null)
                    {
                        last = previousNode;
                    }
                }
                else
                {
                    first = first.getNext();

                    if (first == null)
                    {
                        last = null;
                    }
                }

                return true;
            }

            i++;
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        return false;
    }

    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {

        Node currentNode = first;
        int i = 0;
        while (currentNode != null)
        {
            i++;
            currentNode = currentNode.getNext();
        }

        return i;
    }

}
