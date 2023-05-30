
public class Roller{
  private double tankgroesse;
  private int kilometerstand;
  private double tankinhalt;
  
  public Roller(double tankgroesse, int kilometerstand, double tankinhalt){
    this.tankgroesse = tankgroesse;
    this.kilometerstand = kilometerstand;
    this.tankinhalt = tankinhalt;
  }
  
  public boolean tanke(double menge){
    if (menge + tankinhalt > tankgroesse){
      System.out.println("Zu Viel getankt");
      tankinhalt = tankgroesse;
      return false;
    }
    tankinhalt = tankinhalt + menge;
    return true;
  }
  public void fahre(int strecke){
    
    if (tankinhalt > strecke*2){
      tankgroesse = tankgroesse - strecke*2;
      kilometerstand = kilometerstand + strecke;
    }
    else if(tankinhalt < strecke*2){
      kilometerstand = kilometerstand + toInt(tankinhalt)*2;
      tankinhalt = 0;
      System.out.println("Tank ist leer");
    }

    
  }
  public boolean passtInTank(double menge){
    if (tankgroesse < tankinhalt + menge){
      return false;
    }
    return true;
  }
  public double getTankinhalt(){
    return tankinhalt;
  }
  public int getKilometerstand(){
    return kilometerstand;
  }
  public int toInt(double myDouble){
    return (int) Math.round(myDouble);
  }
}
