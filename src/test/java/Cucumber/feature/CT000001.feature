#language: pt

@tag2 @tag3
Funcionalidade: Acessar a página do DgSantos
	
	Contexto: 
	Dado que abro o navegador "Chrome"
	E e que estou na pagiba web "https://dgosantos89.github.io/Gherkin-p2/"

  @tag4
  	Esquema do Cenario: Clicar na aba blog do site do dgsantos
  	Dado  que estou na pagina "<Titulo>"
  	Quando clico no menu "<Home>"
  	E que estou na pagina "<TituloHome>"
  	E clico no botao "Blog"
  	Entao valido o texto "<Textos>"
  	
  	Exemplos: 
  	|Titulo 													 	|Menu|TituloHome	|Textos																	|
  	|Usando todo o poder do Gherkin 2/2	|Home|Diego Santos|Como melhorar a comunicação usando BDD	|