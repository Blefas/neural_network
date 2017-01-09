package neural_network;

public class network {
	private int nb_couche;
	private int[] nb_neurone;
	private neurone[][] couche;
	public network(int c,int[] n){
		nb_couche = c;
		nb_neurone = n;
	}
	
	public void getNb_neurone(){
		for (int i=0; i<nb_neurone.length;i++){
			System.out.println(nb_neurone[i]);
		}
	}
	
	public void couche(){
		for (int j=1;j<nb_couche;j++){
			for (int i=0;i<nb_neurone[j];i++){
				couche[j][i] = new neurone(j+i,,);
			}
		}
	}
}
