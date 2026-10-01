const catalogo = document.querySelector("#catalogo");
const modal = document.querySelector("#modal");
const fecharModal = document.querySelector("#fechar-modal");

let filmesCarregados = [];

const capas = {
    "500 Days of Summer": "img/500-days-of-summer.png",
    "A Família do Futuro": "img/familia-do-futuro.jpg",
    "A Odisseia": "img/odisseia.png"
};

async function carregarFilmes() {

    try {

        const resposta = await fetch("/filmes");

        if (!resposta.ok) {
            throw new Error("Erro ao buscar os filmes na API.");
        }

        filmesCarregados = await resposta.json();

        console.log("Filmes recebidos da API:", filmesCarregados);

        exibirFilmes(filmesCarregados);

    } catch (erro) {

        console.error("Erro ao carregar filmes:", erro);

        catalogo.innerHTML = `
            <p>
                Não foi possível carregar os filmes.
            </p>
        `;
    }
}

function exibirFilmes(filmes) {

    catalogo.innerHTML = "";

    filmes.forEach((filme, indice) => {

        const card = document.createElement("article");

        card.classList.add("filme");


        let genero = filme.genero;


        if (filme.nome === "500 Days of Summer") {

            genero = genero.replace(
                "Terror",
                '<span class="terror">Terror</span>'
            );
        }


        const mediaFormatada = filme.media
            .toFixed(2)
            .replace(".", ",");


        card.innerHTML = `
            <img
                class="capa-filme"
                src="${capas[filme.nome]}"
                alt="Capa de ${filme.nome}"
            >

            <div class="informacoes">

                <h3>
                    ${filme.nome}
                </h3>

                <p>
                    ${genero}
                </p>

                <p>
                    ${filme.anoDeLancamento}
                    •
                    ${filme.duracaoEmMinutos} min
                </p>

                <p>
                    Classificação:
                    ${filme.classificacao}
                </p>

                <p class="nota">
                    ⭐ ${mediaFormatada}
                </p>

                <button
                    type="button"
                    data-indice="${indice}">
                    Ver detalhes
                </button>

            </div>
        `;


        catalogo.appendChild(card);
    });


    configurarBotoes();
}

function configurarBotoes() {

    const botoes = document.querySelectorAll(
        ".informacoes button"
    );


    botoes.forEach(botao => {

        botao.addEventListener("click", () => {

            const indice = botao.dataset.indice;

            const filme = filmesCarregados[indice];

            abrirModal(filme);
        });
    });
}

function abrirModal(filme) {

    const mediaFormatada = filme.media
        .toFixed(2)
        .replace(".", ",");


    document.querySelector("#modal-titulo").textContent =
        filme.nome;


    document.querySelector("#modal-genero").textContent =
        "Gênero: " + filme.genero;


    document.querySelector("#modal-ano").textContent =
        "Ano de lançamento: " + filme.anoDeLancamento;


    document.querySelector("#modal-duracao").textContent =
        "Duração: " + filme.duracaoEmMinutos + " minutos";


    document.querySelector("#modal-classificacao").textContent =
        "Classificação: " + filme.classificacao;


    document.querySelector("#modal-nota").textContent =
        "⭐ Nota: " + mediaFormatada;


    document.querySelector("#modal-plano").textContent =
        "Incluído no plano: "
        + (filme.incluidoNoPlano ? "Sim" : "Não");


    document.querySelector("#modal-trilha").innerHTML =
        filme.trilhaSonora.replace(/\n/g, "<br>");


    modal.style.display = "flex";
}


fecharModal.addEventListener("click", () => {

    modal.style.display = "none";
});

modal.addEventListener("click", evento => {

    if (evento.target === modal) {

        modal.style.display = "none";
    }
});

carregarFilmes();