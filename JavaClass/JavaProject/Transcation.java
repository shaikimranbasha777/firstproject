package JavaClass.JavaProject;

import java.util.Date;

public class Transcation implements TranscationInterface {
    int transcationId;
    Date transcationDate;
    float transcationAmmount;
    String transcationType;
    float currentBal;

    @Override
    public void addTranscation(String transcationType, float amount, float currentBal) {
        this.transcationDate = new Date();
        this.transcationType = transcationType;
        this.transcationAmmount = amount;
        this.currentBal = currentBal;
    }
    
}
