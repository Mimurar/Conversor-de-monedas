package src.com.tucusuario;

public class ConversorAPI {package com.tucusuario;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

    public class ConversorAPI {
        private static final String API_URL = "https://v6.exchangerate-api.com/v6/";
        private static final String API_KEY = "TU_API_KEY";  // ⚠️ Cambia esto por tu API key real

        // Consulta el valor de conversión entre dos monedas
        public double convertirMoneda(String monedaOrigen, String monedaDestino, double cantidad) {
            String url = API_URL + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino + "/" + cantidad;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // Extrae el resultado del JSON (simplificado)
                String json = response.body();
                String resultadoStr = json.split("\"conversion_result\":")[1].split(",")[0];

                return Double.parseDouble(resultadoStr);
            } catch (Exception e) {
                System.err.println("❌ Error al conectar con la API: " + e.getMessage());
                return -1;  // Valor inválido si falla
            }
        }
    }
}
