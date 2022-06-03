package chainOfResponsability;

public class HandlerData implements ISanatize{

    private ISanatize next;
    @Override
    public ShowData dataValidation(DataEntry data) {
        if(next != null){ return next.dataValidation(data);}
        String email=data.getDataEntrace().get("email");
        String numbers=data.getDataEntrace().get("numbers");
        String date=data.getDataEntrace().get("date");
        return new ShowData(email, numbers, date);
    }

    @Override
    public void setNext(ISanatize sanatize) { next = sanatize;}
}
