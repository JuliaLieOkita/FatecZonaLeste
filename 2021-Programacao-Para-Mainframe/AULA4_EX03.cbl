      ******************************************************************
      * Author: Júlia Lie Okita da Silva
      * Date: 25/09/2021
      * Purpose: Calcular velocidade média do veículo
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. AULA04_EX03.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 WS-VALORES.
           05 WS-KM               PIC S9(07)V9(02).
           05 WS-HORA             PIC S9(03)V9(02).
           05 WS-VELOCIDADE       PIC S9(03)V9(02).
       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
           DISPLAY "INSIRA A DISTANCIA PERCORRIDA PELO VEICULO EM KM: "
           ACCEPT WS-KM

           DISPLAY "INSIRA O TEMPO GASTO PARA PERCORRER ESSA DISTANCIA "
           "EM HORAS"
           ACCEPT WS-HORA

           IF WS-KM GREATER 0 AND WS-HORA GREATER 0
               COMPUTE WS-VELOCIDADE = WS-KM / WS-HORA
               DISPLAY "VELOCIDADE MEDIA = " WS-VELOCIDADE "Km/h"
           ELSE
               DISPLAY "OS VALORES PRECISAM SER POSITIVOS!"
           END-IF.

           STOP RUN.
       END PROGRAM AULA04_EX03.
