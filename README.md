# Lab10-Psoft

Padrão utilizado foi o State que permite que se utilize composições para que se crie uma variação de comportamento, segundo o padrão State o comportamento é o ponto central de cada classe e representa um comportamento que determinado objeto pode assumir. O padrão State é mais utilizado para especificar comportamentos em jogos.

Primeiro começa implementando uma class modelo. Crio uma variável de estado para interface MarioAções(Ações do Mario durante o jogo) e para cada estado que o personagem Mario possa assumir eu crio um método.

Cria uma interface para implementar todos os estados que o personagem pode assumir, seguindo o padrão Strategy, as classes que assumem esse comportamento, assinam este contrato e implementam a interface.
