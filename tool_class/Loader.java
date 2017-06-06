package tool_class;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import resources.*;

public class Loader implements Serializable {

	private static final long serialVersionUID = 7987777418072665500L;
	
	//general fields. public because used in main by all tool classes
	public Room[][][] map;
	public Item[] itemRepo;
	public Player pl;

	//Loader reads the data from a file to pull the adventure into the engine
	public Loader(String filePath) {
	}

	/*if no pathis specified, this constructor is called and a test room is
	 *created, showing an error message and apologizing to the player
	 */
	public Loader(){
		map = new Room[1][1][1];
		map[0][0][0] = new Room("Error ocurred: no game data loaded.\nTo exit, type 'hara kiri'");
		itemRepo = new Item[0];
		pl = new Player("");
	}

	//save the gamestate in a textfile inside the jar
	public static void saveState(String fileName) {
		FileOutputStream git;
		ObjectOutputStream oot = null;
		try {
			git = new FileOutputStream(fileName);
			oot = new ObjectOutputStream(git);
			oot.writeObject(EXE.gameData);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oot.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
	
	public static void loadState(String filename) {
		
	}
}