public class List {
    int value;
    List next;
    List head;
/*Copy over your list class.
We want to add a couple things.
We want a function to add things to the end of the list
We want a function to delete things from the list.
We want a function to return the list in order.*/
    public List (int newValue, List newNext){
        value = newValue;
        next = newNext;
    }

    public void add(int value) {
        List newNode = new List(value,null);
        newNode.value = value;
        newNode.next = null;

        if (head == null){
            head = newNode;
        }
        else {
            List temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
    }

    public void delete(int index){
        if (index == 0){
            head = head.next;
        }
        else {
            List temp = head;
            for (int i = 0; i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }


    public void display(){

        List temp = head;
        while(temp.next != null){

            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println (temp.value);

    }



}
