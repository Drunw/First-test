package com.prueba.integracion.Rutas;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RutaInicial extends RouteBuilder {
    @Override
    public void configure() throws Exception{
        from("direct:rutainicial")
                .log("ACA ESTOY ${body.message} , ${body.class}");
    }
}
