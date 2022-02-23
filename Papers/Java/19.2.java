// Q1
// Telco.java-

public class telco {
    String accNumber;
    int callDuration;
    double unitCharge;
    double monthlyBill;
    
    public telco(){
        this.accNumber = "";
        this.callDuration = 0;
        this.unitCharge = 0.0;
        this.monthlyBill = 0.0;  
    }
    
    public telco(String accNumber, int callDuration, double unitCharge){
        this.accNumber = accNumber;
        this.callDuration = callDuration;
        this.monthlyBill = 0;
        this.unitCharge = unitCharge;
    }
    
    public void calculateBill(){
        this.monthlyBill = this.unitCharge * this.callDuration;
    }
    
    public void displayBill(){
        System.out.println("Account number: " + this.accNumber);
        System.out.println("Bill: " + this.monthlyBill);
    }
       
}

// Masin.java
public class main {
    public static void main(String[] args){
        telco obj1 = new telco("fucer", 1000, 0.5);
        telco obj2 = new telco("bich lasanya", 1000, 0.5);
        
        obj1.calculateBill();
        obj1.displayBill();
    }  
}
