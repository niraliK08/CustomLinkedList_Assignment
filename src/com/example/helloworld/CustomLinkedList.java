package com.example.helloworld;

public class CustomLinkedList {

    private static class Node {
        String name;
        String description;
        int priority;
        Node next;

        public Node(String name, String description, int priority) {
            this.name = name;
            this.description = description;
            this.priority = priority;
            this.next = null;
        }

        private Node head;
        private int size;

        public CustomLinkedList() {
            this.head = null;
            this.size = 0;
        }

        //add to the linked list
        public void add(String name, String description, int priority) {
            Node newNode = new Node(name, description, priority);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }
        //delete from the linked list
        public void delete(String name) {
            if (head == null) {
                System.out.println("List is empty. Nothing to delete.");
                return;
            }

            if (head.name.equalsIgnoreCase(name)) {
                head = head.next;
                size--;
                return;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.name.equalsIgnoreCase(name)) {
                    current.next = current.next.next;
                    size--;
                    return;
                }
                current = current.next;
            }

            //search for task
            public Node search(String name) {
                if (head == null) {
                    System.out.println("List is empty. No tasks to search.");
                    return null;
                }

                Node current = head;
                while (current != null) {
                    if (current.name.equalsIgnoreCase(name)) {
                        return current;
                    }
                    current = current.next;
                }

                System.out.println("Task with name " + name + " not found.");
                return null;
            }




        }
    }
}

