package aufgabe35a;

import java.util.*;
import java.util.zip.DataFormatException;

public class GeometricObjectContainer implements Iterable<GeometricObject> {

	private static GeometricObjectContainer unique = null;
	private ArrayList<GeometricObject> objects;
	
	private GeometricObjectContainer () {
		objects = new ArrayList<GeometricObject>();
	}
	
	public static GeometricObjectContainer instance() {
		return unique == null ? (unique = new GeometricObjectContainer()) : unique;
	}
	
	public void linkObject(GeometricObject o) throws DataFormatException{
		if (objects.contains(o)) throw new DataFormatException("Already added");
		
		objects.add(o);
	}
	
	public void unlinkObject(GeometricObject o) {
		objects.remove(o);
	}
	
	@Override
	public Iterator<GeometricObject> iterator() {
		return objects.iterator();
	}
}

abstract class GeometricObject {}
