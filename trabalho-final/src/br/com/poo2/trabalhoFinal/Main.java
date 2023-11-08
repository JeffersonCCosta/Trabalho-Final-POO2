package br.com.poo2.trabalhoFinal;

import br.com.poo2.trabalhoFinal.application.GameAppService;
import br.com.poo2.trabalhoFinal.ui.AppFrame;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.swing.*;

public class Main {

    private static final Logger logger = LogManager.getLogger("UNOAPP");

    public static void main(String[] args) {

        var appService = new GameAppService();

        SwingUtilities.invokeLater(() -> {
            new AppFrame(appService);

            logger.info("UNO app is launched");
        });
    }

}
