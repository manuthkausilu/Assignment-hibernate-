package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSessioon();

        FullName fullName = new FullName("Manuth","Kausilu");

        Customer customer = new Customer();
        customer.setId(1);
        customer.setFullName(fullName);
        customer.setAddress("Horana");
        customer.setPhone("0770291366");

        Transaction transaction=session.beginTransaction();
//        save
//        session.save(customer); i

//        delete
//        session.delete("1",customer);

//        update
//        session.update(customer);

        transaction.commit();
        session.close();


    }
}