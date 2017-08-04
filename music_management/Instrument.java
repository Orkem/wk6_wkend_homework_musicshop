package music_management;
import behaviours.*;

public abstract class Instrument implements Playable{

  InstrumentColour colour;
  InstrumentType type;

  public Instrument(InstrumentColour colour, InstrumentType type){

    this.colour = colour;
    this.type = type;

  }
  public abstract String play();
}