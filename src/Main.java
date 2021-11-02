public class Main {
    public static void main(String[] args){
        Accounts ac = new Accounts();
        Money mn = new Money();
        mn.set_bank();
        mn.set_wage();
        ac.set_Account();
        System.out.println("Costs: " + ac.get_total() + " Income: " +mn.get_bank());
        System.out.println("Total Money after deduction: " +(mn.get_bank() - ac.get_total()) );
    }

}
