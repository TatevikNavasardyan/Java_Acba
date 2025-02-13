package org.example.Game_stream_buffer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            // Ստեղծում ենք Map օբյեկտ՝ ֆայլի բովանդակությամբ
            Map map = new Map("C:\\Users\\tatevik.navasardyan\\IdeaProjects\\Java_Acba_a\\src\\main\\java\\org\\example\\Game_stream_buffer\\map.txt", Option.BUFFER); // Կարող եք փոխել SCANNER տարբերակին
            System.out.println("Map-ը հաջողությամբ կարդացվել է:");
            System.out.println("Քարտեզի բովանդակությունը՝");
            map.printMap(); // Տպում ենք քարտեզի բովանդակությունը
        } catch (IOException e) {
            System.out.println("Սխալ տեղի ունեցավ ֆայլի կարդալիս: " + e.getMessage());
        }
    }


}

