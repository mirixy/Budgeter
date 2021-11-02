import java.util.Scanner;

public class Money {
    Scanner sc = new Scanner(System.in);
    // Initial variables set to private
    private int bank;
    private int wage;

    // set the value of the variable bank
    public void set_bank(){
        System.out.print("Please provide your bank value: ");
        bank = sc.nextInt();
    }
    // get the value of the variable bank
    public int get_bank() {
        return bank;
    }
    // set the value of the variable wage
    public void set_wage() {
        System.out.print("Please provide your wage: ");
        wage = sc.nextInt();
    }
    // get the wage
    public int get_Wage() {
        return wage;
    }

}
