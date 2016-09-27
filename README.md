# ProgramacaoI

Essa pasta contém os programas da lista 1 de programação da Faculdade AVANTIS.


FACULDADE AVANTIS
(Credenciamento portaria MEC N. 1.146, Publicada no D.O.U de 13/09/2012)
Av. Marginal Leste, n. 3600, KM 132 
–
Bairro dos Estados 
–
Balneário Camboriú 
–
SC
CEP 88.339
-
125 
–
Tel. (47) 3363 0631 
–
www.avantis.edu.br
LISTA DE EXERCÍCIOS 
1
-
JAVA BÁSICO
Observações:
•
A linguagem convencionada para o desenvolvimento desta atividade é Java
.
•
Os  arquivos  com  código  fonte  (arquivos  com  extensão  .java)  deverão  ser  compactados  e 
enviados  na  atividade 
corresponde  aberta  no 
Edmodo
.
Não  serão  considerados  trabalhos 
entregue fora do prazo ou enviado por outros meios.
•
Recomenda
-
se a utilização do IDE Eclipse para o desenvolvimento da atividade, no entanto, 
poderá se utilizar qualquer IDE.
•
Favor não enviar os arquivos compilados (arqui
vos com extensão .class).
O objeti
vo desta lista é praticar 
conceitos 
básicos de programação
na linguagem Java
.
Sendo assim, u
tilizando
-
se dos conceitos discutidos em aula, resolva as seguintes questões:
1)
Escreva um programa que solicite e armazene em variá
veis o seu nome, data de nascimento, 
endereço e seu número de telefone
.
Na sequência exiba o conteúdo destas variáveis na tela
, e 
calcule  e  apresente  também  a  sua  idade.  Espera
-
se  que  os  dados  sejam  armazenados  em 
variáveis  de  tipo  adequado  ao  contexto  da 
informação,  como  por  exemplo  a  data  de 
nascimento em uma variável do tipo 
Calendar
.
2)
Pedra,   papel   e   tesoura,   também 
chamado de 
Janken
-
pon
é um jogo 
de  mãos  recreativo 
e
simples
para 
duas   ou   mais   pessoas,   que   não 
req
uer 
equipamentos 
nem 
habilidade
.
O 
jogo 
é
frequentemente   empregado   como 
método    de    seleção    (como    na 
escolha de equipes para a prática desportiva, por exemplo), assim como lançar moedas, jogar 
dados, entre outros.
No 
jogo
, os jogadores devem simultaneamente esticar a mão, na qual cada 
um formou um 
símbolo (que significa pedra, papel ou tesoura). Então, os jogadores comparam 
os  símbolos  para  decidir  quem  ganhou,  da  seguinte  forma:
pedra  ganha  da  tesoura 
(amassando
-
a ou quebrando
-
a); tesoura ganha do papel (cortando
-
o); e, papel ganha da pedra 
(embrul
hando
-
a). 
A  pedra  é  simbolizada  por  um  punho  fechado;  a  tesoura,  por  dois  dedos 
esticados; e o papel, pela mão aberta. Caso dois jogadores façam o mesmo gesto, ocorre um 
empate,  e  geralmente  se  joga  de  novo  até  desempatar.
Sabendo  disso
,  pede
-
se  que  se 
imp
lemente o programa “
AppJankenP
on”, observando
as regras anteriormente descritas.
3)
O jogo da velha é um jogo e passatempo popular. É um jogo de regras extremamente 
simples, 
que
não  traz  grandes  dificuldades  para  seus  jog
adores  e  é  facilmente  aprendido
.
Seu 
nome 
teria  se  originado  na  Inglaterra,  quando  nos  finais  da  tarde,  mulheres  se  reuniram  para 
conversar  e  bordar.  As  mulheres  idosas,  por  não  terem 
mais condições de bordar em razão da fraqueza da visão, 
jogavam  este  jogo  simples,  que  pa
ssou  a  ser  conhecido
como o da “
velha
”
.
O jogo consiste de um tabuleiro de 
três   linhas   por   três 
colunas,   onde   d
ois   jogadores 
escolhem uma marcação cada um, geralmente um círculo 
(O) e um xis (X).
Os jogadores jogam com as mãos uma 
marcação  por  vez  em  uma  lacuna  que  esteja  vaz
ia
no  tabuleiro
.
O  objetivo  é  conseguir  3 
círculos  ou  três  xis  em  linha  horizontal,  vertical  ou  diagonal  ,  e  ao  mesmo  tempo,  quando 
possível, impedir o adversário de ganhar na próxima jogada.
Quando um jogador conquista o 
objetivo,  costuma
-
se  riscar  os  trê
s  símbolos.
Quando  um  dos  jogadores  vence,  o  mesmo 
começa  a  outra  partida
.
Agora,  sabendo  das  regras  do  jogo  implemente  a  estrutura  de 
ifs
aninhados para verificar quem é o ganhador
(não é necessário a implementação o jogo inteiro)
a partir do código descrito na Tabela 1
. 
Vale lembrar que a
verificação 
do ganhador 
pode ser 
feita pela expressão 
tabuleiro[
nL
inha][
nC
oluna] == jogador
.
Tabela 
1
-
Código fonte inicial para o jogo da velha
public
class
AppTicTacTo
e {
public
static
void
main(String[] 
args
) {
char
jogador1
= 
'X'
;
char
jogador2
= 
'0'
;
char
[][] 
tabuleiro
= 
new
char
[3][3];
tabuleiro
[0][0] = 
'X'
;
tabuleiro
[0][1] = 
'0'
;
tabuleiro
[0][1] = 
'X'
;
tabuleiro
[1][0] = 
'0'
;
tabuleiro
[1][1] = 
'0'
;
tabuleiro
[1][2] = 
'X'
;
tabuleiro
[2][0] = 
'X'
;
tabuleiro
[2][1] = 
'0'
;
tabuleiro
[2][2] = 
'X'
;
}
}
4)
Descreva um programa que dado o valor de um produto e o lucro sobre o me
smo, calcule o 
valor de venda e apresente na tela os dados detalhados
.
5)
Descreva  programa  para  calcular  o  salário  de  um  funcionário.  Considerar  que  o  mesmo 
trabalha  30  dias  por  mês  e  8  horas  por  dia.  No  entanto,  o  funcionário  pode  realizar  horas 
extras, neste caso solicite o número de total de horas extras realizadas no mês. 
Considerar que 
as horas extras valem 50% a mais do que as horas trabalhadas normalmente
. Informe os dados 
detalhados na tela.
6)
Anualmente,  boa  parte  dos  proprietários  de  imóveis  de  todas  as  regiões  do  Brasil  têm  que 
encarar aquela que é uma das mais 
importantes taxas imobiliárias do país, o Imposto sobre a 
Propriedade Predial e Territorial Urbana (IPTU).
A contribuição é tão tradicional dentro da 
rotina  imobiliária  do  país  que  pouca  gente  sabe  verificar  se  está  pagando  um  imposto 
compatível  com  as  con
dições  estruturais  do 
imóvel  e  da  região  em  que  ele  está  localizado.
Isso  porque  o  tributo  é  definido  com  base  no 
valor  venal  do  imóvel,  calculado  a  partir  da 
Planta Genérica de Valores Imobiliários (PGVI) 
do município. Este documento oficial cataloga o 
pr
eço médio do metro quadrado em cada via da 
cidade. Assim, para descobrir quanto você vai pagar de IPTU, basta aplicar ao valor venal da 
sua   propriedade   as   alíquotas   determinadas   pela   legislação   municipal.   Boa   parte   dos 
municípios  adota  o  c
álculo  progressiv
o  do  imposto.  “
A  alíquota  é  definida  pelo  valor  do 
imóvel.  Quando 
menor  o  valor,  menor  a  alíquota”
,  afirma  Nelson  Lacerda,  advogado 
tributário do escritório Lacerda & Lacerda. Por exemplo, o proprietário de um imóvel avaliado 
em 500.000 reais que fica em u
m município cuja alíquota, para esta faixa de preço, é de 1,4%, 
irá pagar 7.000 reais de imposto
(Fonte: Exame.com 
-
Como é feito o cálculo do IPTU
, 2010)
.
Sabendo  disso,  faça  um  programa  que  permita  imprimir  o  valor  do  IPTU  a  pagar  a 
partir  do  valor  venal
.  Considere  também  um  desconto  de  20%  para  pagamentos  em  conta 
única até a data de hoje, e de 10% para pagamentos até dois dias após a data de hoje, também 
em conta única. O programa deve dar um desconto de 15% para os contribuintes que tiverem 
o pagame
nto
do IPTU do ano passo em dia, indiferente de pagamento a vista, ou parcelado. 
O programa também deve apresentar o valor para o pagamento parcelado em 12X.
7)
De acordo com a Consolidação das Leis do Trabalho (CLT), quem possui carteira assinada 
tem direito a 
30 dias de férias depois de completar 12 meses na mesma organização. Caso a 
folga não seja possível logo após esse período, a empresa deve liberar o funcionário para as 
férias  nos  11  meses  seguintes  ou  terá  de  pagar  a  ele  o  dobro  da  remuneração. 
Em  algumas
situações, as férias de 30 dias são divididas em dois períodos. Um deles não pode ser menor 
que 10 dias 
sequenciais
. A lei também permite ao empregado “vender” 10 dias das férias à 
empresa e assim convertê
-
los em dinheiro.
Além do salário base, é necessár
io saber quanto 
tempo de trabalho o empregado possui desde o vencimento das últimas férias. Se esse período 
for de 12 meses, ele receberá o valor integral das férias, acrescido de 1/3 de abono. Se inferior, 
receberá proporcionalmente, ou seja, 1/12 por mês
trabalhado.
Sabendo  disso,  faça  um  programa  que  calcule  as  férias  de  empregados,  considere 
também  se  o  empregado  vendeu  algum  dia  de  suas  férias.    Não  esqueça  que  seu  programa 
deve de estar em conformidade com o CLT.
8)
O transporte internacional de longo p
ercurso está sendo utilizado com 
frequência
, devido ao 
aumento  das  exportações.  Ele  pode  tanto  ser  por  meio  rodoviário,  como  por 
marítimo,
ferroviário
ou aéreo.  As exportações para outros continentes, na sua maioria são feitas por 
meio  marítimo,  pois  é  ma
is  cômodo,  seguro  e  viável,  tanto  para  quem  importa  como  para 
quem  exporta.  Esse  modal  permite 
ainda  que,  a  mercadoria  seja  levada 
em 
container
,  fazendo  com  que  a 
carga   do   navio   tenha   um   maior 
aproveitamento  e  a  mercadoria  viaje 
com  maior  segurança.
O
cont
ainer
nada mais é que uma caixa inviolável, 
podendo  ser  fabricado  em  madeira, 
alumínio e aço. Para a exportação pelos portos da Região Sul do Brasil, é mais comum utilizar o de aço, já que nessa região a maresia é um dos itens que deve ser levado em conta e o aço torna-se  resistente  sem  ser  muito  oneroso  como  o  alumínio  e  sem  se  decompor  facilmente como  o container de  madeira.
Os contêineres têm  suas  medidas  em  “pés”  ou  “polegadas”, sendo padronizados nas medidas de 20’ e 40’.
Na atualidade, além das medidas inglesas, os contêineres já   são   identificados   pelo   sistema   métrico-decimal,
apresentando   as   duas classificações  para  facilitar  o  transporte.  Devido  a  essa  padronização,  eles  são  muito 
utilizados, pois conseguem promover maior agilidade na ova e desova da mercadoria, maior 
segurança para a carga e mais praticidade no transporte. O  termo  “ova”  de container significa  o  procedimento  de  carregar,  de  encher  o container  com  carga,  e  o  termo  “desova”  significa  proceder  a  descarga,  a  retirada  da 
mercadoria   transportada.   Uma   terminologia   também   muito   utilizada   no   transporte internacional, que pode aparecer como sinônimo para ova é “estufar”, que possui o mesmo significado.
Atualmente a unitização das cargas tem sido utilizada para agrupar vários volumes em um volume único, em cima de 
pallets e envolto com filme chamado stretch, com o intuito de proporcionar maior agilidade e segurança na carga e descarga. O 
stretch é um filme plástico, comercializado em grandes rolos, que envolve as cargas com o intuito inicial de unitizá-las. 
Como acessório, o stretch impermeabiliza a carga, e garante uma maior segurança, pois torna-se mais uma embalagem secundária a ser colocada na carga, diminuindo a chance de roubo de unidades transportadas.
A utilização de pallets está crescendo porque facilita a ova e desova do contêiner. Isso evita um custo oneroso devido à demora na manipulação de cargas soltas e o risco de extravio de volumes.
A  ocupação  dos  contêineres  no  caso  de  carga  unitizadas,  deve  ocorrer  pelo  espaço cúbico,  levando  em  consideração  as  dimensões  das  cargas. 
Contêineres
de  20’  são  mais 
indicados para cargas mais pesadas, p
ois tem um volume cúbico menor e uma pesagem maior.
Informações do 
container
dry
de 20 pés 
standard
•
Comprimento do 
container
dry
de 20 pés 
standard
: 6.058 m 
•
Largura do 
container
dry
de 20 pés 
standard
: 2.438 m 
•
Altura do 
container
dry
de 20 pés 
standard
:
2.591 m 
•
Capacidade de carga útil do 
container
dry
de 20 pés 
standard
: 21,780 kg 
•
Tara aproximada do 
container
dry
de 20 pés 
standard
: 2,220 kg
Informações do 
container
dry
de 40 pés 
standard
•
Comprimento do 
container
dry
de 40 pés 
standard
: 12.035 m 
•
Largura do 
container
dry
de 40 pés 
standard
: 2.350 m 
•
Altura do 
container
dry
de 40 pés 
standard
: 2.690 m 
•
Capacidade de carga útil do 
container
dry
de 
4
0 pés 
standard
: 2
8,
8
0
0 kg 
•
Tara aproximada do 
container
dry
de 
40 pés 
standard
: 3
,
70
0 kg
Sabendo  disso,  implemente  um  programa  que  permita  informar  quantas  caixas  de  um 
determinado  produto  podem  comportar  dentro  de 
cada  tipo  de
container
.  Não  esqueça  de 
considerar  as  informações  fornecidas  no  texto  deste  exerc
ício,  e  indicar  o 
container
mais 
a
dequado para o produto informado.
9)
Escreva um programa que leia um número inteiro e o classifique como positivo, negativo ou 
zero.
