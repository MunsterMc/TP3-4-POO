package com.tp3messaoudNael.demo.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MeteoAnswer(Forecast forecast) {

}