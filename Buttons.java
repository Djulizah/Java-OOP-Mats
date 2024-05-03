public class Buttons {    
    public static void main(String[] args) {
        //instance each button
        ButtonTriangle attack = new ButtonTriangle();
        ButtonCircle jump = new ButtonCircle();
        ButtonRectangle aim = new ButtonRectangle();
        ButtonX ult = new ButtonX();

        //instance our event handler
        EventHandler playerhHandler = new EventHandler();

        playerhHandler.handleBtnTap(jump);
        playerhHandler.handleBtnTap(attack);
        playerhHandler.handleBtnTap(attack);
        playerhHandler.handleBtnTap(aim);
        playerhHandler.handleBtnTap(attack);
        playerhHandler.handleBtnTap(ult);
    }
}

interface Button {
    void onClick();
}

class ButtonTriangle implements Button{
public ButtonTriangle() {}

    @Override
    public void onClick() {
        System.out.println("User is attacking!");
    }
}

class ButtonCircle implements Button{
    public ButtonCircle() {}

    @Override
    public void onClick() {
        System.out.println("User is jumping!");
    }
}

class ButtonRectangle implements Button{
    public ButtonRectangle() {}

    @Override
    public void onClick() {
        System.out.println("User is aiming!");
    }
}

class ButtonX implements Button{
    public ButtonX() {}

    @Override
    public void onClick() {
        System.out.println("User is using ultimate!");
    }
}

class EventHandler {
    public void handleBtnTap(Button button) {
        button.onClick();
    }
}