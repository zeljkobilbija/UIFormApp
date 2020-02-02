import javax.swing.*;
import javax.tools.DocumentationTool.*;

public class MyGUIForm extends JFrame{

    private JButton OKButton;
    private JTextField textField1;
    private JPanel myGuiPanel;


    public static void mojaFunkcija(){
        System.out.println("Halo  GUI");
    }

    public MyGUIForm(){


        add(myGuiPanel);

        setTitle("Moj Title");

        setSize(800, 500);



    }
}
