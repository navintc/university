class Node:
    def __init__(self, data):
        self.data =  data
        self.next = None
        
class LinkedList:
    def __init__(self):
        self.head = None
        
    def push(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node
        
    def append(self, new_data):
        new_node = Node(new_data)

        #checks if the linked list is empty
        if self.head is None:
            self.head = new_node
            return

        #going through the linked list to find the
        #last node
        last = self.head
        while (last.next):
            last = last.next

        #assign the new node as the last node
        last.next = new_node
        
    def append(self, new_data):
        new_node = Node(new_data)

        #checks if the linked list is empty
        if self.head is None:
            self.head = new_node
            return

        #going through the linked list to find the
        #last node
        last = self.head
        while (last.next):
            last = last.next

        #assign the new node as the last node
        last.next = new_node
        
    def insertAfter(self, prev_node, new_data):
        if prev_node is None:
            print("The given previouse node must in linked list")
            return
        new_node = Node(new_data)
        new_node.next = prev_node.next
        prev_node.next = new_node
        
    def printList(self):
        temp = self.head
        while (temp):
            print(temp.data , end = " ")
            temp = temp.next
            
            
            
            
            
            
if __name__ == '__main__':
    llist = LinkedList()
    llist.append(1)
    llist.push(2)
    llist.push(3)
    llist.append(4)
    llist.insertAfter(llist.head.next, 5)
    
    print ("created linked list is: ")
    llist.printList()
        
