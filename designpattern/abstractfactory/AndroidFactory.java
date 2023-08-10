package net.media.training.designpattern.abstractfactory;

class AndroidFactory implements PhoneFactory{
    
    public Screen assembleScreen(){
        Screen screen = new AndroidScreen();
        return screen;
    }
    
    public Case assembleCase(MotherBoard motherBoard, Screen screen){
        Case phoneCase = new AndroidCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
    
    public MotherBoard assembleMotherboard(){
        MotherBoard motherBoard = new AndroidMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        return motherBoard;
    }
}