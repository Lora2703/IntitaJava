package task1;

public class Choice {
    private Patient[] patients;

    public Choice(Patient[] patients){
        this.patients = patients;
    }

    public void choiceByDiagnose(String diagnose){
        for (Patient patient : patients){
            if(patient.getDiagnose().equals(diagnose)){
                System.out.println(patient.getName()+' '+patient.getSurname()+' '+patient.getAddress()+' '+patient.getDiagnose());
            }
        }
    }
    public void choiceByMedCard(int numberMedCardBegin, int numberMedCardEnd){
        for (Patient patient : patients){
            if((patient.getNumberMedCart() >= numberMedCardBegin)&(patient.getNumberMedCart() <= numberMedCardEnd)){
                System.out.println(patient.getName()+' '+patient.getSurname()+' '+patient.getAddress()+' '+patient.getNumberMedCart());
            }
        }
    }
}
