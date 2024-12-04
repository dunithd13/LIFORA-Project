import java.util.Scanner;

public class BloodTypeCompatibility {
    public static void main(String[] args) {
        String dType, rType;
        Scanner inputData = new Scanner(System.in);

        System.out.println("Enter donor's type:");
        dType = inputData.nextLine();

        System.out.println("Enter recipient's type:");
        rType = inputData.nextLine();

        boolean compatible = false;

        if (dType.equals("O+")) {
            if (rType.equals("O+") || rType.equals("A+") || rType.equals("B+") || rType.equals("AB+")) {
                compatible = true;
            }
        } else if (dType.equals("O-")) {
            if (rType.equals("O-")) {
                compatible = true;
            }
        } else if (dType.equals("A+")) {
            if (rType.equals("O+") || rType.equals("O-") || rType.equals("A+") || rType.equals("A-")) {
                compatible = true;
            }
        } else if (dType.equals("A-")) {
            if (rType.equals("O-") || rType.equals("A+")) {
                compatible = true;
            }
        } else if (dType.equals("B+")) {
            if (rType.equals("B+") || rType.equals("AB+")) {
                compatible = true;
            }
        } else if (dType.equals("B-")) {
            if (rType.equals("B+") || rType.equals("B-") || rType.equals("AB+") || rType.equals("AB-")) {
                compatible = true;
            }
        } else if (dType.equals("AB+")) {
            if (rType.equals("AB+")) {
                compatible = true;
            }
        } else if (dType.equals("AB-")) {
            if (rType.equals("O-") || rType.equals("A-") || rType.equals("B-") || rType.equals("AB-")) {
                compatible = true;
            }
        }

        if (compatible) {
            System.out.println("Blood Types are compatible. Add HLA Values.");
        } else {
            System.out.println("Blood Types are not compatible. No need to enter HLA Values.");
        }
    }
}
