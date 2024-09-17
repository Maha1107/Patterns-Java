public class CombiTrianglePattern {
  
        public static void main(String[] args) {
            int n = 5; // Number of rows for the maximum width
    
            // Upper part including the middle row
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            // Lower part after the middle row
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

