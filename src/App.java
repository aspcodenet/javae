public class App {
    public static void main(String[] args) throws Exception {
        // exercise 4
//  Skriv ut Skriv in ditt förnamn: . Ta emot värdet i en variabel
// Låt markören vänta på din inmatning på samma rad.
// Gör på samma sätt med efternamnet.
// Skriv sedan ut namnen i omvänd ordning.
// Se till att resultatet ser ut så här.
        System.out.print("Skriv in ditt förnamn:");
        String forNamn = System.console().readLine();

        System.out.print("Skriv in ditt efternamn:");
        String efterNamn = System.console().readLine();

        System.out.print("Skriv in din ålder:");
        int age = Integer.parseInt(System.console().readLine());
       
        System.out.print("Skriv in din temp:");
        float temperature = Float.parseFloat(System.console().readLine());

        System.out.println(efterNamn + ", " + forNamn + ", " + age);

        // exercise 3
        // Skapa en variabel String name med ditt namn
        //    Skapa en int age med din ålder.
        // Skriv sedan ut Jag heter Kalle (innehållet i name) och 
        // är 27(innehållet i age) år.
//         String namn = "Stefan";
// //        5+8 -> 13
// //        "5" + "8" -> "58"
//         int age = 52;

//         String resultatet = "Jag heter ";
//         //resultatet = resultatet + namn + " och är " + age + " år";
//         resultatet = resultatet + namn;
//         resultatet = resultatet + " och är ";
//         resultatet = resultatet + age;
//         resultatet = resultatet + " år";

//         System.out.println(resultatet);

        
    }
}
