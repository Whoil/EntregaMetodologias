package es.uah.matcomp.mp.e2.ejerciciosclases.tres;
public class TestAccount {
    public static void main( String[] args){
        //Crear un cliente de prueba
        Customer c1=new Customer(88,"Tan Ah Teck",'m');
        //Probamos los métodos públicos de Customer
        System.out.println(c1); //ToString()
        System.out.println("id:  "+c1.getId());
        System.out.println("name: "+c1.getName());
        System.out.println("gender: "+c1.getGender());
        //Crear una nueva cuenta asociada al cliente
        Account a1=new Account (1000,c1,88.8);
        //Probar los métodos públicos de Account
        System.out.println(a1); //ToString()
        System.out.println("id: "+a1.getId());
        System.out.println("customer: "+a1.getCustomer());
        System.out.println("balance: "+a1.getBalance());
        System.out.println("customer name: "+a1.getCustomerName());
        //Probador de setBalance
        a1.setBalance(100.0);
        System.out.println(a1);
        //Probador de deposit
        a1.deposit(50.0);
        System.out.println(a1);
        //Probador de withdraw con saldo suficiente
        a1.withdraw(30.0);
        System.out.println(a1);
        //Probador de withdraw con saldo insuficiente
        a1.withdraw(500.0);
        System.out.println(a1);

    }
}