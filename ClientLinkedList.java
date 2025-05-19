package linkedList;

import java.util.Scanner;

public class ClientLinkedList {

	public static void main(String[] args) {
		SingleLinked_List l = new SingleLinked_List();
		Scanner sc = new Scanner(System.in);
		
		int option = 0,value;
		
		do {
			System.out.println(">>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<");
			System.out.println("\n 1.Create Node"+
								"\n 2.Add first"+
								"\n 3.Add Last"+
								"\n 4.Add Mid"+
								"\n 5.Count Linked List"+
								"\n 6.Delete From Start"+
								"\n 7.Delete From Last"+
								"\n 8.Delete From MID"+
								"\n 9.Update value"+
								"\n 10. Reverse List"+
								"\n 11.display"+
								"\n 12.findMax"+
								"\n 13.findOccurence"+
								"\n 0.exit");
			System.out.println("Enter your choice:: ");
			option=sc.nextInt();
			
			switch(option) {
			case 1:
				Node newnode = l.createNewNode();
				l.setHead(newnode);
				System.out.println("\n Linked List created...............");
				break;
			case 2: 
				l.addstart();
				break;
			case 3:
				l.addlast();
				break;
			case 4: 
				System.out.println("Enter Element ::");
				value = sc.nextInt();
				l.AddMid(value);
				break;
			case 5:
				l.getCount();
				break;
			case 6: 
				l.deletefromstart();
				break;
			case 7: 
				l.deletefromend();
				break;
			case 8: 
				System.out.println("Enter Element ::");
				value = sc.nextInt();
				l.deletefrommid(value);
				break;
			case 9: 
				System.out.println("Enter Element ::");
				value = sc.nextInt();
				l.updatevalue(value);
				break;
			case 10:
				l.reverselist();
				break;
			case 11:
				System.out.println("...................................");
				l.display();
				System.out.println("...................................");
				break;
			case 12:
				l.findmax();
				break;
			case 13:
				System.out.println("Enter value ::");
				value = sc.nextInt();
				l.findOccurence(value);
				break;
			case 0:
				System.out.println("End.....................");
				System.exit(0);
			
			}
		}while(option != 0);

	}

}
