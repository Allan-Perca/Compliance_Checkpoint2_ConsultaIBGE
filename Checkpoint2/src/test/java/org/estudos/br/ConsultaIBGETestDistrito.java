package org.estudos.br;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsultaIBGETestDistrito {

    @Test
    @DisplayName("Pesquisando distrito")
    public void testConsultarDistrito() throws IOException {}

    @Test
    @DisplayName("Pegando o Status Code")
    public void testConsultarDistritoStatusCode() throws IOException {

        int distritoID = 320010215;

        HttpURLConnection connection = (HttpURLConnection) new URL("https://servicodados.ibge.gov.br/api/v1/localidades/distritos/" + distritoID).openConnection();

        connection.setRequestMethod("GET");

        int statusCode = connection.getResponseCode();

        assertEquals(200, statusCode, "O status code da resposta não é 200.");

    }
}
