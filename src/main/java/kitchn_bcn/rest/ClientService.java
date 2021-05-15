package kitchn_bcn.rest;

import kitchn_bcn.rest.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
  List<Client> findAll();
  Optional<Client> findById(String id);
  Client findByEmail(String email);
  Client saveOrUpdateClient(Client client);
  void deleteStudentById(String id);
}
