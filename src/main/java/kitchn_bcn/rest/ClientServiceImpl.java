package kitchn_bcn.rest;

import java.util.Optional;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientServiceImpl implements ClientService {
  
  @Autowired
  private ClientRepository clientRepository;
  
  @Override
  public List<Client> findAll(){
    return clientRepository.findAll();
  }

  @Override
  public Optional<Client> findById(String id){
    return clientRepository.findById(id);
  }

  @Override
  public Client findByEmail(String email){
    return clientRepository.findByEmail(email);
  }

  @Override
  public Client saveOrUpdateClient(Client client){
    return clientRepository.save(client);
  }

  @Override
  public void deleteStudentById(String id){
    clientRepository.deleteById(id);
  }
}
