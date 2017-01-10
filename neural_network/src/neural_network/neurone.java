package neural_network;

public class neurone {
	
	private int id_neurone;
	private int nb_entree = 0;
	private double[] poids;
	
	
	public neurone(int id, int nb_entre){
		double w = 0;
		id_neurone = id;
		nb_entree = nb_entre;
		poids = new double[nb_entree]; 
		for (int i=0; i<nb_entree; i++){
			w = Math.random();
			poids[i]=w;
		}
	}
	
	public int getNb_entree(){
		return nb_entree;
	}
	public double[] getPoids(){
		return poids;
	}
	
	public double sigmoid(double x){
		return 1.0/(1+Math.exp(-x));
	}
	
	public double sortie(double[] valeurs){
		double tmp = 0;
		for (int i=0;i<nb_entree;i++){
			double xi = poids[i]*valeurs[i];
			tmp += xi;
		}
		return sigmoid(tmp);
	}
}
