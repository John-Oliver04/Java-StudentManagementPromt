import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String course;
    private String paymentMethod;
    private int tuitionBalance;
    private int costOfCourse = 600;

    public Student(){
        Scanner scanName = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        this.name = scanName.nextLine();

        Scanner scanCourse = new Scanner(System.in);
        System.out.println("1 - CBAM\n 2 - BSIT");
        if(scanCourse.nextInt() == 1){
            this.course = "CBAM";
        }else{
            this.course = "BSIT";
        }
        Scanner scanPaymentMethod = new Scanner(System.in);
        System.out.println("Payment Method\n 1 - Full payment\n2 - Down payment");
        if(scanPaymentMethod.nextInt() == 1){
            this.paymentMethod = "Full Payment";
        }else{
            this.paymentMethod = "Down Payment";
        }

        Scanner scanAmount = new Scanner(System.in);
        System.out.println("Type Amount: ");
        this.tuitionBalance = 600 - scanAmount.nextInt();

        System.out.println("Review your info:");
        System.out.println(
                "Fullname: "+name + "\n" +
                "Course: "+ course + "\n" +
                "Payment Method: "+ paymentMethod + "\n"+
                "Tuition Balance: "+tuitionBalance
        );
    }
}
