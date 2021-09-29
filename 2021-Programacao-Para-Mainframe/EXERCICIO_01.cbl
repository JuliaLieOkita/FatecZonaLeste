      ******************************************************************
      * Author: Júlia Lie Okita da Silva
      * Date: 18/09/2021
      * Purpose: Calcular IMC
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. ECERCICIO_01.
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
           SPECIAL-NAMES.
               DECIMAL-POINT IS COMMA.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 WS-VALORES.
           05 WS-PESO      PIC S9(03)V99.
           05 WS-ALTURA    PIC S9(01)V99.
           05 WS-RESULT    PIC S9(09)V99.
           05 WS-MASCARA   PIC ZZ9,99.
       PROCEDURE DIVISION.
       MAIN-PROC SECTION.
           INITIALISE WS-VALORES

           DISPLAY "PROGRAMA QUE CALCULA O IMC"

           DISPLAY "INFORME SEU PESO (EXEMPLO: 56,7Kg): "
           ACCEPT WS-PESO

           DISPLAY "INFORME SUA ALTURA (EXEMPLO: 1,83m): "
           ACCEPT WS-ALTURA

           IF WS-PESO IS NUMERIC AND WS-ALTURA IS NUMERIC AND WS-PESO
               GREATER 0 AND WS-ALTURA GREATER 0
               GO TO P001-PRINCIPAL
           ELSE
               DISPLAY "ERRO - CARACTER INVALIDO"
               GO TO P002-FIM
           END-IF.

       P001-PRINCIPAL.
           COMPUTE WS-RESULT = WS-PESO / (WS-ALTURA * WS-ALTURA)
           MOVE WS-RESULT   TO WS-MASCARA

           IF WS-RESULT LESS 18,5
               DISPLAY "DESNUTRIDO - IMC: " WS-MASCARA
           ELSE
               IF WS-RESULT NOT LESS 18,5 AND NOT GREATER 24,9
                   DISPLAY "ADEQUADO - IMC: " WS-MASCARA
               ELSE
                   IF WS-RESULT NOT LESS 25 AND NOT GREATER 29,9
                       DISPLAY "PRE-OBESO - IMC: " WS-MASCARA
                   ELSE
                       IF WS-RESULT NOT LESS 30 AND NOT GREATER 34,9
                           DISPLAY "OBESIDADE GRAU I - IMC: " WS-MASCARA
                           ELSE
                               IF WS-RESULT NOT LESS 35 AND NOT
                                   GREATER 39,9
                               DISPLAY "OBESIDADE GRAU II - IMC:"
                               WS-MASCARA
                                   ELSE
                                       DISPLAY "IMC INCALCULAVEL"
           END-IF.

       P002-FIM.
           STOP RUN.
       END PROGRAM ECERCICIO_01.
