package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String firstName;

   private String lastName;

   private String email;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "car_id")
   private Car privateCar;

   public User() {}

   public User(String firstName, String lastName, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Car getPrivateCar() {
      return privateCar;
   }

   public void setPrivateCar(Car privateCar) {
      this.privateCar = privateCar;
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", email='" + email + '\'' +
              ", privateCar=" + privateCar +
              '}';
   }
}
