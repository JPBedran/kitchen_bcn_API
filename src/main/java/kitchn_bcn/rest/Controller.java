package kitchn_bcn.rest;

// import kitchn_bcn.rest.dto.
// import kitchn_bcn.rest.model.Student;
// import kitchn_bcn.rest.service.StudentService;
// import kitchn_bcn.rest.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
// import org.modelmapper.convention.MatchingStrategies;

@RestController
@RequestMapping("/clients")
public class Controller {

  @Autowired
  private ClientService clientService;
  
  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping(value="/client/{email}")
  public ClientDTO getClientByEmail(@PathVariable("email") String email){
    ModelMapper modelMapper = new ModelMapper();
    return modelMapper.map(clientService.findByEmail(email), ClientDTO.class);

  }
  @PostMapping(value="/save")
  public ResponseEntity<?> saveClient(@Valid @RequestBody ClientDTO clientDTO){
    System.out.println(clientDTO);
    ModelMapper modelMapper = new ModelMapper();
    clientService.saveOrUpdateClient(modelMapper.map(clientDTO, Client.class));
    return new ResponseEntity<>("Added succesfully", HttpStatus.OK);
  }
}
