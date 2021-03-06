
public class NestedLoops {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("I wish it was colder");
		}
		
		System.out.println("________________");
		
		String[] colors = {"Red", "Blue", "Green"};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(colors[i]);
		}
		
		System.out.println("________________");
		
		String[][] fancyColors = {{"Red", "Blue", "Green"},
				{"Cyan", "Magenta", "Turquoise"}
		};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(fancyColors[i][j]);
			}
		}
		
		System.out.println("________________");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("i: " + i + ", j: " + j);
			}
		}

	}

}
