public class BirthMonth {
    public static void main(String[] args) {

        int month = 21;

        if (month > 0 && month < 13){
            System.out.println("Your birth month is: " + month);
        } else {

            System.out.println("You entered an incorrect month value: " + month);
        }
    }
}
