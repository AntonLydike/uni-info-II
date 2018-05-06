package aufgabe16b;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class Directory {
	private ArrayList<File> fileelements;
	private ArrayList<Directory> directoryelements;
	
	public ArrayList<File> getLinkFilelement() {
		return fileelements;
	}
	
	public void linkFileelement(File f) throws DataFormatException{
		if (checkFileelement(f)) {
			fileelements.add(f);
		} else {
			throw new DataFormatException("Folder alredy contains that file.");
		}
	}
	
	private boolean checkFileelement(File f) {
		return !fileelements.contains(f);
	}
	
	public void unlinkFileelement(File f) {
		fileelements.remove(f);
	}
	
	public ArrayList<Directory> getlinkDirectoryelement() {
		return directoryelements;
	}
	
	public void linkDirectoryelement(Directory d) throws DataFormatException{
		if (checkDirectoryelement(d)) {
			directoryelements.add(d);
		} else {
			throw new DataFormatException("Folder alredy contains that folder.");
		}
	}	
	
	private boolean checkDirectoryelement(Directory d) {
		return !directoryelements.contains(d);
	}
	
	public void unlinkDirectoryelement(Directory d) {
		directoryelements.remove(d);
	}
	
}


