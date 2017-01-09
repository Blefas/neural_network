package neural_network;

public class main {
	public static void main(String[] args) {
		int[] truc = {1,5,3};
		neurone neurone1 = new neurone(5);
		neurone1.getNb_entree();
		network test = new network(3,truc);
		test.getNb_neurone();
	}
}
