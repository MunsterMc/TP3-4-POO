package com.tp3messaoudNael.demo.controller;

import com.tp3messaoudNael.demo.consumingrest.APIAnswer;
import com.tp3messaoudNael.demo.consumingrest.MeteoAnswer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;

@Controller
public class MeteoController {
    private final String MY_TOKEN = "REPLACE_WITH_API_KEY";

    @PostMapping("/meteo")
    public String meteo(@RequestBody String address, Model model) {
        String uri = "https://api-adresse.data.gouv.fr/search/?q=" + address.replace("address=", "") + "&limit=1";
        model.addAttribute("address", address.replace("address=", "").replace("+", " "));
        RestTemplate answer = new RestTemplate();
        APIAnswer apiAnswer = answer.getForObject(uri, APIAnswer.class);
        if (apiAnswer == null) {
            model.addAttribute("answer", "Adresse non trouvée");
            return "meteo";
        }
        String coords = Arrays.toString(apiAnswer.features().get(0).getGeometry().getCoordinates());
        model.addAttribute("answer", coords);

        String coordsForm = coords.replace("[", "").replace("]", "").replace(" ", "");
        String coordsX = coordsForm.split(",")[1];
        String coordsY = coordsForm.split(",")[0];
        String meteoURI = "https://api.meteo-concept.com/api/forecast/daily/0?token=" + MY_TOKEN + "&latlng=" + coordsX + "," + coordsY;
        RestTemplate answerMeteo = new RestTemplate();
        MeteoAnswer meteoAnswer = answerMeteo.getForObject(meteoURI, MeteoAnswer.class);
        if (meteoAnswer == null) {
            model.addAttribute("forecast", "Adresse non trouvée");
            return "meteo";
        }
        model.addAttribute("forecast", answerMeteo.getForObject(meteoURI, MeteoAnswer.class).forecast().getTmax());
        return "meteo";
    }
}
