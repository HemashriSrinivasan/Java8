package java8;

@FunctionalInterface
interface Payment {
    double calBill(double amount);
    
    default double addBonus(double amt) {
    	return calBill(amt) + (amt) * 0.05;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Payment upi = amount -> amount *0.05; 
        Payment cash = amount -> amount *0.01; 
        Payment credit = amount -> amount *0.04; 
        Payment other = amount -> (amount *0.02); 

        double amount = 5000;
        
        System.out.println("UPI: " + upi.calBill(amount));
        System.out.println("Cash: " + cash.calBill(amount));
        System.out.println("Credit: " + credit.calBill(amount));
        System.out.println("Other: " + other.calBill(amount));
        System.out.println("Diwali Discount: " + upi.addBonus(amount));
        }
}
