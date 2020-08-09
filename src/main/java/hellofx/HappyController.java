package hellofx;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class HappyController {

    @FXML
    private Button button;

    @FXML
    private ImageView image;

    @FXML
    private DatePicker date;

    @FXML
    private Text informUserText;
    
    @FXML
    private CheckBox checkEnhanced;
    
    @FXML
    private CheckBox blackWhite;
    
    @FXML
    void datePicked(ActionEvent event) {
    	String chosenDate = date.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    	if (chosenDate.compareTo("2018-06-30") <= 0) {
    		checkEnhanced.setDisable(false);
    		//System.out.println(checkEnhanced.isSelected() + "Older date than 2018-06-30 is chosen. Check box is enabled");
    	}
    	else {
    		checkEnhanced.setDisable(true);
    		//System.out.println(checkEnhanced.isSelected() + "Newer date after 2018-06-30 is chosen. Check box is disabled");
    	}
		checkEnhanced.setSelected(false);
    }
    
    @FXML
    void buttonPressed(ActionEvent event) {
    	
    	if (image != null) {
    		image.setEffect(null);
    	}
    	
    	informUserText.setText("Pick a date. Then click \"See Earth\"");
    	System.out.println("My first Java Fx program!");
    	BlueMarble b = new BlueMarble();
    	String chosenDate = date.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    	//System.out.println(chosenDate);
    	//String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    	//System.out.println(currentDate);
    	//System.out.println(chosenDate.compareTo(currentDate) > 0);
    	
    	b.setDate(chosenDate);
    	try {
    		
    		if (checkEnhanced.isSelected()) {
    			b.setEnhanced(true);
    		}
    		else {
    			b.setEnhanced(false);
    		}

    		InputStream im = b.getImage();
    		Image displayedImage = new Image(im);
    		
    		//ImageView displayedView = new ImageView(displayedImage);
   
    		image.setImage(displayedImage);

    		if (blackWhite.isSelected()) {
    			ColorAdjust makeBlackWhite = new ColorAdjust();
    			makeBlackWhite.setSaturation(-1);
    			image.setEffect(makeBlackWhite);
    		}
       	}
    	catch (Exception e) {
    		informUserText.setText("Please pick a valid date");
    		image.setImage(new Image("Assingment_Snapshot.png"));
    	}
    	//System.out.println("Done!");
    	
    }

}
