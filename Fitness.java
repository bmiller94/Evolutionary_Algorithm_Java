package brandon.evolutionaryalgorithm;

public class Fitness {
	
	public static int[] fitnessArr = new int[Config.popSize];

	public static void Check(){
		
		for (int a = 0; a < Config.popSize; a++){
			Fitness.fitnessArr[a] = 0;
		}
		
		for (int i = 0; i < Config.popSize; i++){	
			for (int j = 0; j < Config.n; j++){
				if(Population.mainPopArr[i][j] == 1){
					Fitness.fitnessArr[i] ++;
				}
			}
//			System.out.print(Fitness.fitnessArr[i] + ", ");
		}
	}
	
}
