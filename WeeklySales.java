package package3;

public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = new Salesperson[4];
        salesStaff[0] = new Salesperson("Canandra", "Eka", 3000);
        salesStaff[1] = new Salesperson("Natasya", "Lyer", 4000);
        salesStaff[2] = new Salesperson("Nver", "Seryn", 3000);
        salesStaff[3] = new Salesperson("Miytn", "Ouyrt", 2800);

        Sorting.selectionSort(salesStaff);

        System.out.println("\nRanking of Sales for the week\n");

        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}
