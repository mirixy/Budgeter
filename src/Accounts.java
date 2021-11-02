import java.util.Scanner;

public class Accounts {

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

    public void set_Account() {
        Scanner sc = new Scanner(System.in);
        boolean select = true;
        while(select){
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
                case "Microsoft_Office":
                    Microsoft_Office = 10;
                    System.out.println("Added Office!");
                    break;
                case "exit":
                    select = false;
                    break;
                default:
                    System.out.println("Invalid input! Please retry... ");
            }

            total = Netflix + AdobeCC + Rent + Spotify + Gas + Electricity + Car_insurance + Gasoline + insurances + Lingq + Amazon + Microsoft_Office;

        }

    }

    public int get_total() {
        return total;
    }

}
