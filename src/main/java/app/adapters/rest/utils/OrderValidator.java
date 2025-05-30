package app.adapters.rest.utils;

import app.domain.models.Order;

public class OrderValidator {

    public static Long orderIdValidator(Long value) throws Exception {
        if (value != null && value <= 0) throw new Exception("ID de orden inválido");
        return value;
    }

    public static Long petIdValidator(Long value) throws Exception {
        if (value == null || value <= 0) throw new Exception("ID de mascota inválido");
        return value;
    }

    public static Long veterinarianIdValidator(Long value) throws Exception {
        if (value == null || value <= 0) throw new Exception("ID de veterinario inválido");
        return value;
    }

    public static String medicationValidator(String value) throws Exception {
        if (value == null || value.isBlank()) throw new Exception("Descripción inválida");
        return value;
    }

    public static String drugDosageValidator(String value) throws Exception {
        if (value == null || value.isBlank()) throw new Exception("Dosis del medicamento inválida");
        return value;
    }
}
