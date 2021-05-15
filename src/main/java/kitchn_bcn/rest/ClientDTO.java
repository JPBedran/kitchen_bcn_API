package kitchn_bcn.rest;

import javax.validation.constraints.NotBlank;

public class ClientDTO {
  private String id;
  private String name;
  @NotBlank(message = "Needs email")
  private String email;
  @NotBlank(message = "Needs a password")
  private String password;
  private int numberOfOrders;

  public ClientDTO() {}

  public ClientDTO(String id, String name, String email, String password, int numberOfOrders){
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
