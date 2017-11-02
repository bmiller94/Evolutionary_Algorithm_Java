package brandon.evolutionaryalgorithm;

import java.util.Random;

public class Population {
	
	//CREATE POPULATION ARRAY mainPopArr
	public static int[][] mainPopArr = new int[Config.popSize][Config.n];
	
	//FILL mainPopArr WITH RANDOM BINARY
	public static void fillPopArr(){
		Random rand = new Random();
		for (int i = 0; i < Config.popSize; i++){
			for (int j = 0; j < 500; j++){
				Population.mainPopArr[i][j] = rand.nextInt(2) + 0;
			}
		}
	}
	
	public static void swapRandom(){
			Random rand = new Random();
			
			int randPop = 0;
			int hi = 0;
			int lo = 500;
			int hiind = 0;
			int loind = 0;										//System.out.println("\n" + pop1 + "- pop1, " + pop2 + "- pop2, " + indexToSwap + "@index");
																//System.out.println("\n" + Population.mainPopArr[pop1][indexToSwap] + ", " + Population.mainPopArr[pop2][indexToSwap]);
			for(int x = 0; x < Config.popSize; x++){
				if(Fitness.fitnessArr[x] > hi){
					hi = Fitness.fitnessArr[x];					//finds highest fitness of current gen
					hiind = x;
				}
			}
			for(int x = 0; x < Config.popSize; x++){
				if(Fitness.fitnessArr[x] < lo){					//finds lowest fitness of current gen
					lo = Fitness.fitnessArr[x];
					loind = x;
				}
			}
			System.out.println(hi + " @" + hiind + ", " + lo + " @" + loind);
			for(int y = 0; y < (Config.n / 2); y++){
				randPop = rand.nextInt(Config.n) + 0;
				int temp = mainPopArr[loind][y];
				mainPopArr[loind][y] = mainPopArr[loind][randPop];
				mainPopArr[loind][randPop] = temp;
				//System.out.print(temp);	
			}
	}
}
