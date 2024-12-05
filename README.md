# IPHONE MODEL
Baseado na primeira apresentação do iphone feita pelo sr. Steve Jobs, surgiu a ideia na @https://github.com/digitalinnovationone para desenvolver um protótico
usando os conhecimentos da UML e por em prática usando a linguagem JAVA.
Para que alcançemos a satisfação desse desafio precisamos ter 3 classes que abstraem do mundo real as seguintes funcionalidades:

 * Telefone;
 * Reprodutor De Música;
 * Navegador;

Usaremos o paradigma da Orientação a Objeto para fazer a entrega desse desafio!


## IDEALIZAÇÃO UML:
Segundo o google IML é a sigla para Unified Modeling Language, ou Linguagem de Modelagem Unificada, um padrão de modelagem visual utilizado na engenharia de software.
Neste caso utilizaremos o diagrama de classe que nada mais é que um tipo de diagrama da Linguagem de Modelagem Unificada (UML) que mapeia a estrutura de um sistema orientado a objetos.

### Mãos na Massa:
Para cumprir as condições proposta dividi o sistema em 4 classes principais sendo a  classe a Iphone a que servirá de enter point da aplicação, onde criaremos as instâncias de cada obejto 
a fim de testa-las, partindo dela buscamos implementar as classes supracitadas( Navegador, Reproduto de Música, Telefone) buscando implentar os atributos e classes mais pertinentes para 
esse desafio.

Logo abaixo está a minha solução desse desafio:

![image](https://github.com/user-attachments/assets/cac479f1-d3f4-41ed-b24d-37ba749aa94f)

## MÃOS NA MASSA:
Agora que já idealizamos o minimo que precisamos para alcançar o objetivo, vamos começar a desenvolver.

Neste primeiro instante criei pacotes (Packages) para facilitar a organização do código:

![image](https://github.com/user-attachments/assets/94751485-3b8a-49f5-902b-3422f82b2a1f)

Logo em seguida busquei começar pela classe do reprodutor de música, criando os atributos privados e logo em seguida buscando desenvolver seus metódos getters e setters (Padrão Java Bean):

![image](https://github.com/user-attachments/assets/4b1b96c0-e23b-430c-bf51-92e83859168f)

Após isso desenvolvi os métodos pertinente a essa classe:

![image](https://github.com/user-attachments/assets/aef780ba-18c0-4cb3-bc7f-bf6018b26a1e)

e fiz o mesmo com a classe musica:

![image](https://github.com/user-attachments/assets/c7c52c3a-fb7d-4354-a4c0-82312a1251ae)

![image](https://github.com/user-attachments/assets/a76745b4-a6cf-487d-a787-653c732417af)


Por fim fiz alguns testes para verificar os resultados (Classe Iphone):

![image](https://github.com/user-attachments/assets/ec888aa2-1c9b-4448-ab10-5136803d2473)


E obtive sucesso como mostram os resultados:

![image](https://github.com/user-attachments/assets/e76a99a8-03e9-492e-915e-2e454dbdd059)

Com esse resuldo comecei a desenvolver a classe de navegação e telefone com a mesma estrutura obtendo bons resultados como mostrado na imagem abaixo:

![img.png](img.png)


![img_2.png](img_2.png)
