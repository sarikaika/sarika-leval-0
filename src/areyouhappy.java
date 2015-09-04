import javax.swing.JOptionPane;


public class areyouhappy {
public static void main(String[] args) {
String areyouhappy=JOptionPane.showInputDialog("are you happy?");
if (areyouhappy.equals("yes")) {
JOptionPane.showMessageDialog(null,"keep doing whatever you're doing");
}
if (areyouhappy.equals("no")) {
	String wanttobehappy = JOptionPane.showInputDialog("do you want to be happy");
}


}
}
