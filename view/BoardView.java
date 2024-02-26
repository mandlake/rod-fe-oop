package view;

import builder.BoardBuilder;
import model.BoardDTO;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void board() {
        List<BoardDTO> articles = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        for(int i = 0; i < 5; i++) {
            articles.add(new BoardBuilder()
                    .title(util.createRandomText())
                    .content(util.createRandomContent())
                    .writer(util.createRandomName())
                    .build());
        }

//        for(BoardDTO b : articles) {
//            System.out.println(b.getTitle() + "\n"
//                    + b.getContent() + "\n"
//                    + b.getWriter() + "\n");
//        }

        articles.forEach( i -> {
            System.out.print(i.getTitle() + "\n"
                    + i.getContent() + "\n"
                    + i.getWriter() + "\n\n");
        });
    }
}
