import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;


public class SwingP1{

    static HashSet<Integer> turns = new HashSet<>();

    static ArrayList<Character> track = new ArrayList();

    static JButton[][] arrayB = new JButton[3][3];

    public static void itsYourTurn(HashSet<Integer> turns){
        Random random = new Random();
        int i, j;
        while (true) {
            i = random.nextInt(3);
            j = random.nextInt(3);
            int idx = i * 3 + j;
            if (track.get(idx).equals('N')) {
                arrayB[i][j].setText("O");
                track.set(idx, 'Y');
                turns.add(idx);
                String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                break;
            }
        }
    }

    public static String checkWinner() {
        int[][] winPos = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // cols
            {0,4,8}, {2,4,6}           // diagonals
        };
    
        for (int[] pos : winPos) {
            String a = arrayB[pos[0]/3][pos[0]%3].getText();
            String b = arrayB[pos[1]/3][pos[1]%3].getText();
            String c = arrayB[pos[2]/3][pos[2]%3].getText();
    
            if (!a.isEmpty() && a.equals(b) && b.equals(c)) {
                return a; // "X" or "O" is the winner
            }
        }
    
        // If board full but no winner
        if (turns.size() == 9) {
            return "Draw";
        }
    
        return null; // game not finished
    }

    public static void showResult(String result) {
        if (result.equals("Draw")) {
            JOptionPane.showMessageDialog(null, "It's a Draw!");
        } else {
            JOptionPane.showMessageDialog(null, result + " Wins!");
        }
        System.exit(0); // close program after result
    }
    
    

    public static void main(String[] args) {
        
        JFrame f1 = new JFrame("Tic Tac Tow");
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setLayout(null);
        

        JLabel playGameLabel = new JLabel("Hurray! Lets Play the Game");
        playGameLabel.setBounds(50, 0, 200, 50);

        JLabel nameLabel= new JLabel("Name: ");
        nameLabel.setBounds(20, 50, 100, 50);

        JTextField jTextField = new JTextField("Enter you Name");
        jTextField.setBounds(120, 50, 150, 50);

        JButton button = new JButton("Start");
        button.setBounds(100, 200, 100, 50);

        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setBounds(90, 100, 150, 100);

        f1.add(playGameLabel);
        f1.add(nameLabel);
        f1.add(jTextField);
        f1.add(button);
        f1.add(welcomeLabel);

        

        JFrame f2 = new JFrame("Tic Tac Tow2");
        f2.setSize(300,300);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLayout(null);

        button.addActionListener((actionEvent) -> {
            String name = jTextField.getText();
            welcomeLabel.setText("Welcome "+ name +" !");
            f1.setVisible(false);
            f2.setVisible(true);
        });

        //grid
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(3, 3));

        grid.setBounds(20, 10, 250, 250); // position + size

        // (0,0) - (0,2)
        JButton jb1 = new JButton("");
        JButton jb2 = new JButton("");
        JButton jb3 = new JButton("");
        //(1,0) -(1,2)
        JButton jb4 = new JButton("");
        JButton jb5 = new JButton("");
        JButton jb6 = new JButton("");
        //(2,0) - (2,2)
        JButton jb7 = new JButton("");
        JButton jb8 = new JButton("");
        JButton jb9 = new JButton("");

        

        arrayB[0][0] = jb1; track.add('N');
        arrayB[0][1] = jb2; track.add('N');
        arrayB[0][2] = jb3; track.add('N');

        arrayB[1][0] = jb4; track.add('N');
        arrayB[1][1] = jb5; track.add('N');
        arrayB[1][2] = jb6;track.add('N');

        arrayB[2][0] = jb7; track.add('N');
        arrayB[2][1] = jb8; track.add('N');
        arrayB[2][2] = jb9; track.add('N');
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0;j<3;j++){
                grid.add(arrayB[i][j]);
            }
            
        }

        f2.add(grid);


        jb1.addActionListener((actionEvent) -> {
            if (jb1.getText().isEmpty()) {   // prevent overwrite
                jb1.setText("X");
                turns.add(0);
                track.set(0, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });

        jb2.addActionListener((actionEvent) -> {
            if (jb2.getText().isEmpty()) {   // prevent overwrite
                jb2.setText("X");
                turns.add(1);
                track.set(1, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });

        jb3.addActionListener((actionEvent) -> {
            if (jb3.getText().isEmpty()) {   // prevent overwrite
                jb3.setText("X");
                turns.add(2);
                track.set(2, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });

        jb4.addActionListener((actionEvent) -> {
            if (jb4.getText().isEmpty()) {   // prevent overwrite
                jb4.setText("X");
                turns.add(3);
                track.set(3, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });

        jb5.addActionListener((actionEvent) -> {
            if (jb5.getText().isEmpty()) {   // prevent overwrite
                jb5.setText("X");
                turns.add(4);
                track.set(4, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });

        jb6.addActionListener((actionEvent) -> {
            if (jb6.getText().isEmpty()) {   // prevent overwrite
                jb6.setText("X");
                turns.add(5);
                track.set(5, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });

        jb7.addActionListener((actionEvent) -> {
            if (jb7.getText().isEmpty()) {   // prevent overwrite
                jb7.setText("X");
                turns.add(6);
                track.set(6, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });

        jb8.addActionListener((actionEvent) -> {
            if (jb8.getText().isEmpty()) {   // prevent overwrite
                jb8.setText("X");
                turns.add(7);
                track.set(7, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });

        jb9.addActionListener((actionEvent) -> {
            if (jb9.getText().isEmpty()) {   // prevent overwrite
                jb9.setText("X");
                turns.add(8);
                track.set(8, 'Y');
                if (turns.size() < 9) {
                    itsYourTurn(turns);
                    String result = checkWinner();
                    if (result != null) {
                        showResult(result);
                        return;
                    }
                }
            }
        });


        f1.setVisible(true);    

    }
}