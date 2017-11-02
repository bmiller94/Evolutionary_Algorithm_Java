package brandon.evolutionaryalgorithm;

import java.io.*;
import java.util.Properties;

public class Config {
	
	public static String selectionMethod = "";
	public static String selectionTournamentSize = "";
	public static String mutationMethod = "";
	public static String mutationRate = "";
	public static String crossoverMethod = "";
	public static String crossoverRate = "";
	public static String replacementMethod = "";
	public static String fitness = "";
	public static int n = 0;
	public static int popSize = 0;
	public static String maxGenerations = "";
	
	public static void readConfig(){
		Properties prop = new Properties();
		InputStream inp = null;

		try {
			inp = new FileInputStream("bea.cfg");
			prop.load(inp);

			selectionMethod = prop.getProperty("SelectionMethod");
			selectionTournamentSize = prop.getProperty("SelectionTournamentSize");
			mutationMethod = prop.getProperty("MutationMethod");
			mutationRate = prop.getProperty("MutationRate");
			crossoverMethod = prop.getProperty("CrossoverMethod");
			crossoverRate = prop.getProperty("CrossoverRate");
			replacementMethod = prop.getProperty("ReplacementMethod");
			fitness = prop.getProperty("Fitness");
			n = Integer.parseInt(prop.getProperty("n"));
			popSize = Integer.parseInt(prop.getProperty("popSize"));
			maxGenerations = prop.getProperty("maxGenerations");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if (inp != null) {
				try {
					inp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
