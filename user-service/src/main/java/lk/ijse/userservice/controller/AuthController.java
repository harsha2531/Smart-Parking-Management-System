package lk.ijse.userservice.controller;


import lk.ijse.userservice.dto.LoginDTO;
import lk.ijse.userservice.dto.UserDTO;
import lk.ijse.userservice.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/register")
    private ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO userDTO) {

        UserDTO createdUser = userService.createUser(userDTO);

        if (createdUser != null) {
            return ResponseEntity.ok(createdUser);
        }
            return ResponseEntity.status(400).body(null);
    }

    @PostMapping("/login")
    private ResponseEntity<UserDTO> loginUser(@RequestBody LoginDTO loginDTO) {
        UserDTO user = userService.loginUser(loginDTO.getEmail(), loginDTO.getPassword());

        if (user != null) {
            return ResponseEntity.status(200).body(user);
        }
        return null;
    }
}