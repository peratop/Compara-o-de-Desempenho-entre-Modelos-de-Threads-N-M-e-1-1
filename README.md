## Comparativo de Desempenho: Thread 1:1 vs Thread NM

### Este projeto realiza testes de desempenho entre dois modelos de execução de threads:

- Thread 1:1 – Cada tarefa é mapeada diretamente para uma thread do sistema.

- Thread NM – Utiliza um número reduzido de threads de sistema para gerenciar várias tarefas.

## Resultados:

Foram medidos os tempos de execução (em milissegundos) de diferentes algoritmos sob os dois modelos.
Os resultados mostram que, no modelo Thread NM com 4 threads de sistema, houve grande aumento de tempo de execução em todas as tarefas, devido ao alto custo de agendamento e gerenciamento de múltiplas tarefas sobre poucas threads reais.

Já no modelo Thread 1:1, cada tarefa teve uma thread dedicada, resultando em menor tempo total de execução.

## Links:

- Gráfico comparativo: https://infogram.com/threads-1hnq41ow7vkek23

- Tabela de resultados: https://docs.google.com/spreadsheets/d/17qphdkiMcE-HcfuzC8urGXLdpdKCdd9dde5JUpPNhuc/edit?usp=sharing

## Relatório com análise dos resultados: 

## Autores:

- Diego Nunes
- Gustavo Henrique
- Eduardo Erthal
- Leonardo Pereira

