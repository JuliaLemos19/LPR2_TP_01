public class TestStaff {
  
    // nome: Julia Lemos
    public static void main(String[] args) {
        
        Staff staff = new Staff("Maria", "Avenida 5, Centro", "Escola Primária", 3500.80);

        
        System.out.println(staff.toString());

        
        System.out.println("Nome: " + staff.getName());
        System.out.println("Endereço: " + staff.getAddress());
        System.out.println("Escola: " + staff.getSchool());
        System.out.println("Salário: " + staff.getPay());

        
        staff.setAddress("Avenida 6, Centro Novo");
        staff.setSchool("Escola Secundária");
        staff.setPay(4000.90);

      
        System.out.println(staff.toString());
    }
}
