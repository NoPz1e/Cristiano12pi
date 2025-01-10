import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {

        
        Scanner input = new Scanner(System.in); 
        //1
        int nota;
        
        do{
            System.out.print("nota: ");
            nota = input.nextInt();
        }while(nota > 10 || nota < 0 );


        //2
        boolean repetir;

        do {

            repetir= false;

            System.out.print("Username: ");
            String name = input.next();

            System.out.print("Password: ");
            String pw = input.next();
            
            if(name.equals(pw)){
                repetir = true;
                System.out.println("Não é possivel utilizar a passe igual ao nome!");
            }
            
        } while (repetir == true);

        //3
        String nome;
        int idade;
        double salary;
        String sex;
        String maritalStatus;

        do{
            System.out.print("Nome: ");
            nome = input.next();
        }while(nome.length() < 3);

        do{
            System.out.print("Idade: ");
            idade = input.nextInt();
        }while(idade > 150 || idade < 0 );

        do{
            System.out.print("salario: ");
            salary = input.nextDouble();
        }while(salary < 0 );

        do{
            System.out.print("Sexo(f, m): ");
            sex = input.next();
        }while(!sex.equals("f") && !sex.equals("m"));

        do{
            System.out.print("Marital Status(s,m,w,d): ");
            maritalStatus = input.next();
        }while(!maritalStatus.equals("s") && !maritalStatus.equals("m") && !maritalStatus.equals("w") & !maritalStatus.equals("d"));

        input.close();
    }
}
