package mx.edu.utez.proyecto1D.model.usuario.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RequestCreateUserDTO {

    @NotBlank(message = "el nombre del usuario es obligatorio")
    @Size(min = 6, max = 20, message = "Debe contener entre 6 y 20 carateres")
    private String username;

    @NotBlank(message = "la contraseña es obligatorio")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*\\d).{8,}$",
            message = "La contraseña debe tener al menos 8 digitos"
    )

    private String password;
    private String descripcion;

    @NotBlank(message = "rol obligatorio")
    @Pattern(
            regexp = "^(ADMIN|PROFESOR|ESTUDIANTE)$",
            message = "el rol debe ser ADMIN, PROFESOR o ESTUDIANTE"
    )
    private String rol;

    private String nombres;
    private String primerApellido;
    private String segundoSApellido;
    private String correo;
    private String curp;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNAcimiento;



}
