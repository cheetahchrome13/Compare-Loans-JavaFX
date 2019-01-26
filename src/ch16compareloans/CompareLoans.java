
package ch16compareloans;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
//import javafx.scene.text.TextFlow;

/**
 * Project: Compare Loans
 * Tasks: 1) Creates text fields for loan data input.
 *        2) Calculates and displays a table using loan data
 * @author Justin Mangan
 * Date: 6 March 2018
 */
public class CompareLoans extends Application{
    
    // Declared here for scope
    protected TextField loanAmt = new TextField();
    protected TextField numYears = new TextField();
    protected TextArea textArea = new TextArea();

    @Override // Override start() method 
    public void start(Stage primaryStage) {
        
        // Labels and txt field sizes
        Label amount = new Label("Loan Amount: $", loanAmt);
        amount.setContentDisplay(ContentDisplay.RIGHT);       
        Label years = new Label("Number of Years:", numYears);
        years.setContentDisplay(ContentDisplay.RIGHT);
        loanAmt.setPrefColumnCount(10);
        loanAmt.setStyle("-fx-text-fill: darkgreen;");
        numYears.setPrefColumnCount(2);
        numYears.setStyle("-fx-text-fill: firebrick;");   
        textArea.setPrefColumnCount(32);
        textArea.setPrefRowCount(24);
        textArea.setEditable(false);
        
        // Button and event handler
        Button calculate = new Button("Calculate");
        calculate.setStyle("-fx-background-color: lightsalmon;");
        calculate.setOnAction(e -> { calculateLoan(); });

        // Hbox for txt Fields/labels
        HBox topPane = new HBox(10);
        topPane.setAlignment(Pos.CENTER);
        topPane.setSpacing(28.0);
        topPane.setPadding(new Insets(14, 28, 14, 28));
        topPane.setStyle("-fx-font: 14px Courier;" + "-fx-font-weight: bold;");
        topPane.getChildren().addAll(amount, years, calculate);

        // ScrollPane for the loan table
        ScrollPane bottomPane = new ScrollPane(textArea);
        bottomPane.setPadding(new Insets(28));
        bottomPane.setStyle("-fx-font: 18px Courier;");

        // BorderPane for the other 2 panes
        BorderPane mainPane = new BorderPane();
        mainPane.setTop(topPane);
        mainPane.setBottom(bottomPane);
        
        // Scene/panes and stage
        Scene scene = new Scene(mainPane);
        primaryStage.setTitle("Loan Rate Calculator"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }

    private void calculateLoan() {
 
        double yrIntRate = 5.0;
        double moIntRate; 
        double moPayment;	
        
        // Strings to build table
        String hr = "-------------------------------------------"
                + "--------------------------------\n";
        String table = String.format("%-1s%34s%31s\n", "Interest Rate",
                "Monthly Payment", "Total Payment") + hr;
        
        // Add table data
        for (; yrIntRate <= 8; yrIntRate += 0.125) {
            moIntRate = yrIntRate / 1200;
            moPayment = Double.parseDouble(loanAmt.getText()) * 
                    moIntRate / (1 - 1 / Math.pow(1 + moIntRate,
                    Double.parseDouble(numYears.getText()) * 12));

            table += String.format("%-24.3f%26.2f%40.2f\n", yrIntRate, 
                    moPayment, (moPayment * 12) * 
                    Double.parseDouble(numYears.getText())) + hr;
        }
        
        // Display table data
        textArea.setText(table);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
