      ******************************************************************
      * Author: Júlia Lie Okita da Silva
      * Date: 25/09/2021
      * Purpose: Calcular as raízes de uma equação de 2° grau
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. AULA04_EX02.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 WS-VALORES.
           05 WS-A                 PIC S9(09)V99.
           05 WS-B                 PIC S9(09)V99.
           05 WS-C                 PIC S9(09)V99.
           05 WS-DELTA             PIC S9(09)V99.
           05 WS-RAIZ-DELTA        PIC 9(09)V99.
           05 WS-X1                PIC S9(09)V99.
           05 WS-X2                PIC S9(09)V99.
       PROCEDURE DIVISION.
       MAIN-PROC SECTION.
           DISPLAY "PROGRAMA QUE CALCULA EQUACOES DE SEGUNDO GRAU"
           DISPLAY "REPRESENTACAO => AX^2 + BX + C = 0"
           DISPLAY "DIGITA 'A': "
           ACCEPT WS-A
           DISPLAY "DIGITE 'B': "
           ACCEPT WS-B
           DISPLAY "DIGITE 'C': "
           ACCEPT WS-C.

           IF WS-a EQUAL 0
               DISPLAY "'A' PRECISA SER POSITIVO!"
               GO TO P002-FIM
           ELSE
               COMPUTE WS-DELTA = WS-B * WS-B - 4 * WS-A * WS-C
           END-IF.

           IF WS-DELTA LESS 0
               DISPLAY "IMPOSSIVEL CALCULAR! O VALOR DE DELTA PRECISA "
               "SER POSITIVO!"
               GO TO P002-FIM
           END-IF.

           COMPUTE WS-RAIZ-DELTA = FUNCTION SQRT(WS-DELTA)

           COMPUTE WS-X1 = (-WS-B + WS-RAIZ-DELTA) / (2 * WS-A)
           COMPUTE WS-X2 = (-WS-B - WS-RAIZ-DELTA) / (2 * WS-A)

           DISPLAY "RAIZ 1 = " WS-X1
           DISPLAY "RAIZ 2 = " WS-X2.

       P002-FIM.
           STOP RUN.
       END PROGRAM AULA04_EX02.
