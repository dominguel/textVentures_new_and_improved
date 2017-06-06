package tool_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EXE {
	
	//public and static for universal access
	public static Loader gameData;
	
	public static void main(String[] args) {
		
		//WELCOME TO MY CODE, STRANGER
		
		gameData = new Loader();//instantiate data
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//open the flood gates
		
		while(gameData.pl.checkPulse()) {//dont want them to be dead anytime soon...
			
			try {
				//no checks beforehand? I guess this is why we have an extrapolated class
				Interpreter.lookInto(br.readLine());
			} catch (IOException e) {
				//lets see when this happens (hint: never)
				System.out.println("hey, you did a wrong");
			}
		}
		//endgame recap, anyone?
	}

}