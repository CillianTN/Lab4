package exercise4;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {

        String name, isbn, output = "";
        double cost;
        int pages;


        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s%-15s%s","Title","Price","ISBN","Pages"));


        name = JOptionPane.showInputDialog("Please enter the name of your favourite book");
        cost = Double.parseDouble(JOptionPane.showInputDialog("Please enter the cost of your favourite book"));
        isbn = JOptionPane.showInputDialog("Please enter the isbn of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of pages of your favourite book"));

        Book favBook = new Book(name,cost,isbn,pages);

        output += String.format("\n\n%-25s%-9.2f%-15s%d\n",
                favBook.getName(),favBook.getCost(), favBook.getIsbn(),favBook.getPages());

        name = JOptionPane.showInputDialog("Please enter the name of your least favourite book");
        cost = Double.parseDouble(JOptionPane.showInputDialog("Please enter the cost of your least  favourite book"));
        isbn = JOptionPane.showInputDialog("Please enter the isbn of your least  favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of pages of your least  favourite book"));

        Book leastFavBook = new Book(name,cost,isbn,pages);


        output += String.format("\n\n%-25s%-9.2f%-15s%d\n",leastFavBook.getName(),leastFavBook.getCost(), leastFavBook.getIsbn(),leastFavBook.getPages());

        textArea.append(output);


        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }


}
