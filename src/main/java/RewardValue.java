public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    //RewardValue must convert from miles to cash at a rate of 0.0035.
    public double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    public int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }
}
