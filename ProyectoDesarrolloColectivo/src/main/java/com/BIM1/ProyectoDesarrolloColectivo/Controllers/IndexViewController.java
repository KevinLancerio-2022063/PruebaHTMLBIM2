package com.BIM1.ProyectoDesarrolloColectivo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexViewController {

    // Mostrar vista Index
    @GetMapping
    public String mostrarIndex() {
        return "index";
    }

    @GetMapping("/objetivoMeditacion")
    public String MostrarObjetivoMeditacion() {
        return "objetivoMeditacion";
    }

    @GetMapping("/usuarios")
    public String Mostrarusuario() {
        return "usuarios";
    }

    @GetMapping("/registroSueno")
    public String MostrarRegistroSueno() {
        return "registroSueno";
    }

    @GetMapping("/frasesMotivadoras")
    public String MostrarFraseMotivadora() {
        return "frasesMotivadoras";
    }

    @GetMapping("/apoyoEmocional")
    public String MostrarApoyoEmocional() {
        return "apoyoEmocional";
    }

    @GetMapping("/ejercicios")
    public String MostrarEjercicio() {
        return "ejercicios";
    }

    @GetMapping("/entradaDiario")
    public String MostrarentradaDiario() {
        return "entradaDiario";
    }

    @GetMapping("/libro")
    public String MostrarLibro() {
        return "libro";
    }

    @GetMapping("/objetivos")
    public String MostrarRObjetivoso() {
        return "objetivos";
    }

    @GetMapping("/perfilNutricional")
    public String MostrarperfilNutricional() {
        return "perfilNutricional";
    }

    @GetMapping("/rachaEjercicio")
    public String Mostrarracha_ejercicio() {
        return "rachaEjercicio";
    }

    @GetMapping("/rachaLectura")
    public String Mostrarracha_lectura() {
        return "rachaLectura";
    }

    @GetMapping("/rutina")
    public String MostrarRutina() {
        return "rutina";
    }

    @GetMapping("/registroMeditacion")
    public String MostrarregistroMeditacion() {
        return "registroMeditacion";
    }
}
