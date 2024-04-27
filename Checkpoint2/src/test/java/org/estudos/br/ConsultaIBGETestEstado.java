package org.estudos.br;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsultaIBGETestEstado {

    @Test
    @DisplayName("Pegando o Status Code")
    public void testConsultarEstadoStatusCode() throws IOException {

        String estadoUf = "DF";

        HttpURLConnection connection = (HttpURLConnection) new URL("https://servicodados.ibge.gov.br/api/v1/localidades/estados/" + estadoUf).openConnection();

        connection.setRequestMethod("GET");

        int statusCode = connection.getResponseCode();

        assertEquals(200, statusCode, "O status code da resposta não é 200.");

        // Act
        //String resposta = ConsultaIBGE.consultarEstado(estadoUf);

        // Assert
        //assertEquals(200, resposta.getStatusCode());



    }
}
