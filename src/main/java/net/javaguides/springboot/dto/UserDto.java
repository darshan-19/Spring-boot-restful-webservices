package net.javaguides.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Schema(
        description = "UserDto Model Information "
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


    private Long id;
    @Schema(
            description = "User First Name"
    )
//    firstName should not be empty
    @NotEmpty(message="User firstName cannot be nulll or empty")
    private String firstName;

    @Schema(
            description = "User Last Name"
    )
    //   lastName should not be empty
    @NotEmpty(message="User lastName cannot be nulll or empty")
    private String lastName;


    @Schema(
            description = "User Email Address"
    )
//       email should not be empty and should be a vaild email address
@NotEmpty(message="User email cannot be nulll or empty")
    @Email(message = "Email address should be valid")
    private String email;
}
