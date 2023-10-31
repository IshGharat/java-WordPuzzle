import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Puzzle {

	private JFrame frame;

    String[] level1List = {"fox", "son", "fit", "for", "sip", "rot", "tin", "off", "fin", "zit",
    "dig", "eel", "out", "hit", "hut", "kit", "lit", "wet", "two", "zoo",
    "bar", "big", "bit", "jar", "car", "sec", "vet", "eve", "not", "ace",
    "sea"};

    String[] level2List = {"moon", "tilt", "love", "warm", "teen", "grow", "will", "kilt", "claw",
        "loot", "itch", "like", "ripe", "pipe", "lock", "dock", "heat", "seat",
        "deed", "dead", "doll", "seed", "deer", "neat", "teen", "seen", "dome",
        "come", "kiss", "lend", "flow"};

    String[] level3List = {"meter", "drone", "frown", "water", "throw", "thank", "route", "queen",
        "spoon", "flank", "sweep", "clone", "fever", "river", "teach", "reach",
        "wheel", "while", "would", "ditch", "groin", "wrong", "quick", "quest",
        "guest"};

    String[] level4List = {"needle", "pencil", "winner", "flight", "stolen", "google", "bottom",
        "cotton", "mellow", "yellow", "beyond", "client", "column", "energy",
        "expert", "factor", "fabric", "foster", "happen", "guilty", "legacy",
        "league", "motion", "lotion", "museum", "normal", "policy", "planet",
        "peanut", "secure", "speech", "twelve", "unique", "valley", "wonder"};

    String[] level5List = {"jacuzzi", "buzzsaw", "assault", "default", "article", "battery", "caliber",
        "journey", "leisure", "receipt", "confirm", "complex", "develop", "edition",
        "element", "feature", "healthy", "highway", "kitchen", "kingdom", "library",
        "organic", "overall", "pioneer", "poverty", "quality", "release", "supreme",
        "teacher", "therapy", "whether"};

    String[] level6List = {"absolute", "alliance", "campaign", "dominant", "currency", "imperial",
        "indicate", "mountain", "physical", "petition", "aluminum", "moderate",
        "maintain", "leverage", "interact", "portrait", "positive", "security",
        "remember", "separate", "suitable", "syndrome", "spectrum", "warranty",
        "withdraw", "violence", "vertical", "romantic", "personal", "delivery",
        "disposal", "birthday"};

    String[] level7List = {"celebrate", "christmas", "beautiful", "president", "knowledge", "halloween",
        "ambulance", "secretary", "vegetable", "nutrition", "crocodile", "wednesday",
        "christian", "challenge", "identical", "pineapple", "pollution", "structure",
        "education", "architect", "breakfast", "delicious", "xylophone", "saxophone",
        "celebrity", "attention", "chemistry", "treatment", "agreement", "necessary"};

    String[] level8List = {"coderunner", "investment", "literature", "technology", "relaxation",
        "government", "television", "restaurant", "helicopter", "revolution",
        "understand", "skateboard", "everything", "basketball", "friendship",
        "adaptation", "apocalypse", "generation", "leadership", "wilderness",
        "management", "accountant", "earthquake", "innovation", "illuminati",
        "expression", "resolution", "protection", "gymnastics", "elementary",
        "instrument", "conference", "accomplish", "accelerate", "difference",
        "concussion", "dictionary", "invincible", "graduation", "combustion",
        "connection", "experiment", "apprentice"};


	public ArrayList<String> level1 = new ArrayList<>(Arrays.asList(level1List));
    public ArrayList<String> level2 = new ArrayList<>(Arrays.asList(level2List));
    public ArrayList<String> level3 = new ArrayList<>(Arrays.asList(level3List));
    public ArrayList<String> level4 = new ArrayList<>(Arrays.asList(level4List));
    public ArrayList<String> level5 = new ArrayList<>(Arrays.asList(level5List));
    public ArrayList<String> level6 = new ArrayList<>(Arrays.asList(level6List));
    public ArrayList<String> level7 = new ArrayList<>(Arrays.asList(level7List));
    public ArrayList<String> level8 = new ArrayList<>(Arrays.asList(level8List));

    public ArrayList<ArrayList<String>> allLevels= new ArrayList<ArrayList<String>>(
        Arrays.asList(level1, level2, level3, level4, level5, level6, level7, level8));

    
    int count=0,currentLevel=0,currentScore=0,skipNumber=3,sec=120;
    String original="";
    JLabel currentLabel;
    private JTextField userInput;
    JButton enterBtn;
    private JButton skipBtn;
    JLabel scoreLabel;
    private JLabel timer;
    Timer t;
    private JButton startBtn;
    private JButton resetBtn;
    JLabel levelNumber;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle window = new Puzzle();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Puzzle() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
        frame.setTitle("CodeRunner Word Puzzle");
        frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        frame.getContentPane().add(panel,BorderLayout.CENTER);

        currentLabel =new JLabel("");
        currentLabel.setFont(new Font("Tahoma",Font.BOLD,16));
        
        userInput = new JTextField();
        userInput.setEnabled(false);
        userInput.setColumns(10);
        
        enterBtn = new JButton("Enter");
        enterBtn.setEnabled(false);
        enterBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(userInput.getText().contentEquals(original)) {
        			updateScore();
        			playGame();
        			userInput.setText("");
        			levelCounter();
        			userInput.requestFocusInWindow();
        		}
        	}
        });
        
        skipBtn = new JButton("SKIP");
        skipBtn.setText("SKIP ("+skipNumber+")");
        skipBtn.setEnabled(false);
        skipBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(skipNumber!=0) {
        			playGame();
        			skipNumber--;
        			skipBtn.setText("SKIP ("+skipNumber+")");
        			levelCounter();
        			userInput.requestFocusInWindow();
        			frame.getRootPane().setDefaultButton(enterBtn);
                    if(skipNumber==0){
                        skipBtn.setEnabled(false);
                    }
        		}
        	}
        });
        
        scoreLabel = new JLabel("Score: "+currentScore);
        
        timer = new JLabel("Time left: "+ sec);
        
        startBtn = new JButton("Start");
        startBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		time();
                resetBtn.setEnabled(true);
        		enterBtn.setEnabled(true);
        		userInput.setEnabled(true);
        		skipBtn.setEnabled(true);
        		startBtn.setEnabled(false);
        		frame.getRootPane().setDefaultButton(enterBtn);
        		userInput.requestFocusInWindow();
        		}
        });
        
        resetBtn = new JButton("Reset");
        resetBtn.setEnabled(false);
        resetBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		resetGame();
        	}
        });
        
        levelNumber = new JLabel("Level: "+(currentLevel+1));
        levelNumber.setHorizontalAlignment(SwingConstants.CENTER);
        levelNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
        GroupLayout gl_panel=new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGap(188)
        					.addComponent(enterBtn))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGap(174)
        					.addComponent(userInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(174, Short.MAX_VALUE))
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
        					.addGap(189)
        					.addComponent(startBtn)
        					.addGap(88))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGap(22)
        					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(resetBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(timer, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(levelNumber)
        					.addGap(85)))
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(scoreLabel)
        				.addComponent(skipBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(29))
        		.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
        			.addGap(206)
        			.addComponent(currentLabel)
        			.addContainerGap(206, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGap(26)
        					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        						.addComponent(scoreLabel)
        						.addComponent(timer))
        					.addGap(18))
        				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
        					.addContainerGap(26, Short.MAX_VALUE)
        					.addComponent(levelNumber)
        					.addGap(18)))
        			.addComponent(currentLabel)
        			.addGap(11)
        			.addComponent(userInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(11)
        			.addComponent(enterBtn)
        			.addGap(18)
        			.addComponent(startBtn)
        			.addGap(32)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(skipBtn)
        				.addComponent(resetBtn))
        			.addGap(22))
        );
        
        panel.setLayout(gl_panel);
        frame.setVisible(true);

        playGame();



	}
    public void levelCounter(){
        count++;
        if(count%9==0){
            count=0;
            currentLevel++;
            levelNumber.setText("Level: "+(currentLevel+1));
        }
    }
    public String selectRandomWord(){
        ArrayList<String> input=allLevels.get(currentLevel);
        Random r=new Random();
        int randomNumber=r.nextInt(input.size());

        String output=input.get(randomNumber);
        input.remove(randomNumber);
        return output;
    }

    public String jumble(String original){
        int wordSize=original.length();
        int jumbleCount=10;
        while(jumbleCount>0){
            jumbleCount--;
            int index1=ThreadLocalRandom.current().nextInt(0,wordSize);
            int index2=ThreadLocalRandom.current().nextInt(0,wordSize);
            original=swapIndex(original,index1,index2);
        }
        return original;
    }

    public String swapIndex(String word, int index1, int index2){
        char[] charArray=word.toCharArray();
        char temp=charArray[index1];
        charArray[index1]=charArray[index2];
        charArray[index2]=temp;

        return new String(charArray);
    }

    public void playGame(){
        original=selectRandomWord();
        String jumbledWord=jumble(original);

        while(jumbledWord.equals(original)){
            jumbledWord=jumble(original);
        }
        currentLabel.setText(jumbledWord);
    }
    
    public void updateScore() {
    	currentScore++;
    	scoreLabel.setText("Score: "+currentScore);
    }
    public void time() {
    	t=new Timer(1000, new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			if(sec==0) {
    				t.stop();
    				JOptionPane.showMessageDialog(null,"GAMEOVER!!"+"\n"+"Your final score: "+currentScore,"CodeRunner", JOptionPane.INFORMATION_MESSAGE);
    				userInput.setEnabled(false);
    				enterBtn.setEnabled(false);
    				skipBtn.setEnabled(false);
                    timer.setText("Time: "+sec);
                    resetGame();
    			}else{
                    sec--;
                    timer.setText("Time: "+sec);
                }
    		}
    	});
    	t.start();
    }
    public void resetGame() {
    	for(int i=0;i<allLevels.size();i++) {
    		allLevels.get(i);
    	}
    	level1 = new ArrayList<>(Arrays.asList(level1List));
        level2 = new ArrayList<>(Arrays.asList(level2List));
        level3 = new ArrayList<>(Arrays.asList(level3List));
        level4 = new ArrayList<>(Arrays.asList(level4List));
        level5 = new ArrayList<>(Arrays.asList(level5List));
        level6 = new ArrayList<>(Arrays.asList(level6List));
        level7 = new ArrayList<>(Arrays.asList(level7List));
        level8 = new ArrayList<>(Arrays.asList(level8List));
        count=0;
        currentLevel=0;
        currentScore=0;
        original="";
        skipNumber=3;
        t.stop();
        sec=120;
        skipBtn.setText("SKIP("+skipNumber+")");
        timer.setText("Time: "+sec);
        scoreLabel.setText("Score: "+currentScore);
        levelNumber.setText("Level: "+(currentLevel+1));
        userInput.setEnabled(false);
        enterBtn.setEnabled(false);
        startBtn.setEnabled(true);
        skipBtn.setEnabled(false);
        
        frame.getRootPane().setDefaultButton(startBtn);
        userInput.requestFocusInWindow();
        playGame();
        		

    }
}
