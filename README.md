# Comparativo de Desempenho: Thread 1:1 vs Thread N:M

## Links:

- Gráfico comparativo: https://infogram.com/threads-1hnq41ow7vkek23

- Tabela de resultados: https://docs.google.com/spreadsheets/d/17qphdkiMcE-HcfuzC8urGXLdpdKCdd9dde5JUpPNhuc/edit?usp=sharing

## Relatório com análise dos resultados: 

   O experimento teve como objetivo comparar o desempenho entre os modelos Thread 1:1 e Thread N:M, medindo o tempo de execução de diferentes algoritmos. No modelo 1:1, cada tarefa possui sua própria thread, enquanto no modelo N:M foi utilizado um **ExecutorService** com 4 threads de sistema.

Os resultados mostraram que no modelo N:M, houve um aumento significativo no tempo total de execução em todas as tarefas. Isso aconteceu porque o executor precisou gerenciar milhares de tarefas em apenas quatro threads reais, o que elevou o custo de agendamento e troca de contexto.

No modelo Thread 1:1, cada tarefa teve uma thread dedicada, o que eliminou filas de espera e reduziu o tempo total. Mesmo com mais threads do que núcleos disponíveis, o sistema operacional conseguiu distribuir o processamento de forma eficiente. Na tabela acima é possível ver que, enquanto o modelo 1:1 concluiu 5000 tarefas em menos de 1 segundo, o modelo N:M levou mais de 19 segundos para o mesmo conjunto.

Com base nesses resultados, vemos que o modelo 1:1 é mais vantajoso quando o número de tarefas é muito maior que o número de threads possíveis. Nesses casos, o custo de criar novas threads é **menor** do que o custo de gerenciar filas e agendamentos internos. Já o modelo N:M é mais indicado para tarefas **longas** ou **bloqueantes**, em que o controle de recursos e o reuso de threads se tornam mais importantes que a velocidade bruta de execução.

## Autores:

- Diego Nunes
- Gustavo Henrique Schott
- Eduardo Erthal
- Leonardo Pereira







