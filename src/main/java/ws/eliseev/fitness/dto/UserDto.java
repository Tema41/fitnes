package ws.eliseev.fitness.dto;

import lombok.*;

@EqualsAndHashCode(exclude = "id")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private Long id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private int age;

    private String userRole;

    private String adminRole;

    private Sex sex;

    @RequiredArgsConstructor
    @Getter
    public enum Sex {
        MALE ("male"),
        FEMALE ("female");

        private final String title;
    }
}
