package Controller;

import Materia.Models.NodeGeneric;
import Models.Contact;
import Models.LinkedList;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }
    public void addContact(Contact<?, ?> contact){
        contacts.appendToTail(contact);
    }
    public void printList(){
        contacts.print();
    }
    public Contact<?,?> findContactByName(String name){
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;//no se encontro un contacto con ese nombre
    }
    public void deleteContactByName(String name) {
        NodeGeneric<Contact<?,?>> current = contacts.getHead();
        if (current!= null) 
            return;
            //caso 1 que el contacto sea head 
        if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize(contacts.getSize() - 1);
            return;
        }


            //caso 2 en el resto
        while (current.getNext() != null) {
            if (((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext());
                contacts.setSize(contacts.getSize() -1);
                return;
            }
        }

    }
}
