import java.util.Arrays;
import java.util.List;

public class PatientQue {
    public static void main(String[] args) {

        List<Patient> patientList = Arrays.asList(
            new Patient("P1",25,"Corona",20000), 
            new Patient("P2",35,"Fever",2000),
            new Patient("P3",43,"Corona",60000),
            new Patient("P4",58,"Corona",90000)
        );

        //! Print all the patient suffering from corona
        patientList.stream().filter(p -> p.getDisease().equals("Corona")).forEach(System.out::println); //Method Referencing ::println

        //! Print all patient age < 40
        //patientList.stream().filter(p -> p.getAge() < 40 ).forEach(System.out::println);

        //! Print avg bill paid by corona patients
        // Double avgbill = patientList.stream().filter(p -> p.getDisease().equals("Corona")).collect(Collectors.averagingDouble(Patient::getAmount));
        // System.out.println("Avg bill paid by corona patients: "+avgbill);
    }
}