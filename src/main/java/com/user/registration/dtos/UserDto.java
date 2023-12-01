package com.user.registration.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String userId;
    @NotBlank(message = "name is required !!")
    private String name;
    @NotBlank(message = "email is required !!")
    private String email;
    @NotBlank(message = "password is required !!")
    private String password;
    @Size(min = 4, max = 6, message = "invalid gender !!")
    private String gender;
}
