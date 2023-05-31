public class Besitzer{
  private double geld;
  private String name;
  private Roller roller;
  private final double literpreis;
  
  public Besitzer(double geld, String name, Roller roller){
    this.geld = geld;
    this.name = name;
    this.roller = roller;
    this.literpreis = 1.5;
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
      geld = geld - menge * literpreis;
    }
  }
  public void erhalteTaschenGeld(double summe){
    geld = geld + summe;
  }
  public String getName() {
      return name;
  }
}
