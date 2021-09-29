      ******************************************************************
      * Author: Júlia Lie Okita da Silva
      * Date: 25/09/2021
      * Purpose: Calcular juros em cima do número de parcelas
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. AULA04_EX01.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 WS-VALORES.
           05 WS-TOTAL                 PIC 9(09)V99.
           05 WS-TOTAL-JUROS           PIC 9(09)V99.
           05 WS-PARCELAS              PIC 9(09)V99.
               88 WS-PARCELAS-JUROS    VALUE 1 THRU 5.
           05 WS-VALOR-PARCELAS        PIC 9(09)V99.
           05 WS-NUM-PARCELAS          PIC 9.

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
           INITIALISE WS-VALORES

           DISPLAY "INFORME O VALOR TOTAL DA COMPRA: "
           ACCEPT WS-TOTAL

           DISPLAY "INFORME O NUMERO DE PARCELAS: "
           DISPLAY "1  - 0% DE JUROS"
           DISPLAY "2  - 2% DE JUROS"
           DISPLAY "4  - 5% DE JUROS"
           DISPLAY "6  - 10% DE JUROS"
           DISPLAY "12 - 18% DE JUROS"
           ACCEPT WS-PARCELAS

           COMPUTE WS-NUM-PARCELAS = WS-PARCELAS

           EVALUATE WS-PARCELAS
               WHEN 1
                   COMPUTE WS-PARCELAS = 0
               WHEN 2
                   COMPUTE WS-PARCELAS = 0.02
               WHEN 4
                   COMPUTE WS-PARCELAS = 0.05
               WHEN 6
                   COMPUTE WS-PARCELAS = 0.1
               WHEN 12
                   COMPUTE WS-PARCELAS = 0.18
               WHEN OTHER
                   DISPLAY "NUMERO DE PARCELA INVALIDO"
           END-EVALUATE

           COMPUTE WS-TOTAL-JUROS = WS-TOTAL + (WS-TOTAL * WS-PARCELAS)

           COMPUTE WS-VALOR-PARCELAS = WS-TOTAL-JUROS / WS-NUM-PARCELAS

           DISPLAY "VALOR TORAL: " WS-TOTAL
           DISPLAY "NUMERO DE PARCELAS: " WS-NUM-PARCELAS
           DISPLAY "VALOR TOTAL APOS OS JUROS: " WS-TOTAL-JUROS
           DISPLAY "VALOR DAS PARCELAS: " WS-VALOR-PARCELAS

           STOP RUN.
       END PROGRAM AULA04_EX01.
