# Relatório

1 - 
  * Foi criado um enum para definir qual video game iria ser utilizado, esse enum se encontra
  na pasta (>./src/utils/VideoGame.java).
  * As classificações foram criadas representando um contexto em que o aluguel do cliente se
  encontra. são encontrados em (>./src/contexts).

2 -
  * Foi usado um if básico para verificação de a quantidade de dias alugados era maior que 
  3 dias. Esse código pode ser encontrado em: (>./src/contexts/Online") no método: getRentAmount.

3 - 
  * Foi criado uma pasta templates onde teve a divisão de extrato normal e extrato html, o que
  ambos possuem em comum está dentro do arquivo extract. (>./src/templates).

4 -
  * A injeção de dependência pode ser encontrada quando no arquivo (>./src/models/Rent.java) é criado um construtor recebendo como argumento o "Rentable". Assim toda vez no programa principal basta alterar lá.

5 - 
![Classe UML](https://user-images.githubusercontent.com/43156311/229991967-0df04da2-8392-4688-8a59-a27d4be26bb5.jpeg)
