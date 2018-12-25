package aplication.client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client("Maria", "maria@gamil.com");
		Client c2 = new Client("Maria", "alex@gamil.com");
		
		System.out.println(c1.equals(c2));
	}

}
