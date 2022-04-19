public class Main {
    public static void main(String[] args) {
		
		List list = new List(18,null);
		list.head = list;
		list.add(19);
		list.add(45);
		list.add(12);
				
		list.display();
	}
    
}
