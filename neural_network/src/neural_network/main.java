package neural_network;

public class main {
	public static void main(String[] args) {
		int[] truc = {1,5,3};
		int[] autreTruc = {1,3,5,8,9};
		neurone neurone1 = new neurone(1,5);
		System.out.println(neurone1.getNb_entree());
		double[] poids = neurone1.getPoids();
		for (int i=0;i<poids.length;i++){
			System.out.println("Poids de l'entrée "+i+" = "+poids[i]);
		}
		
		network test = new network(3,truc);
		neurone[][] couches = test.getCouche();
		for (int j=0;j<couches.length;j++){
			for (int i=0;i<couches[j].length;i++){
				System.out.println(couches[j][i].getNb_entree());
			}
		}
		
	}
}
