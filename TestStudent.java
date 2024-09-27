public class TestStudent {
  
    // nome: Julia Lemos
    public static void main(String[] args) {
        
        Student student = new Student("João", "Rua 1, Cidade", "Computação", 2024, 1500.50);

      
        System.out.println(student.toString());

     
        System.out.println("Nome: " + student.getName());
        System.out.println("Endereço: " + student.getAddress());
        System.out.println("Programa: " + student.getProgram());
        System.out.println("Ano: " + student.getYear());
        System.out.println("Taxa: " + student.getFee());

        
        student.setAddress("Rua 2, Cidade Nova");
        student.setProgram("Engenharia");
        student.setYear(2025);
        student.setFee(2000.75);

        
        System.out.println(student.toString());
    }
}
