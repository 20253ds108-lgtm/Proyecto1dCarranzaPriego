package mx.edu.utez.proyecto1D.controller.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RequestBodyDTO {

    @NotBlank(message = "el nombre debe de ser obligatorio")
    @Size(min=3, message ="la edad es de al menos 3 caracteres")
    private String nombre;

    @Min(value=18, message = "se debe tener 18 o mas años"   )
    private int edad;

    @NotBlank(message = "el correo es obligatorio")
    @Email(message = "el correo no es valido ")
    private String correo;

    @NotBlank(message = "El curp es obligatorio")
    @Pattern(
            regexp = "^[A-Z]{4}\\d{6}[HM][A-Z]{5}[A-Z\\d]\\d$",
            message = "La CURP no tiene un formato válido"
    )    private String curp;
}
