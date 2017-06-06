package tool_class;

public class Interpreter {

	//this is the big guy, where user commands are interpreted and methods are called accordingly
	public static void lookInto(String userInput) {

		System.out.println();
		//breaking the input into separate words
		userInput = userInput.toLowerCase();
		String[] deconstructed = userInput.split(" ");
		if(deconstructed.length < 1 || userInput.equals("")) {
			System.out.println("Please write something.");
			return;
		}

		//HO-LY shitballs, batman! That's a hell of a switch case.
		switch(deconstructed[0]) {

		case "sudo":
		case "save":
			if(deconstructed.length > 1) {
				String saveName = "";
				for(int i = 1; i < deconstructed.length; i++) {
					saveName += deconstructed[i];
				}
				Loader.saveState(saveName);
			} else {
				System.out.println("Please include savestate name.");
			}
			break;

		case "hara":
			/* Did you know? Seppuku (sepukku?), while similar and often said instead of hara
			 * kiri, is an entirely different ritual, in which a dishonored samurai writes a
			 * last haiku, drink two sips of sake and cut open their stomach using their own
			 * sword, from left to right, as it was believed that was where the spirit resided.
			 * Then, before they can show pain, a trusted friend cuts off their head in a
			 * single blow. Harai kiri, on the other hand, is a ritualistic suicide, but
			 * performed by a commoner intead of a samurai. The more you know...
			 */
			if(deconstructed.length == 2 && deconstructed[1].equals("kiri")) {
				EXE.gameData.pl.kill();
			} else {
				System.out.println("Say it right...");
			}
			break;

		case "n": case "north"://z++
			//needs checks here to see if moving is possible
			EXE.gameData.pl.move(0,0,1);
			break;

		case "e": case "east"://x++
			//needs checks here to see if moving is possible
			EXE.gameData.pl.move(1,0,0);
			break;

		case "w": case "west"://x--
			//needs checks here to see if moving is possible
			EXE.gameData.pl.move(-1,0,0);
			break;

		case "s": case "south"://z--
			//needs checks here to see if moving is possible
			EXE.gameData.pl.move(0,0,-1);
			break;

		case "u": case "up"://y++
			//needs checks here to see if moving is possible
			EXE.gameData.pl.move(0,1,0);
			break;

		case "d": case "down"://y--
			//needs checks here to see if moving is possible
			EXE.gameData.pl.move(0,-1,0);
			break;

		case "take": case "pick":
		case "look":
			int[] xyz = EXE.gameData.pl.where();
			System.out.println(EXE.gameData.map[xyz[0]][xyz[1]][xyz[2]].describe());
			break;

		case "i": case "inv": case "inventory":
		}
	}
}