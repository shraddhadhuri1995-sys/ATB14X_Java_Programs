package ex_18_OOPs;

public class Lab177_Constructor_This {
    public static void main(String[] args) {
         cat c1;
         cat c2;
         cat c3=new cat();
         cat c24=new cat("Mirchi");
         cat c25=new cat("Lucci");

        System.out.println(c3.name);
        System.out.println(c24.name);
        System.out.println(c25.name);

        c24.running();
    }
}

class  cat
        {
            String name;
             cat()
             {
                 name="Pussy";
             }

             cat(String nameParam)
             {
                 this.name=nameParam;
             }

             void running()
             {
                 System.out.println("Who is running ->"+ this.name);
             }

                }
