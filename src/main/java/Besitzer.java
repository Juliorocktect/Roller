public class Besitzer{
  private double geld;
  private String name;
  private Roller roller;
  
  public Besitzer(double geld, String name, Roller roller){
    this.geld = geld;
    this.name = name;
    this.roller = roller;
  }
  public double getGeld(){
    return geld;
  }
  public void fahreDeinenRoller(int strecke){
    roller.fahre(strecke);
  }
  public void tankeDeinenRoller(double menge){
    if (roller.passtInTank(menge)){
      roller.tanke(menge);
    }
  }
  public void erhalteTaschenGeld(double summe){
    geld = geld + summe;
  }
  public String getName() {
      return name;
  }
}
