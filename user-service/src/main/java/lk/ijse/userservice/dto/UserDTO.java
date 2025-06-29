package lk.ijse.userservice.dto;

import lk.ijse.userservice.util.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDTO {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;
    private LocalDateTime createdAt;
}
