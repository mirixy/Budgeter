import java.util.Scanner;

public class Accounts {
    // All Variables, set to private
    private int Netflix;
    private int AdobeCC;
    private int Rent;
    private int Spotify;
    private int Gas;
    private int Electricity;
    private int Car_insurance;
    private int Gasoline;
    private int insurances;
    private int Lingq;
    private int Amazon;
    private int Microsoft_Office;
    private int total;

    /* Set all Values for the variables and calculate the total value */
    public void set_Account() {
        Scanner sc = new Scanner(System.in);
        boolean select = true;
        // Loop through the Switch Cases as long select is true
        while(select){
            System.out.println();
            System.out.println("Services: Netflix, AdobeCC, Rent, Spotify, Gas, Electricity, Car_Insurance, Gasoline, insurances, Lingq, Amazon, Microsoft, Office");
            System.out.print("Please enter a Service or exit: ");
            String name = sc.nextLine();
            switch(name){
                case "Netflix":
                    Netflix = 13;
                    System.out.println("Added Netflix!");
                    break;
                case "AdobeCC":
                    AdobeCC = 12;
                    System.out.println("Added Creative Cloud!");
                    break;
                case "Rent":
                    Rent = 370;
                    System.out.println("Added Rent!");
                    break;
                case "Spotify":
                    Spotify = 10;
                    System.out.println("Added Spotify!");
                    break;
                case "Gas":
                    Gas = 134;
                    System.out.println("Added Gas!");
                    break;
                case "Electricity":
                    Electricity = 69;
                    System.out.println("Added Electricity!");
                    break;
                case "insurances":
                    insurances = 30;
                    System.out.println("Added Insurances!");
                    break;
                case "Car_Insurance":
                    Car_insurance = 30;
                    System.out.println("Added Car Insurance!");
                    break;
                case "Gasoline":
                    Gasoline = 60;
                    System.out.println("Added Gasoline!");
                    break;
                case "Lingq":
                    Lingq = 12;
                    System.out.println("Added Lingq!");
                    break;
                case "Amazon":
                    Amazon = 8;
                    System.out.println("Added Amazon!");
                    break;
                case "Microsoft":
                case "Office":
                case "Microsoft Office":
                    Microsoft_Office = 10;
                    System.out.println("Added Office!");
                    break;
                case "calculate":
                    total = Netflix + AdobeCC + Rent + Spotify + Gas + Electricity + Car_insurance + Gasoline + insurances + Lingq + Amazon + Microsoft_Office;
                    System.out.println("So far your total is: " + total );
                case "exit":
                    select = false;
                    break;
                default:
                    System.out.println("Invalid input! Please retry... ");
            }

            total = Netflix + AdobeCC + Rent + Spotify + Gas + Electricity + Car_insurance + Gasoline + insurances + Lingq + Amazon + Microsoft_Office;

        }

    }
    // Get the total costs of all selected Services
    public int get_total() {
        return total;
    }

}
