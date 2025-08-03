package Rutas;
import org.apache.camel.builder.RouteBuilder;

public class RutaInicial extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:entradaPedido")
                .log("Entro una peticion: ${body}")
                .transform(simple("peticion recibida."))
                .end();

    }
}

