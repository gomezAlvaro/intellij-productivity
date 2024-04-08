package training.intellij.speed;


import training.intellij.support.dirty.Customer;
import training.intellij.support.dirty.Rental;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class IntelliJPlay {
  public static void main(String[] args) {
    Person person = new Person();

    Customer customer = new Customer();
    List<Integer> list = new ArrayList<>();
    for (Rental rental : customer.getRentals()) {
      list.add(rental.getDaysRented());
    }
    System.out.println(list);
    method(customer.getRentals());
  }

  public static void introduce(String firstName, Person.MaritalStatus maritalStatus) {
     System.out.println("This is " + firstName + (maritalStatus == Person.MaritalStatus.SINGLE ? "😉" : ""));
  }


  public static void method(List<Rental> rentals) {
    rentals.clear();
  }


}

