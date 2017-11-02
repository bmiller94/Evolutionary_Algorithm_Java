package brandon.evolutionaryalgorithm;

public class EvolutionaryAlgorithm {

	public static void main(String[] args) {
		Config.readConfig();
		//FILL mainPopArr WITH RANDOM BINARY
		Population.fillPopArr();
		
		int count = 0;
		
		for (int i = 0; i < 100; i++){
			for (int j = 0; j < 500; j++){
//				System.out.print(Population.mainPopArr[i][j]);
			}
					//CONSOLE DEBUG OUT
//					System.out.print(" --- " + count + "\n");
//					count++;
		}
		
		for(int x = 0; x < (.8 * Config.n); x++){
			Fitness.Check();
			Population.swapRandom();
		}
		
	}

}
