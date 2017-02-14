package woordenapplicatie.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import logic.*;

/**
 * FXML Controller class
 *
 * @author frankcoenen
 */
public class WoordenController implements Initializable
{

    private LogicImplementation Aantal;
    private LogicImplementation Sorteer;
    private LogicImplementation Frequentie;
    private LogicImplementation Concordantie;

    private static final String DEFAULT_TEXT = "Een, twee, drie, vier\n"
            + "Hoedje van, hoedje van\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier\n"
            + "\n"
            + "Heb je dan geen hoedje meer\n"
            + "Maak er één van bordpapier\n"
            + "Eén, twee, drie, vier\n"
            + "Hoedje van papier\n"
            + "\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van, hoedje van\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier\n"
            + "\n"
            + "En als het hoedje dan niet past\n"
            + "Zetten we 't in de glazenkas\n"
            + "Een, twee, drie, vier\n"
            + "Hoedje van papier";

    @FXML
    private Button btAantal;
    @FXML
    private TextArea taInput;
    @FXML
    private Button btSorteer;
    @FXML
    private Button btFrequentie;
    @FXML
    private Button btConcordantie;
    @FXML
    private TextArea taOutput;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        taInput.setText(DEFAULT_TEXT);
        Aantal = new Aantal();
        Sorteer = new Sorteer();
        Frequentie = new Frequentie();
        Concordantie = new Concordantie();
    }

    @FXML
    private void aantalAction(ActionEvent event)
    {
        // Aantal.Bewerk(convertToWords());
    }

    @FXML
    private void sorteerAction(ActionEvent event)
    {
        //   Sorteer.Bewerk(convertToWords());
    }

    @FXML
    private void frequentieAction(ActionEvent event)
    {
        //    Frequentie.Bewerk(convertToWords());
    }

    @FXML
    private void concordatieAction(ActionEvent event)
    {
        //    Concordantie.Bewerk(convertToWords());
    }

    public String[] convertToWords()
    {
        String woorden = DEFAULT_TEXT.replace("\n", " ");
        woorden = woorden.toLowerCase();
        woorden = woorden.replace(",", "");
        System.out.println(woorden);
        return woorden.split(" ");
    }


    
     
}
