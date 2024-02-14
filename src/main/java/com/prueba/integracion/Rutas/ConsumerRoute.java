package com.prueba.integracion.Rutas;

import com.prueba.integracion.Modelos.Request;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;


@Component
public class ConsumerRoute extends RouteBuilder{
    @Override
    public void configure() throws Exception{
        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.auto);

        rest()
                .path("/prueba1")
                .consumes("application/json")
                .produces("application/json")
                .post("/post").type(Request.class).enableCORS(true).description("FLUJO DE PRUEBA")
                .to("direct:rutainicial");
    }
}
