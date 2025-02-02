package net.javaguides.springboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    // sensitivate information should not included
    Long id;

    @NotEmpty(message = "User First name should not be empty")   // java bean validation
    String firstName;

    @NotEmpty(message = "User Last name should not be empty")
    String lastName;

    @NotEmpty(message = "User Mail should not be empty")
    @Email
    String email;
}




// DTO - data transfier obj,  used to send the sensitive info from user, used to avoid no of REST APi