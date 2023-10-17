package org.example;

public class Anchor
{
    public Element getHead() {
        return head;
    }

    Element head; //pierwszy element listy

    public Anchor() {
        this.head = null;
    }

    public boolean isEmpty()
    {
        return head == null; // czyli jesli nie ma takiego Elementu
    }
    public void insertAtTheFront(int x)
    {

    }
    public void insertAtTheEnd(int x)
    {
        Element current = new Element(x,null);
        if(isEmpty()) {
            current.setNext(current);
        }
        else
        {
            Element helpElement = getHead();
            while(helpElement.getNext() != null)
            {
                helpElement = helpElement.getNext();
            }
            helpElement.setNext(current);
        }
        head = current;
    }
    public void removeFirst()
    {

    }
    public void removeLast()
    {

    }
   public String toString()
    {

        return null;
    }
    public boolean equals(Object o)
    {

        return false;
    }
}




/*
insertAtTheFront(int x) - wstawiającą liczbę x na początek listy
insertAtTheEnd(int x) - wstawiającą liczbę x na koniec listy
removeFirst() - usuwającą pierwszy element listy
removeLast() - usuwającą ostatni element listy
toString() - zwracająca string reprezentujący daną listę
equals(Object o) - sprawdzającą, czy dwie listy zawierają dokładnie te same liczby w tym samym porządku; jeśli tak, ma ona zwracać true, w przeciwnym wypadku false
*/