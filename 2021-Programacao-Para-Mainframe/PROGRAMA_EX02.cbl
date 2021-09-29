      ******************************************************************
      * Author: Júlia Lie Okita da Silva
      * Date: 18/09/2021
      * Purpose: Criação e manipulação de variáveis
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. PROGRAM_EX02.
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
           SPECIAL-NAMES.
               DECIMAL-POINT IS COMMA.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
      ***** CRIANDO VARIÁVEIS *****
       01 WS-VALORES.
      *     05 WS-NUM1  PIC 9(06).
      *     05 WS-NUM2  PIC 9(06).
      *     05 WS-RESUL PIC 9(09).
      *     05 WS-OP    PIC X(1).
           05 WS-NUM1      PIC S9(06)V99.
           05 WS-NUM2      PIC S9(06)V99.
           05 WS-RESUL     PIC S9(09)V99.
           05 WS-MASCARA   PIC -ZZ.ZZ9,99.
           05 WS-OP        PIC X(1).
       PROCEDURE DIVISION.
       P001-PRINCIPAL.
      ***** INICIANDO VARIAVEIS *****
           INITIALISE WS-VALORES

      ***** EXIBINDO NA TELA *****
           DISPLAY "Qual operacao (+, -, * ou /): "

      ***** CAPTURANDO DADOS *****
           ACCEPT WS-OP

           DISPLAY "INFORME O PRIMEIRO VALOR: "
           ACCEPT WS-NUM1

           DISPLAY "INFORME O SEGUNDO VALOR: "
           ACCEPT WS-NUM2

      ***** VERIFICANDO AS OPERAÇÕES
           IF WS-OP EQUAL "+"
               COMPUTE WS-RESUL = WS-NUM1 + WS-NUM2
               MOVE WS-RESUL   TO WS-MASCARA
               DISPLAY WS-NUM1 " + " WS-NUM2 " = " WS-MASCARA
           ELSE
               IF WS-OP EQUAL "-"
               COMPUTE WS-RESUL = WS-NUM1 - WS-NUM2
               MOVE WS-RESUL   TO WS-MASCARA
               DISPLAY WS-NUM1 " - " WS-NUM2 " = " WS-MASCARA
               ELSE
                   IF WS-OP EQUAL "*"
                   COMPUTE WS-RESUL = WS-NUM1 * WS-NUM2
                   MOVE WS-RESUL   TO WS-MASCARA
                   DISPLAY WS-NUM1 " * " WS-NUM2 " = " WS-MASCARA
                   ELSE
                       IF WS-OP EQUAL "/"
                       COMPUTE WS-RESUL = WS-NUM1 / WS-NUM2
                       MOVE WS-RESUL   TO WS-MASCARA
                       DISPLAY WS-NUM1 " / " WS-NUM2 " = " WS-MASCARA
                       ELSE
                           DISPLAY "ERRO - CARACTER INVALIDO"
           END-IF.

           STOP RUN.
       END PROGRAM PROGRAM_EX02.
