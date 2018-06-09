package übungsblatt8;

//Aufgabe 31b

import java.util.zip.DataFormatException;
import java.util.ArrayList;

public class BuchContainer {

public void linkBuch(Buch buch) throws DataFormatException {
  if (contains(buch)) {
    new DataFormatException("schon vorhanden");
  }else {
    this.add(buch);
  }
}
}
