package music_management;

public class Guitar extends Instrument{

  private int numberStrings;

  public Guitar(int numberStrings, InstrumentType type, InstrumentColour colour ){
    super(colour, type);
    this.numberStrings = numberStrings;
  }

  public String play(){
    return "Strum";
  }

  public abstract int calculateMarkUp(int wholesale, int retail);

  // public int calculateMarkUp(int wholesale, int retail){
  //   return retail - wholesale;
  // }
}