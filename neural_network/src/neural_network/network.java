package neural_network;

public class network {
	private int nb_couche;
	private int[] nb_neurone;
	private neurone[][] couche;
	
	public network(int c,int[] n){
		nb_couche = c;
		nb_neurone = n;
		couche = new neurone[nb_couche][];
		for (int i=0;i<nb_couche;i++){
			couche[i] = new neurone[nb_neurone[i]];
		}
		for (int j=0;j<nb_couche;j++){
			for (int i=0;i<nb_neurone[j];i++){
				couche[j][i] = new neurone(j+i,nb_neurone[j]);
			}
		}
	}
	
	public int[] getNb_neurone(){
		return nb_neurone;
	}
	
	public neurone[][] getCouche(){
		return couche;
	}
	
}
