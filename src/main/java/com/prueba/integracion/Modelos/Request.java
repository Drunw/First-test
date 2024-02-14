package com.prueba.integracion.Modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Request {
    @JsonProperty("Message")
    private String message;

}
