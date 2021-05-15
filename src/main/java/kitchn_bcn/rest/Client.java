package kitchn_bcn.rest;

import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Clients")
public class Client {
  
  private @Id String id;
  private String name;
  @NotBlank(message = "email required")
  private String email;
  private String password;
  private int numberOfOrders;

  public Client() {}

  public Client(String id, String name, String email, String password, int numberOfOrders){
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = email;
    this.numberOfOrders = numberOfOrders;
  }
  
  public String getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public String getEmail(){
    return email;
  }

  public String getPassword(){
    return password;
  }

  public int getNumberOrders(){
    return numberOfOrders;
  }

  public void setId(String id){
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setPassword(String pass){
    this.password = pass;
  }

  public void setNumberOfOrders(int numberOfOrders){
    this.numberOfOrders = numberOfOrders;
  }


  
}
