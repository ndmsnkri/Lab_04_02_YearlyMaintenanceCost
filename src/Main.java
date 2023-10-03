public class Main {
    public static void main(String[] args)
    {
            // Define maintenance costs for each season
            double springCost = 500.00;
            double summerCost = 300.00;
            double autumnCost = 400.00;
            double winterCost = 600.00;

            // Calculate the total yearly maintenance cost
            double totalYearlyCost = springCost + summerCost + autumnCost + winterCost;

            // Display the seasonal costs and the combined total
            System.out.println("Spring Maintenance Cost: $" + springCost);
            System.out.println("Summer Maintenance Cost: $" + summerCost);
            System.out.println("Autumn Maintenance Cost: $" + autumnCost);
            System.out.println("Winter Maintenance Cost: $" + winterCost);
            System.out.println("Total Yearly Maintenance Cost: $" + totalYearlyCost);

    }

}