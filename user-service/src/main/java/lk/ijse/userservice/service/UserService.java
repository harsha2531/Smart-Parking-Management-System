package lk.ijse.userservice.service;


import lk.ijse.userservice.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    void deleteUser(Long id);
    UserDTO loginUser(String email, String password);
}

