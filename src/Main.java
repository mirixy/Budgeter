public class Main {
    public static void main(String[] args){
        /* Instantiate Objects */
        Accounts ac = new Accounts();
        Money mn = new Money();
        // Set the value of the bank account
        mn.set_bank();
        // Set the value of the wage
        mn.set_wage();
        // Select all Accounts that needs to be calculated
        ac.set_Account();
        // Output
        System.out.println("Costs: " + ac.get_total() + " Income: " + (mn.get_bank() + mn.get_Wage()));
        System.out.println("Total Money after deduction: " +(mn.get_bank() - ac.get_total() + mn.get_Wage()) );
    }

}
