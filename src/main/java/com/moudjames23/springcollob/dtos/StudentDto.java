package com.moudjames23.springcollob.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {

    private long id;

    @NotBlank(message = "Le nom de l'étudiant est obligatoire")
    @Size(min = 5, max = 200)
    private String name;

    @NotBlank(message = "L'adresse email de l'étudiant est obligatoire")
    @Email
    private String email;
}
