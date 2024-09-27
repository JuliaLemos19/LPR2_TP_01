public class AuthorTest {
  
    // nome: Julia Lemos
    public static void main(String[] args) {
      
        Author author = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        System.out.println("Construtor Testado!");

        
        System.out.println(author.toString());

        
        author.setEmail("wellington.tuler@exemplo.com");
        System.out.println("Email atualizado: " + author.getEmail());

      
        System.out.println("Nome: " + author.getName());
        System.out.println("Gênero: " + author.getGender());
    }
}
