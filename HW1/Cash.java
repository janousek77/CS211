public class Cash implements Asset {
  private double amount;

  public Cash(double amount) {
    this.amount = amount;
  }

  public double getMarketValue() {
    return amount;
  }

  public double getProfit() {
    return 0.0;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void deposit(double amount) {
     this.amount += amount;
  }

  public double distribute(double amount) {
     if (amount <= this.amount) {
        this.amount -= amount;
        return amount;
     }
     return 0.0;
  }

  public String toString(){
   return "Cash $" + this.amount;
  }

  public boolean equals(Cash c){
    return c.amount == amount;
  }
}
