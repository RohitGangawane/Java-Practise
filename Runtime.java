public class Runtime {
    
    public static void main(String[] args) {
    
        running r = new running();
        running a = new BMW();
    
        running b = new KTM();
    
       
        a.run();
     
        r.run(); 
        b.run(); 
    }
      
    }

    class running {
        void run() {
            System.out.println("Basic Bike");
        }
    }
  
   


    class BMW extends running {
        void run() {
            System.out.println("BMW Bike");
        } }

        class KTM extends running {
            void run() {
                System.out.println("KTM Bike");
            }
        }
   


    

