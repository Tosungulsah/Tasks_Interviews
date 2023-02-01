package Tasks;

public class Day23_Task16 {
    public static void main(String[] args) {

        /*
16.  write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"
         */

        System.out.println(fullName("gulSah","toSun"));


    }

    public static String fullName(String name, String surname){
       name=  name.toLowerCase();
        surname= surname.toLowerCase();

       String fullNameLast=name.substring(0,1).toUpperCase()+ name.substring(1,name.length())+" "+ surname.substring(0,1).toUpperCase()+surname.substring(1,surname.length());

        return fullNameLast;
    }
}
