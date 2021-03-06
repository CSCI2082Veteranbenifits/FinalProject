package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;


public class UtilityGUI {


	/**
	 * Creates and formats a label to display questions.
	 * @return a label object.
	 */
	public static Label createQuestionLabel() {
		Label questionLabel = new Label();
		questionLabel.setStyle("-fx-font-family: Arial;" +
								"-fx-font-size: 24;" +
								"-fx-font-weight: bold;" +
								"-fx-text-fill: black");
		//questionLabel.setPadding(new Insets(10,10,10,10));
		questionLabel.setTextAlignment(TextAlignment.CENTER);
		questionLabel.setWrapText(true);
		return questionLabel;
	}

	/**
	 * Creates and formats a button for the user to answer questions.
	 * @param text the text to display in the button.
	 * @return a button object.
	 */
	public static Button createButton(String text) {
		Button newBtn = new Button(text);
		newBtn.setStyle("-fx-background-color: " + UtilityColors.centuryOrange() + ";" +
						"-fx-font-weight: bold;" +
						"-fx-text-fill: white;"  +
						"-fx-background-radius: 10;");
		newBtn.setOnMouseEntered(e -> newBtn.setStyle("-fx-background-color: " + UtilityColors.centuryOrange() + ";" +
				"-fx-font-weight: bold;" +
				"-fx-text-fill: black;"  +
				"-fx-background-radius: 10;"));
		newBtn.setOnMouseExited(e -> newBtn.setStyle("-fx-background-color: " + UtilityColors.centuryOrange() + ";" +
				"-fx-font-weight: bold;" +
				"-fx-text-fill: white;"  +
				"-fx-background-radius: 10;"));
		newBtn.setPrefHeight(100);
		newBtn.setPrefWidth(160);

		return newBtn;
	}

	/**
	 * Creates a null pane that can be used to add blank space on the GUI between nodes.
	 * @param width the width of the null pane.
	 * @param height the height of the null pane.
	 * @return a pane object.
	 */
	public static Pane createNullPane(double width, double height) {
		Pane nullPane = new Pane();
		nullPane.setPrefHeight(height);
		nullPane.setPrefWidth(width);

		return nullPane;
	}
}
