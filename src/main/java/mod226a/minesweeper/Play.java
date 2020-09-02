package mod226a.minesweeper;

public class Play {

    UserInterface userInterface = new UserInterface();
    ChosenField chosenField = new ChosenField();
    Field field = new Field();
    Cell[][] cells = new Cell[8][8];
    Bomb[] bombs = new Bomb[5];

    public void start(){
        //userInterface.commandHint();
        //chosenField.takeInput();
        //userInterface.outputPlayerInput(chosenField);
        field.createBombs(bombs);
        field.generate(cells,bombs);
        userInterface.showField(cells);
    }

}
