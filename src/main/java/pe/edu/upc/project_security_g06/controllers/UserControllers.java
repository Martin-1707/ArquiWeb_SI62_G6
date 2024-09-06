package pe.edu.upc.project_security_g06.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project_security_g06.dtos.UserDTO;
import pe.edu.upc.project_security_g06.entities.Users;
import pe.edu.upc.project_security_g06.servicesinterfaces.IdUserService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UserControllers {

}
