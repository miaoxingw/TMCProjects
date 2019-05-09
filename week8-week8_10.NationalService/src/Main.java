public class Main {
    public static void main(String[] args) {
        NationalService civilService = new CivilService();

        int days = civilService.getDaysLeft();
        while (days != 0) {
            if (days != 1) {
                System.out.println("The civil service has " + days + " days left");
            } else {
                System.out.println("The civil service has " + days + " day left");
            }
            civilService.work();
            days = civilService.getDaysLeft();
        }

        NationalService militaryService = new MilitaryService(30);

        days = militaryService.getDaysLeft();
        while (days != 0) {
            if (days != 1) {
                System.out.println("The military service has " + days + " days left");
            } else {
                System.out.println("The military service has " + days + " day left");
            }
            militaryService.work();
            days = militaryService.getDaysLeft();
        }
    }
}
