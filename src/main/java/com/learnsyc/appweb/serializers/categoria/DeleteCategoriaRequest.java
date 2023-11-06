package com.learnsyc.appweb.serializers.categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeleteCategoriaRequest {
    @NotNull(message = "Dato vacio")
    @NotBlank(message = "No es valido un dato con solo espacio en blanco")
    String nombre;
}
