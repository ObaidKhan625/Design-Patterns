public abstract class PhoneFactory {
    public Screen assembleScreen();
    public Case assembleCase(MotherBoard motherBoard, Screen screen);
    public MotherBoard assembleMotherboard();
}
