import java.util.Scanner;

public class Money {
    Scanner sc = new Scanner(System.in);
    private int bank;
    private int wage;

    public void set_bank(){
        System.out.print("Please provide your bank value: ");
        bank = sc.nextInt();
    }

    public int get_bank() {
        return bank;
    }

    public void set_wage() {
        System.out.print("Please provide your wage: ");
        wage = sc.nextInt();
    }

    public int get_Wage() {
        return wage;
    }
}
