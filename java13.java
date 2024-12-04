public class java1 {
    public class AddNumbers {

   
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    
       
        public float add(float num1, float num2) {
            return num1 + num2;
        }
    
      
        public int add() {
            int defaultInt1 = 10;
            int defaultInt2 = 20;
            return add(defaultInt1, defaultInt2);  
        }
    
        public float add(float num1) {
            float defaultFloat1 = 5.5f;
            float defaultFloat2 = 3.5f;
            return add(defaultFloat1, defaultFloat2);  
        }
    
        public static void main(String[] args) {
            
            AddNumbers adder = new AddNumbers();
    
            
            int intSum = adder.add(15, 25);  
            System.out.println("Sum of integers: " + intSum);
    
            
            float floatSum = adder.add(5.5f, 7.5f); 
            System.out.println("Sum of floats: " + floatSum);
    
           
            int defaultIntSum = adder.add();
            System.out.println("Sum of default integers: " + defaultIntSum);
    
           
            float defaultFloatSum = adder.add(0.0f); 
            System.out.println("Sum of default floats: " + defaultFloatSum);
        }
    }
    }
}
