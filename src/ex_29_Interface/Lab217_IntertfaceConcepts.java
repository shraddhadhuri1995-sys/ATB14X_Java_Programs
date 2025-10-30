package ex_29_Interface;

public class Lab217_IntertfaceConcepts {
    public static void main(String[] args) {

    }
}

interface pramod{
    int a=10;
    void display();
}

class dutta implements pramod{

    int aa=20;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);

    }

    class pramod implements TTA {

        @Override
        public void practice() {

        }
    }
}

    class somya implements TTA{

        @Override
        public void practice() {

        }
    }

    class deepak_mentor implements TTA_mentor {

        @Override
        public void mentor() {
            
        }
    }
 interface TTA{
    void practice();
 }

 interface TTA_mentor{
    void mentor();
 }