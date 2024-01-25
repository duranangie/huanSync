package com.u2team.huansync.activity.trivia;

import com.u2team.huansync.activity.trivia.question.controller.QuestionController;
import com.u2team.huansync.activity.trivia.question.model.Question;
import java.util.*;
import java.util.stream.Collectors;

public class pruebaTrivia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> jugadoresRonda1 = new ArrayList<>(Arrays.asList("Juan", "Cristina", "Gonzalo", "Santiago", "Pedro", "Camilo", "Violeta", "Pedro"));
        List<String> jugadoresRonda2 = new ArrayList<>();
        List<String> jugadoresRonda3 = new ArrayList<>();
        
        List<Question> questions = QuestionController.getAllQuestions();
        System.out.println(questions.get(49));
        List<Question> questionsEasy = questions.stream().filter(question -> "easy".equalsIgnoreCase(question.getDifficulty().getName())).collect(Collectors.toList());
        List<Question> questionsMedium = questions.stream().filter(question -> "medium".equalsIgnoreCase(question.getDifficulty().getName())).collect(Collectors.toList());
        List<Question> questionsHard = questions.stream().filter(question -> "hard".equalsIgnoreCase(question.getDifficulty().getName())).collect(Collectors.toList());

        System.out.println(questionsEasy);

//        List<String> preguntas = Arrays.asList(
//                "¿Cuál es tu película favorita y por qué la consideras especial?",
//                "¿Tienes alguna meta específica que estés trabajando actualmente?",
//                "¿Cuál es tu canción favorita en este momento y por qué la disfrutas?",
//                "¿Alguna vez has tenido una experiencia de viaje que haya cambiado tu perspectiva?",
//                "¿Hay algún libro que hayas leído recientemente y que recomendarías?",
//                "¿Practicas algún deporte o actividad física con regularidad?",
//                "¿Cuál es tu comida favorita y tienes una receta que te gustaría compartir?",
//                "¿Tienes algún hobby que te apasione y que te haya enseñado algo importante?",
//                "¿Qué logro personal te hace sentir más orgulloso/a hasta ahora?",
//                "¿Cómo sería tu día perfecto de principio a fin?"
//        );
//
//        String respuesta = "1";
//
        while (true) {
            int pointsJugador1 = 0;
            int pointsJugador2 = 0;

            while (!jugadoresRonda1.isEmpty()) {
                int indexQuestion = new Random().nextInt(questionsEasy.size());
                String answer = questionsEasy.get(indexQuestion).getAnswer();

                System.out.println(questionsEasy.get(indexQuestion).getQuestion());
                System.out.println("Respuesta jugador " + jugadoresRonda1.get(0) + ": ");
                String r1 = scanner.nextLine();
                System.out.println("Respuesta jugador " + jugadoresRonda1.get(1) + ": ");
                String r2 = scanner.nextLine();

                if (r1.equalsIgnoreCase(answer)) {
                    pointsJugador1++;
                    if (pointsJugador1 == 3) {
                        jugadoresRonda2.add(jugadoresRonda1.remove(0));
                        jugadoresRonda1.remove(0);
                        break;
                    }
                } else if (r2.equalsIgnoreCase(answer)) {
                    pointsJugador2++;
                    if (pointsJugador2 == 3) {
                        jugadoresRonda2.add(jugadoresRonda1.remove(1));
                        jugadoresRonda1.remove(0);
                        break;
                    }
                }
                System.out.println("Jugador 1: " + pointsJugador1);
                System.out.println("Jugador 2: " + pointsJugador2);
            }
            System.out.println(jugadoresRonda1);
            System.out.println(jugadoresRonda2);

            if (jugadoresRonda1.isEmpty())
                break;
        }
//
//        while (true) {
//            int pointsJugador1 = 0;
//            int pointsJugador2 = 0;
//
//            while (!jugadoresRonda2.isEmpty()) {
//                System.out.println(preguntas.get(new Random().nextInt(preguntas.size())));
//                System.out.println("Respuesta jugador " + jugadoresRonda2.get(0) + ": ");
//                String r1 = scanner.nextLine();
//                System.out.println("Respuesta jugador " + jugadoresRonda2.get(1) + ": ");
//                String r2 = scanner.nextLine();
//
//                if (r1.equalsIgnoreCase(respuesta)) {
//                    pointsJugador1++;
//                    if (pointsJugador1 == 3) {
//                        jugadoresRonda3.add(jugadoresRonda2.remove(0));
//                        jugadoresRonda2.remove(0);
//                        break;
//                    }
//                } else if (r2.equalsIgnoreCase(respuesta)) {
//                    pointsJugador2++;
//                    if (pointsJugador2 == 3) {
//                        jugadoresRonda3.add(jugadoresRonda2.remove(1));
//                        jugadoresRonda2.remove(0);
//                        break;
//                    }
//                }
//                System.out.println("Jugador 1: " + pointsJugador1);
//                System.out.println("Jugador 2: " + pointsJugador2);
//            }
//            System.out.println(jugadoresRonda2);
//            System.out.println(jugadoresRonda3);
//
//            if (jugadoresRonda2.isEmpty())
//                break;
//        }
//
//        while (true) {
//            int pointsJugador1 = 0;
//            int pointsJugador2 = 0;
//
//            while (!(jugadoresRonda3.size() == 1)) {
//                System.out.println(preguntas.get(new Random().nextInt(preguntas.size())));
//                System.out.println("Respuesta jugador " + jugadoresRonda3.get(0) + ": ");
//                String r1 = scanner.nextLine();
//                System.out.println("Respuesta jugador " + jugadoresRonda3.get(1) + ": ");
//                String r2 = scanner.nextLine();
//
//                if (r1.equalsIgnoreCase(respuesta)) {
//                    pointsJugador1++;
//                    if (pointsJugador1 == 3) {
//                        jugadoresRonda3.remove(1);
//                        break;
//                    }
//                } else if (r2.equalsIgnoreCase(respuesta)) {
//                    pointsJugador2++;
//                    if (pointsJugador2 == 3) {
//                        jugadoresRonda3.remove(0);
//                        break;
//                    }
//                }
//                System.out.println("Jugador 1: " + pointsJugador1);
//                System.out.println("Jugador 2: " + pointsJugador2);
//            }
//            System.out.println(jugadoresRonda3);
//
//            if ((jugadoresRonda3.size() == 1))
//                break;
//        }
    }
}