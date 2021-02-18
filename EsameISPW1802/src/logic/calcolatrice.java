package logic;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class calcolatrice {
	@FXML
	private AnchorPane pain;
	@FXML
	private Label risultato;
	@FXML
	private TextField primo;
	@FXML
	private TextField secondo;
	@FXML
	private Button addition;
	@FXML
	private Button difference;
	@FXML
	private Button division;
	@FXML
	private Button moltiplication;
	@FXML
	private Button radice;
	@FXML
	private Button logaritmo;
	private Boolean controllo(String a)
	{
		int c=0;
		for(int i=0;i<a.length();i++) {
			if( (a.charAt(i)<48 ||a.charAt(i)>57)  ) {
				if(a.charAt(i)!=44)
				{
					c=c+1;
				}
				else{return false;}
			}
			
		}
		if(c>1) return false;
		return true;
	}
	@FXML
	private void add() {
		res2.setVisible(false);
		if(this.primo.getText().isEmpty() || this.secondo.getText().isEmpty())
		{	
			risultato.setVisible(true);
			risultato.setText("Valori vuoti");
			return;
		}
		if(!controllo(this.primo.getText()) || !controllo(this.secondo.getText()) )
			return;
		Double p= Double.valueOf(this.primo.getText());
		Double s=Double.valueOf(this.secondo.getText());
		risultato.setVisible(true);
		risultato.setText(String.valueOf(p+s));
		
	}
	@FXML
	private void difference() {
		res2.setVisible(false);
		if(this.primo.getText().isEmpty() || this.secondo.getText().isEmpty())
		{	
			risultato.setVisible(true);
			risultato.setText("Valori vuoti");
			return;
		}
		if(!controllo(this.primo.getText()) || !controllo(this.secondo.getText()) )
			return;
		Double p= Double.valueOf(this.primo.getText());
		Double s=Double.valueOf(this.secondo.getText());
		risultato.setVisible(true);
		risultato.setText(String.valueOf(p-s));
		
	}
	@FXML
	private void molt() {
		res2.setVisible(false);
		if(this.primo.getText().isEmpty() || this.secondo.getText().isEmpty())
		{	
			risultato.setVisible(true);
			risultato.setText("Valori vuoti");
			return;
		}
		if(!controllo(this.primo.getText()) || !controllo(this.secondo.getText()) )
			return;
		Double p= Double.valueOf(this.primo.getText());
		Double s=Double.valueOf(this.secondo.getText());
		risultato.setVisible(true);
		risultato.setText(String.valueOf(p*s));
		
	}
	@FXML
	private void div() {
		res2.setVisible(false);
		if(this.primo.getText().isEmpty() || this.secondo.getText().isEmpty())
		{	
			risultato.setVisible(true);
			risultato.setText("Valori vuoti");
			return;
		}
		if(!controllo(this.primo.getText()) || !controllo(this.secondo.getText()) )
			return;
		Double p= Double.valueOf(this.primo.getText());
		Double s=Double.valueOf(this.secondo.getText());
		if(s==0) {
			risultato.setVisible(true);
			risultato.setText("nonsi pu� dividere per 0");
		}
		risultato.setVisible(true);
		risultato.setText(String.valueOf(p/s));
		
	}
	@FXML 
	private Label res2;
	@FXML
	private void log() {
		if(this.primo.getText().isEmpty())
		{	
			return;
		}
		if(!controllo(this.primo.getText()))
			return;
		Double p= Double.valueOf(this.primo.getText());
		if(p<=0) return;
		risultato.setVisible(true);
		risultato.setText(String.valueOf(Math.log(p)));
		
		if(this.secondo.getText().isEmpty())
		{	
			return;
		}
		if(!controllo(this.secondo.getText()))
			return;
		Double s=Double.valueOf(this.secondo.getText());
		if(s<=0) return;
		res2.setVisible(true);
		res2.setText(String.valueOf(Math.log(s)));	
	}
	@FXML
	private void square() {
		if(this.primo.getText().isEmpty())
		{	
			return;
		}
		if(!controllo(this.primo.getText()))
			return;
		Double p= Double.valueOf(this.primo.getText());
		if(p<0) return;
		risultato.setVisible(true);
		risultato.setText(String.valueOf(Math.sqrt(p)));
		
		if(this.secondo.getText().isEmpty())
		{	
			return;
		}
		if(!controllo(this.secondo.getText()))
			return;
		Double s=Double.valueOf(this.secondo.getText());
		if(s<=0) return;
		res2.setVisible(true);
		res2.setText(String.valueOf(Math.sqrt(s)));	
	}
	
}
