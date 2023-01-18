public class CustomerMain { 
         public static void main(String[] args) { 
                 Customer My_Customer; 
                 RegularCustomer regularCustomer = new RegularCustomer("Dolf", 2551); 
                 SeniorCustomer seniorCustomer = new SeniorCustomer("Kenneth", 2551 );
                 My_Customer = regularCustomer; 
                 System.out.println(My_Customer.getName()+" " +My_Customer.calculateBill()); 
  
                 My_Customer = seniorCustomer; 
                 System.out.println(My_Customer.getName()+" "+My_Customer.calculateBill()); 
         } 
 }
