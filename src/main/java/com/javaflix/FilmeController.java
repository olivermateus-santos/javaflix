package com.javaflix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmeController {

    @GetMapping("/filmes")
    public List<Filme> listarFilmes() {

        Filme filme1 = new Filme(
                "500 Days of Summer",
                "Romance / Comédia / Terror",
                """
                There Is a Light That Never Goes Out – The Smiths
                Please, Please, Please, Let Me Get What I Want – The Smiths
                Bad Kids – Black Lips
                You Make My Dreams – Hall & Oates
                A Story of Boy Meets Girl – Mychael Danna e Rob Simonsen
                Us – Regina Spektor
                Sweet Disposition – The Temper Trap
                Quelqu'un M'a Dit – Carla Bruni
                """,
                "12 anos",
                2009,
                95,
                true
        );

        filme1.avalia(8);
        filme1.avalia(8.5);
        filme1.avalia(10);


        Filme filme2 = new Filme(
                "A Família do Futuro",
                "Infantil / Comédia",
                """
                Pequenas Maravilhas (Little Wonders)
                Mais Uma Chance
                Another Believer – Rufus Wainwright
                The Future Has Arrived – The All-American Rejects
                """,
                "Livre",
                2007,
                95,
                true
        );

        filme2.avalia(8);
        filme2.avalia(8);
        filme2.avalia(9);


        Filme filme3 = new Filme(
                "A Odisseia",
                "Ação / Fantasia",
                """
                Para criar a sonoridade do filme, Göransson pesquisou
                instrumentos da Grécia Antiga, como a lira e o aulus,
                misturando-os com texturas modernas e gongos de bronze.

                O álbum oficial conta com 22 faixas instrumentais e a
                canção original "When I'm Home", gravada em colaboração
                com James Blake e Travis Scott.
                """,
                "14 anos",
                2026,
                172,
                false
        );

        filme3.avalia(10);
        filme3.avalia(10);
        filme3.avalia(9.5);


        return List.of(
                filme1,
                filme2,
                filme3
        );
    }
}