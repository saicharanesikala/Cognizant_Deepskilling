
public class Finanacial_Forcasting {
    
    public static double growthresult(int periods, double growthrate, double principal_Amount) {
     
        if(periods == 0) {
            return principal_Amount;
        }
      
        return growthresult(periods - 1, growthrate, principal_Amount) * (1 + growthrate);
    }
    
    public static void main(String[] args) {
        
        double startingAmount = 1999.0;
        int time = 5;
        double rateofreturn = 0.35;
        
        double projected_Value = growthresult(time, rateofreturn, startingAmount);
        System.out.printf("Projected investment value after %d years--> $%.2f\n", time, projected_Value);
    }
}