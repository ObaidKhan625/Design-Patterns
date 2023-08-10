package net.media.training.designpattern.abstractfactory;

class IphoneFactory implements PhoneFactory {

    public Screen assembleScreen(){
        Screen screen = new IphoneScreen();
        return screen;
    }
    
    public Case assembleCase(MotherBoard motherBoard, Screen screen){
       Case phoneCase = new IphoneCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
       return phoneCase;
    }

    public MotherBoard assembleMotherboard(){
      MotherBoard motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new IphoneProcessor());
        return motherBoard;
    }
}