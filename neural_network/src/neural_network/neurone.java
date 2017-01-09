package neural_network;

public class neurone {
	
	private int id_neurone;
	private int[] neurone_entree;
	private int nb_entree = 0;
	private double w = 0;
	private double[] poids;
	private double[] valeur_entree;
	private double sortie = 0;
	
	
	public neurone(int id, double[] neurone_valeur_entree, int[] neurone_ent){
		id_neurone = id;
		neurone_entree = neurone_ent;
		valeur_entree = neurone_valeur_entree;
		nb_entree = neurone_entree.length;
		valeur_entree = new double[nb_entree]; 
		poids = new double[nb_entree]; 
		for (int i=0; i<nb_entree; i++){
			w = Math.random();
			poids[i]=w;
		}
	}
	
	public neurone(int id, int nb_ent, double[] valeur_ent){
		id_neurone = id;
		nb_entree = nb_ent;
		valeur_entree = valeur_ent;
		poids = new double[nb_entree]; 
		for (int i=0; i<nb_entree; i++){
			w = Math.random();
			poids[i]=w;
		}
	}
	
	public void getNb_entree(){
		System.out.println(nb_entree);
	}
	public void getPoids(){
		for (int i=0; i<nb_entree; i++){
			System.out.println(poids[i]);
		}
	}
	public void getSortie(){
		System.out.println(sortie);
	}
	
	public void setEntree(double[] n){
		for (int i=0;i<nb_entree;i++){
			valeur_entree[i]=n[i];
		}
	}
	
	public double sigmoid(double x){
		return 1.0/(1+Math.exp(-x));
	}
	
	public void sortie(){
		double tmp = 0;
		for (int i=0;i<nb_entree;i++){
			double xi = poids[i]*valeur_entree[i];
			tmp = tmp + xi;
		}
		sortie = sigmoid(tmp);
	}
}
